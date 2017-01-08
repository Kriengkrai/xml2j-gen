<?xml version="1.0" encoding="utf-8"?>
<!-- 
/********************************************************************************
Copyright 2016 Lolke B. Dijkstra

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
	module: 		step3 (3/4)
	purpose:		adding @base to intermediate file
					embedding elements within elementList
					embedding attributes within attributeList

	version:		2.4				
*******************************************************************************
-->

<xsl:stylesheet version="1.1"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:xsd="http://www.w3.org/2001/XMLSchema"   
  elementFormDefault="qualified">
 
<xsl:key name="k1" match="element" use="@name"/>
    
<!-- root element name for message handler -->
<xsl:param name="message-handler-root" select="''" />
<!-- name for message handler class -->
<xsl:param name="message-handler-name" select="''" />
<!-- the package in which the messagehandler class is generated -->
<xsl:param name="message-handler-package" select="''" />
<!-- 
	optional rename for root-type and root-type-handler 
	
	this is useful when types are reused between interfaces
	as is the case with sepa:pain/pacs (type Document is reused)
	this option enables the rename of Document in something more distinguishing
-->
<xsl:param name="root-type-rename" />

<!-- document containing types -->
<xsl:output method='xml' version='1.0' encoding='utf-8' indent='yes'/>
<xsl:strip-space elements="*" />


<!-- 
	name: element 
	handles the element declarations
-->
<xsl:template match="element">
	<!-- locals -->
	<xsl:variable name="ltype" select="@type"/>	
	
	<!-- 
		baseType:
			gets value of 
			- either implicit or explicit simple base type of denoted type
			- or built-in type
	-->	
	<xsl:variable name="baseType">	
		<xsl:choose>
			<xsl:when test="/root/types/complexType[@type=$ltype]">
				<xsl:value-of select="'complex'"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="'simple'"/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>		

	<xsl:variable name="ltype2">
		<xsl:call-template name="get-type">
			<xsl:with-param name="ptype" select="@type"/>
		</xsl:call-template>	
	</xsl:variable>
	

	<!-- this finally outputs the element element -->
	<xsl:choose>
		<xsl:when test="@ismulti">
			<element name="{@name}" type="{$ltype2}" ismulti="{@ismulti}" base="{$baseType}"/>
		</xsl:when>
		<xsl:when test="@substitutes">
			<element name="{@name}" type="{$ltype2}" substitutes="{@substitutes}" extends="{@extends}" base="{$baseType}"/>
		</xsl:when>
		<xsl:otherwise>
			<element name="{@name}" type="{$ltype2}" base="{$baseType}"/>
		</xsl:otherwise>
	</xsl:choose>
		
</xsl:template>

<!-- 
	name: attribute 
	handles the attribute declarations
-->
<xsl:template match="attribute">
	<xsl:copy-of select="."/>
</xsl:template>

<!-- 
	name: get-type 
	
	input: $ptype = input type
	output: $ltype	
	
	if $root-type-rename was set 
	and $ptype equals root-element/@type 
		$ltype = $root-type-rename
	else
		$ltype = $ptype
-->
<xsl:template name="get-type">
	<xsl:param name="ptype"/>
	
	<xsl:variable name="ltype">
		<xsl:choose>
			<xsl:when test="$root-type-rename and /root/elements/element[@name=$message-handler-root]/@type=$ptype">
				<xsl:value-of select="$root-type-rename"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="$ptype"/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
	<xsl:value-of select="$ltype"/>
</xsl:template>

<!--
	this is to guarantee unique sequentially numbered names 
	input should be alphabetically ordered
	
	e.g. 
	in	{ A, A, B, C, C, D, D, E } 
	out	{ A1, A2, B, C1, C2, D1, D2, E }
-->
<xsl:template name="get-children">
<xsl:param name="gc-elements"/>
<!--
      <xsl:for-each select="$gc-elements[generate-id() = generate-id(key('k1', @name)[1])]">
        <xsl:variable name="current-group" select="key('k1', @name)"/>
        <xsl:choose>
          <xsl:when test="count($current-group)&gt; 1">
            <xsl:for-each select="$current-group">
              <element name="{@name}{position()}" type="{@type}" ismulti="{@ismulti}" base="{@base}"/>
            </xsl:for-each>
          </xsl:when>
          <xsl:otherwise>
            <xsl:copy-of select="."/>
          </xsl:otherwise>
        </xsl:choose>
      </xsl:for-each>
-->
      <xsl:for-each select="$gc-elements">
            <xsl:copy-of select="."/>
      </xsl:for-each>
	
</xsl:template>


<!--
	propagating the ismulti from group down to element
	@type|@name|
-->
<xsl:template match="group/element">

	<xsl:variable name="tmp-e">
  		<xsl:copy>
			<xsl:copy-of select="@*"/>
			<!-- overwrite the ismulti attribute with value from parent -->
    		<xsl:copy-of select="../@ismulti"/>
		</xsl:copy>
	</xsl:variable>

	<xsl:apply-templates select="$tmp-e/element" />
</xsl:template>


<!-- 
	name: complexType 
	handles the complexType definitions
-->
<xsl:template match="complexType | groupType">

 	<xsl:variable name="children"> 	
		<xsl:if test="element | group">
			<elementList>
				
			<!-- 
				eliminate encompassing group 
				propagate @ismulti to contained elements 
				sort elements by name
			-->	
			
			<xsl:variable name="children2">
				<xsl:apply-templates select="group/element | element">				
<!--
				<xsl:sort select="@name"/>
-->				</xsl:apply-templates>
			</xsl:variable>

			<!-- guarantee unique sequentially numbered names -->
	
			<xsl:call-template name="get-children">
				<xsl:with-param name="gc-elements" select="$children2/element"/>
			</xsl:call-template>
		
			
<!--
			<xsl:copy-of select="$children2"/>
-->			
			</elementList>	
		</xsl:if>	
	</xsl:variable>	
	
	
	<xsl:variable name="attributes">	
		<xsl:if test="attribute">
			<attributeList>
				<xsl:apply-templates select="attribute"/>
			</attributeList>
		</xsl:if>	
	</xsl:variable>	


	<xsl:variable name="ltype">
		<xsl:call-template name="get-type">
			<xsl:with-param name="ptype" select="@type"/>
		</xsl:call-template>	
	</xsl:variable>


	<xsl:choose>
		<xsl:when test="extends">
			<xsl:variable name="root">
				<xsl:call-template name="get-root">
					<xsl:with-param name="gr-type" select="extends/@type"/>
				</xsl:call-template>	
			</xsl:variable>
			<complexType type="{$ltype}" package="{@package}" extends="{extends/@type}" root="{$root}">
			<xsl:copy-of select="$children"/>
			<xsl:copy-of select="$attributes"/>
			</complexType>	
		</xsl:when>
		<xsl:otherwise>
			<complexType type="{$ltype}" package="{@package}">
			<xsl:copy-of select="$children"/>
			<xsl:copy-of select="$attributes"/>
			</complexType>	
		</xsl:otherwise>
	</xsl:choose>	
</xsl:template>

<!--
	get the root of an extension tree
-->
<xsl:template name="get-root">
<xsl:param name="gr-type"/>
	<xsl:variable name="p" select="/root/types/complexType[@type=$gr-type]/extends/@type"/>
	
	<xsl:choose>
		<xsl:when test="not($p)">
			<xsl:value-of select="$gr-type"/>
		</xsl:when>
		<xsl:otherwise>
			<xsl:call-template name="get-root">
				<xsl:with-param name="gr-type" select="$p"/>
			</xsl:call-template>
		</xsl:otherwise>
	</xsl:choose>	
</xsl:template>

<!-- 
	name: simpleType 
	handles the simpleType definitions
-->
<xsl:template match="simpleType">
	<simpleType type="{@type}" package="{@package}" base="{@base}"/>
</xsl:template>

<!-- 
	name: elements 
	handles contents of elements
-->
<xsl:template match="elements">	
	<elements>
		<xsl:for-each select="element[@name=$message-handler-root]">
			<xsl:variable name="ltype">
				<xsl:choose>
					<xsl:when test="$root-type-rename">
						<xsl:value-of select="$root-type-rename"/>
					</xsl:when>
					<xsl:otherwise>
						<xsl:value-of select="@type"/>
					</xsl:otherwise>
				</xsl:choose>
			</xsl:variable>
			
			<element
				name="{@name}"
				type="{$ltype}"
				handler="{$message-handler-name}"
				handler-package="{$message-handler-package}"/>				
		</xsl:for-each>
	</elements>
</xsl:template>


<!-- 
	name: types 
	handles contents of types
-->
<xsl:template match="types">
	<types>
		<xsl:apply-templates select="complexType | groupType"/>
		<xsl:apply-templates select="simpleType"/>		
	</types>
</xsl:template>

<!-- 
	name: root 
	handles contents of root
-->
<xsl:template match="root">
	<root
		module="{@module}">
		
	<xsl:copy-of select="hdr"/>
	
	<xsl:apply-templates select="elements"/>
	
	<xsl:apply-templates select="types"/>
	</root>
</xsl:template>

<xsl:template match="/">
	<xsl:apply-templates select="root"/>
</xsl:template>

</xsl:stylesheet>
