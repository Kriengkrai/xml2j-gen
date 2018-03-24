<?xml version="1.0" encoding="utf-8"?>
<!-- 
/********************************************************************************
Copyright 2016, 2017 Lolke B. Dijkstra

Permission is hereby granted, free of charge, to any person obtaining a copy of 
this software and associated documentation files (the "Software"), to deal in the
Software without restriction, including without limitation the rights to use, 
copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the 
Software, and to permit persons to whom the Software is furnished to do so, 
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all 
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION 
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Project root: https://sourceforge.net/projects/xml2j/
********************************************************************************/
-->
<!-- 
*******************************************************************************
	module: 		step2 (2/5)
	purpose:		conversion of schema file to intermediate xml file
	
	version:		2.4.1
	
	changelog:
		support for
		- anonymous type definitions (generates unique type based on 
			element/@name + 'Type_' + unique key)
		- empty complex types (full and shorthand)
		
	not supported:
		xsd:union, xsd:list	
					
*******************************************************************************
-->

<xsl:stylesheet version="1.1"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
  elementFormDefault="qualified">


<xsl:key name="k-element" match="xsd:element" use="@name"/>
<xsl:key name="k-ctype" match="xsd:complexType" use="@name"/>
<xsl:key name="k-stype" match="xsd:simpleType" use="@name"/>
<xsl:key name="k-group" match="xsd:group" use="@name"/>
 
<!-- input -->
<xsl:param name="import" select="'com.ldx.xml.core'"/>
<xsl:param name="package-name" select="'com.ldx.default'" />
<xsl:param name="module-name" select="'default'" />


<!-- global variables -->
<xsl:variable name="lowercase" select="'abcdefghijklmnopqrstuvwxyz'"/> 
<xsl:variable name="uppercase" select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ'"/> 

<!-- document containing types -->
<xsl:output method='xml' version='1.0' encoding='utf-8' indent='yes'/>
<xsl:strip-space elements="*" />


<!-- 
	handles the element declarations
-->
<xsl:template match="xsd:element">
	<!-- 
		gType: @type or generated name
			if anonymous generate typename 
			the base is @name which can be the same in different contexts
			this is solved by adding an ID
			
			if ref use @type of referenced element, but if that one is anonymous
			use generated typename
	-->
	<xsl:variable name="typeName">
		<xsl:choose>
			<xsl:when test="xsd:complexType | xsd:simpleType">
				<!-- anonymous => generate unique name -->
				<xsl:variable name="gID" select="generate-id(@name)"/>
				<xsl:value-of select="concat(@name, 'Type','_', $gID)"/>
			</xsl:when>	
			<xsl:otherwise>
 				<xsl:choose> 
	 				<xsl:when test="@ref">
	 					<!-- if reference to element -> take type of element -->
 						<xsl:variable name="lname" select="@ref"/>
 						<xsl:variable name="lelement" select="/xsd:schema/xsd:element[@name=$lname]"/>
 						<xsl:choose> 
 							<xsl:when test="$lelement/xsd:complexType | $lelement/xsd:simpleType">
 							<!-- if anonymous -> generate typename and use that -->
 								<xsl:variable name="gID" select="generate-id($lelement/@name)"/>
								<xsl:value-of select="concat($lelement/@name, 'Type','_', $gID)"/>
 							</xsl:when>
 							<xsl:otherwise> 
 							<!-- else just use the typename -->
 								<xsl:value-of select="$lelement/@type"/>
 							</xsl:otherwise>
 						</xsl:choose>
					</xsl:when>
					<xsl:otherwise>	
						<!-- if not reference -> just take type -->		
						<xsl:value-of select="@type"/>
					</xsl:otherwise>			
				</xsl:choose>	
			</xsl:otherwise>
		</xsl:choose>	
	</xsl:variable>
	
	<!--
		isMulti:
	-->
	<xsl:variable 
		name="isMulti1"
		select="ancestor-or-self::*[number(@maxOccurs) > 1 or @maxOccurs = 'unbounded' or parent::xsd:complexType][1]"/>
	<xsl:variable 
		name="isMulti" 
		select="boolean(number($isMulti1/@maxOccurs)>1 or $isMulti1/@maxOccurs='unbounded')"/>

	<!--
		name
		- if it references a type use @ref else @name
	-->
	<xsl:variable name="lname">
	 	<xsl:choose> 
		 	<xsl:when test="@ref">
 				<xsl:value-of select="@ref"/>
			</xsl:when>
			<xsl:otherwise>			
				<xsl:value-of select="@name"/>
			</xsl:otherwise>			
		</xsl:choose>	
	</xsl:variable>
	
	<!-- and add declarations for elements that can substitute this one do so recursively -->
	<xsl:if test="@ref">
 		<xsl:call-template name="subtypes">
 			<xsl:with-param name="parentType" select="@ref"/>
 			<xsl:with-param name="rootType" select="@ref"/>
 		</xsl:call-template>
 	</xsl:if>					

	<!--
		isSubst:
	-->
	<xsl:variable name="isSubst" 
		select="boolean(@substitutionGroup)"/>	

	
	<!-- this finally outputs the element -->
	<xsl:choose>
	<xsl:when test="$isSubst">
		<element name="{$lname}" type="{$typeName}" extends="{@substitutionGroup}" />
	</xsl:when>
	<xsl:otherwise>
		<element name="{$lname}" type="{$typeName}" ismulti="{$isMulti}"/>
	</xsl:otherwise>
	</xsl:choose>
	
</xsl:template>

<!--
	insert the subtypes if any
-->
<xsl:template name="subtypes">
	<xsl:param name="parentType"/>
	<xsl:param name="rootType"/>
	
	<xsl:variable name="substitutes" select="/xsd:schema/xsd:element[@substitutionGroup=$parentType]"/>
 	<xsl:for-each select="$substitutes">
 		<xsl:call-template name="subtypes">
 			<xsl:with-param name="parentType" select="@name"/>
 			<xsl:with-param name="rootType" select="$rootType"/>
 		</xsl:call-template>
 		
 		<xsl:variable name="ltype">
 			<xsl:choose> 
 				<xsl:when test="xsd:complexType | xsd:simpleType">
 				<!-- if anonymous -> generate typename and use that -->
 					<xsl:variable name="gID" select="generate-id(@name)"/>
					<xsl:value-of select="concat(@name, 'Type','_', $gID)"/>
 				</xsl:when>
 				<xsl:otherwise> 
 				<!-- else just use the typename -->
 					<xsl:value-of select="@type"/>
 				</xsl:otherwise>
 			</xsl:choose>
 		</xsl:variable> 		

		<element name="{@name}" type="{$ltype}" substitutes="{$rootType}" extends="{$parentType}" /> 			
 	</xsl:for-each>
</xsl:template>

<!-- 
	handles the implicit type definitions
-->
<xsl:template match="xsd:element" mode="type">
	<xsl:apply-templates select="xsd:complexType" />
	<xsl:apply-templates select="xsd:simpleType" />
</xsl:template>
 
<!-- 
	handles the attribute declarations for a type
-->
 <xsl:template match="xsd:attribute">
 	<xsl:choose>		
 		<xsl:when test="@name">
		<attribute 
			name="{@name}" type="{@type}" />
		</xsl:when>
 		<xsl:when test="@ref">
 			<xsl:variable name="lname" select="@ref"/>
 			<xsl:variable name="ltype" select="/xsd:schema/xsd:attribute[@name=$lname]/@type"/>
		<attribute 
			name="{@name}" type="{$ltype}" />
		</xsl:when>
 	</xsl:choose>		
 </xsl:template>
 
<!-- 
	handles the attribute group
-->
<xsl:template match="xsd:attributeGroup">
	<xsl:variable name="lref" select="@ref"/>
	<xsl:variable name="aGrp" select="/xsd:schema/xsd:attributeGroup[@name=$lref]"/>
	
	<xsl:apply-templates select="$aGrp/*" />	
</xsl:template>
 
 
<!--
	create list of attributes
-->
<xsl:template name="attributeList">
	<xsl:apply-templates select="xsd:attribute | xsd:attributeGroup" />
</xsl:template>




<!--
	outputs the elements
-->
<xsl:template match="xsd:sequence | xsd:choice | xsd:all">
	<xsl:apply-templates select="*" />
</xsl:template>



<!-- 
	adds additional definitions for a type 				 
-->
<xsl:template match="xsd:extension" mode="simple">
	<xsl:variable name="typeName" select="@base"/>
	<!-- base of extension is complex? -->
	<xsl:variable name="isSimple" select="boolean(/xsd:schema/xsd:simpleType[@name=$typeName]/@name)"/>

	<xsl:if test="$isSimple">
		<extends type="{@base}"/>
	</xsl:if>
	<xsl:call-template name="attributeList"/>
</xsl:template>

<!-- 
	restricts base type				 
	the definitions are ignored except when base is anyType
-->
<xsl:template match="xsd:restriction" mode="simple" />

<!-- 
	adds additional definitions for a type 				 
-->
<xsl:template match="xsd:extension" mode="complex">
	<xsl:variable name="typeName" select="@base"/>
	<!-- base of extension is complex? -->
	<xsl:variable name="isComplex" select="boolean(/xsd:schema/xsd:complexType[@name=$typeName]/@name)"/>

	<xsl:if test="$isComplex">
		<extends type="{@base}"/>
		<xsl:call-template name="attributeList"/>
		<xsl:apply-templates select="xsd:group | xsd:all | xsd:choice | xsd:sequence" />
	</xsl:if>
</xsl:template>

<!-- 
	restricts base type				 
	
	the definitions are ignored except when base is anyType
	this is because it is mapped onto inheritance in the target
	language and target languages do not know restrictive inheritance
	
	the exception is when the parent type is anyType in that case only
	the definitions in the restriction are mapped onto the type.
-->
<xsl:template match="xsd:restriction" mode="complex">
	<xsl:variable name="lbase" select="@base"/>
	<xsl:choose>
	<xsl:when test="not(boolean(/xsd:schema/xsd:complexType[@name=$lbase]/@name))">
		<!-- base is anyType -->
		<xsl:call-template name="attributeList"/>
		<xsl:apply-templates select="xsd:group | xsd:all | xsd:choice | xsd:sequence"/>
	</xsl:when>
	<xsl:otherwise>
		<!-- base is complexType -->
		<extends type="{@base}"/>
	</xsl:otherwise>
	</xsl:choose>
</xsl:template>


<xsl:template match="xsd:complexContent">
	<xsl:apply-templates select="xsd:extension" mode="complex" />
	<xsl:apply-templates select="xsd:restriction" mode="complex" />
</xsl:template>

<xsl:template match="xsd:simpleContent">
	<xsl:apply-templates select="xsd:extension" mode="simple" />
	<xsl:apply-templates select="xsd:restriction" mode="simple" />
</xsl:template>



<!-- 
	creates explicit complexType definition
-->
<xsl:template match="xsd:complexType">
	<!-- set the typeName -->
	<xsl:variable name="typeName">
	<xsl:choose>
		<!-- this is a named type -->
		<xsl:when test="@name">
			<xsl:value-of select="@name" />
		</xsl:when>	
		<xsl:otherwise>
			<!-- anonymous witin element => generate unique name -->
			<xsl:variable name="lName" select="../@name"/>
			<xsl:variable name="gID" select="generate-id($lName)"/>
			<xsl:value-of select="concat($lName, 'Type','_', $gID)"/>
		</xsl:otherwise>
	</xsl:choose>
	</xsl:variable>
	
	<!-- generate the complexType definition -->
	<xsl:variable name="complexType">
	<complexType
		type='{$typeName}' package='{$package-name}'>
		<xsl:call-template name="attributeList" />
		<!-- shorthand definition -->
		<xsl:apply-templates select="xsd:group | xsd:all | xsd:choice | xsd:sequence" />
		<!-- normal definition -->
		<xsl:apply-templates select="xsd:complexContent | xsd:simpleContent" />
	</complexType>
	</xsl:variable>
	
	<!-- copy complexType to output -->
	<xsl:copy-of select="$complexType" />	
	
	<!-- now recursively generate types for implicit types within complexType -->
	<xsl:apply-templates select="*/xsd:element" mode="type" />
</xsl:template>


<!-- 
	creates explicit simpleType definition
-->
<xsl:template match="xsd:simpleType">
	<xsl:variable name="typeName">
	<xsl:choose>
		<!-- this is a named type -->
		<xsl:when test='@name'>
			<xsl:value-of select='@name' />
		</xsl:when>	
		<xsl:otherwise>
			<!-- anonymous => generate unique name -->
			<xsl:variable name="lName" select="../@name"/>
			<xsl:variable name="gID" select="generate-id($lName)"/>
			<xsl:value-of select="concat($lName, 'Type','_', $gID)"/>
		</xsl:otherwise>
	</xsl:choose>
	</xsl:variable>

	<xsl:variable name="simpleType">
	<simpleType
		type='{$typeName}' package='{$package-name}' base='{xsd:restriction/@base}' />
	</xsl:variable>

	<xsl:copy-of select="$simpleType" />		
</xsl:template>



<!--
	group reference
-->
<xsl:template match="xsd:group">
	<xsl:variable name="lref" select="@ref"/>
	<xsl:variable name="lgrp" select="/xsd:schema/xsd:group[@name=$lref]"/>
	
	<!-- check multiplicity by going backwards up the ancestor branch -->
	<xsl:variable 
		name="isMulti1"
		select="ancestor-or-self::*[number(@maxOccurs) > 1 or @maxOccurs = 'unbounded' or parent::xsd:complexType][1]"/>
	<xsl:variable 
		name="isMulti" 
		select="boolean(number($isMulti1/@maxOccurs)>1 or $isMulti1/@maxOccurs='unbounded')"/>
	
	<xsl:choose>
		<xsl:when test="boolean($isMulti)">
		<group name='{$lref}' ismulti='true'>
			<xsl:apply-templates select="$lgrp/*"/>
		</group>	
		</xsl:when>
		<xsl:otherwise>
			<xsl:apply-templates select="$lgrp/*"/>
		</xsl:otherwise>
	</xsl:choose>	
	
</xsl:template>


<!-- 
	name: import 
	NOT SUPPORTED (NAMESPACES)
-->
<xsl:template match="xsd:import">
	<!-- not supported yet -->
</xsl:template>


<!--
	generate elements in output	
-->
<xsl:template name="elements">

	<xsl:apply-templates select="xsd:element[generate-id() = generate-id(key('k-element', @name)[1])]">
		<xsl:sort select="@name"/>
	</xsl:apply-templates>

</xsl:template>

<!--
	generate types in output
-->
<xsl:template name="types">
	<!-- 
		generate types for complex and simple types 
		copy types from the source (schema)
	-->
	<xsl:apply-templates select="xsd:complexType[generate-id() = generate-id(key('k-ctype', @name)[1])]">
		<xsl:sort select="@name"/>
	</xsl:apply-templates>

	<xsl:apply-templates select="xsd:simpleType[generate-id() = generate-id(key('k-stype', @name)[1])]">
		<xsl:sort select="@name"/>
	</xsl:apply-templates>
	
	<!-- 
		generate types for complex and simple anonymous types 
		converts anonymous types to explicit types
	-->
	<xsl:apply-templates select="xsd:element[generate-id() = generate-id(key('k-element', @name)[1])]" mode="type">
		<xsl:sort select="@name"/>
	</xsl:apply-templates>

</xsl:template>

<!-- 
	extract types from schema
-->
<xsl:template match="xsd:schema" mode="types">
	<xsl:call-template name="types"/>
</xsl:template>

<!-- 
	extract elements from schema
-->
<xsl:template match="xsd:schema" mode="elements">
	<xsl:call-template name="elements"/>
</xsl:template>


<!-- 
	MAIN PROGRAM 
-->
<xsl:template match="/">
	<root
		module="{$module-name}">

	<elements>
		<xsl:apply-templates select="xsd:schema" mode="elements"/>
	</elements>

	<types>
		<xsl:apply-templates select="xsd:schema" mode="types"/>
	</types>
	</root>	
</xsl:template>

</xsl:stylesheet>
