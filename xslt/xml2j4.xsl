<?xml version="1.0" encoding="ISO-8859-1"?>
<!-- 
/********************************************************************************
Copyright 2016, 2017, 2018 Lolke B. Dijkstra

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
	step4 (4/5) Java code generation 
	
	version:		2.4.2		
	
	changelog:
		support for
		- serialization and serialVersionUID
		- equals
-->


<!-- COMPLEXTYPE -->

<xsl:stylesheet version="1.1"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:Date="java:java.util.Date">


<xsl:param name="xml2j-version" select="'[xml2j-version]'"/>

<!-- import = framework import -->
<xsl:param name="import" select="'com.xml2j.xml.core'"/>
<xsl:param name="import-util" select="'com.xml2j.util'"/>
<!-- module-name -->
<xsl:param name="module-name" select="'[module-name]'" />
<xsl:param name="module-package" select="'[module-package]'" />

<!-- flag indicating printing methods should be generated -->
<xsl:param name="with-printing" select="1"/>

<!-- flag indicating support for serialization -->
<xsl:param name="with-serialization" select="1"/>
<!-- serialVersionUID -->
<xsl:param name="serialversion-uid" select="'1L'"/>

<!-- message handler -->
<xsl:param name="message-handler-name" select="''"/>
<xsl:param name="message-handler-package" select="''"/>

<!-- if processor should be generated this field should be not empty -->
<xsl:param name="processor-name" select="''"/>
<xsl:param name="processor-package" select="''"/>

<!-- if application should be generated this field should be not empty -->
<xsl:param name="application-name" select="''"/>
<xsl:param name="application-package" select="''"/>

<!-- if application task should be generated this field should be not empty -->
<xsl:param name="application-task-name" select="''"/>
<xsl:param name="application-task-package" select="''"/>

<!-- if runnable should be generated this field should be not empty -->
<xsl:param name="runnable-name" select="''"/>
<xsl:param name="runnable-package" select="''"/>


<!-- path for generated source code -->
<xsl:param name="source-path" select="'./src'"/>

<!-- project-root -->
<xsl:param name="project-root" select="'XML2J https://sourceforge.net/projects/xml2j/'"/>

<!-- author -->
<xsl:param name="author" select="'XML2J Generator'"/>

<!-- custom header -->
<xsl:param
    name="custom-header">
</xsl:param>

<xsl:script 
    implements-prefix="Date"
    language="java"
    src="java:java.util.Date" />

<xsl:variable
    name="current-date"
    select="Date:to-string(Date:new())" />


<xsl:output method='text' version='1.0' encoding='ISO-8859-1' indent='no'/>

<!-- global variables -->
<xsl:variable name="lowercase" select="'abcdefghijklmnopqrstuvwxyz'"/> 
<xsl:variable name="uppercase" select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ'"/> 
<xsl:variable name="module" select="translate($module-name,$lowercase,$uppercase)"/>


<!-- source code header -->
<xsl:variable
    name="header">
/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  <xsl:value-of select="$custom-header"/>
  This code was generated using XML2J code generator.
  
  Version: <xsl:value-of select="$xml2j-version"/> 
  Project home: <xsl:value-of select="$project-root"/> 

  Module: <xsl:value-of select="$module"/> 
  Generation date: <xsl:value-of select="$current-date"/> 
  Author: <xsl:value-of select="$author"/>

******************************************************************************/
</xsl:variable>


<xsl:variable name="org_char" select="':-.'"/> 
<xsl:variable name="rep_char" select="''"/> 

<!-- MAIN PROGRAM -->
<xsl:template match="/root">
	<xsl:variable name="path" select="concat($source-path,'/')"/>

	<xsl:apply-templates select="elements/element">
		<xsl:with-param name="path" select="$path" />
	</xsl:apply-templates>

  	<xsl:apply-templates select="types/complexType">
		<xsl:with-param name="path" select="$path" />
	</xsl:apply-templates>
	
	<!-- generator processor component -->
	<xsl:if test="$processor-name">
		<xsl:call-template name="generate-processor">
			<xsl:with-param name="path" select="$path" />
		</xsl:call-template>	
	</xsl:if>

	<!-- generator application component -->
	<xsl:if test="$application-task-name">
		<xsl:call-template name="generate-application-task">
			<xsl:with-param name="path" select="$path" />
		</xsl:call-template>	
	</xsl:if>

	<!-- generator task component -->
	<xsl:if test="$runnable-name">
		<xsl:call-template name="generate-runnable">
			<xsl:with-param name="path" select="$path" />
		</xsl:call-template>	
	</xsl:if>

	<!-- generator application component -->
	<xsl:if test="$application-name">
	<xsl:call-template name="generate-application">
		<xsl:with-param name="path" select="$path" />
	</xsl:call-template>	
	</xsl:if>
	
</xsl:template>

<!-- HANDLE DEFINITION OF ROOT ELEMENT -->
<xsl:template match="element">
<xsl:param name="path" />

	<xsl:if test="@handler">
		<xsl:call-template name="messageHandler">
			<xsl:with-param name="path" select="$path" />
		</xsl:call-template>			
	</xsl:if>
	
</xsl:template>


<!-- INTERFACE OF MODULE COMPLEXTYPE -->
<xsl:template match="complexType">
<xsl:param name="path" />

	<xsl:call-template name="complexType">
		<xsl:with-param name="path" select="$path" />
	</xsl:call-template>
	
	<xsl:call-template name="complexHandler">
		<xsl:with-param name="path" select="$path" />
	</xsl:call-template>

</xsl:template>

<!--
	works within the context of complexType
	
	if @extends indicates a complexType -> 'true'
	else -> 'false'
-->
<xsl:template name="extends-complex">
	<xsl:choose>
		<xsl:when test="@extends">
			<xsl:variable name="lext" select="@extends"/>	
			<xsl:choose>
				<xsl:when test="not(/root/types/complexType[@type=$lext])">
					<xsl:value-of select="'false'"/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="'true'"/>
				</xsl:otherwise>
			</xsl:choose>		
		</xsl:when>
		<xsl:otherwise>
			<xsl:value-of select="'false'"/>
		</xsl:otherwise>
	</xsl:choose>		
</xsl:template>


<!-- get proper classname -->
<xsl:template name="get-classname">
<xsl:param name="gc-type"/>
	<xsl:variable name="tname" select="translate($gc-type,$org_char,$rep_char)"/>
	<xsl:value-of select="concat(translate(substring($tname,1,1),$lowercase,$uppercase),substring($tname,2))"/>
</xsl:template>


<!-- MESSAGE HANDLER -->
<xsl:template name="messageHandler">
<xsl:param name="path" />

Creating handler: <xsl:value-of select="@handler"/><xsl:text/>

<!-- local variables -->
<xsl:variable name="handlerClassname" select="concat(translate(substring(@handler,1,1),$lowercase,$uppercase),substring(@handler,2))"/>
<xsl:variable name="type" select="concat(translate(substring(@type,1,1),$lowercase,$uppercase),substring(@type,2))"/>
<xsl:variable name="typeName" select="translate($type,$org_char,$rep_char)"/>
<xsl:variable name="ttype" select="@type"/>
<xsl:variable name="package" select="/root/types/complexType[@type=$ttype]/@package" />
<xsl:variable name="handler-package" select="@handler-package"/>
<xsl:variable name="lpath" select="concat(translate($handler-package,'.','/'),'/')"/>
<xsl:variable name="filename" select="concat($path,$lpath,$handlerClassname)" />

<xsl:document href="{$filename}.java">package <xsl:value-of select="$handler-package"/>;

<xsl:value-of select="$header"/>
import org.xml.sax.XMLReader;
<xsl:if test="not($package=$handler-package)">
import <xsl:value-of select="$package"/>.<xsl:value-of select="$typeName"/>;
import <xsl:value-of select="$package"/>.<xsl:value-of select="$typeName"/>Handler;
</xsl:if><xsl:text/>
import com.xml2j.xml.core.XMLMessageHandler;
import com.xml2j.xml.parser.ParserTask;

/**
 * This class reads the XML document from an XML inputsource.
 *
 * This class is the entry point for the client application.
 */
public class <xsl:value-of select="$handlerClassname"/> extends
		XMLMessageHandler&lt;<xsl:value-of select="$type"/>&gt; {
	
	/** root element. */	
	static final String ELEMENT_NAME = "<xsl:value-of select='@name'/>";	
	
	/**
	 * Constructor.
	 *
	 * @see XMLMessageHandler XMLMessageHandler
	 * @param task 
	 *            The parser task
	 * @param reader
	 *            The (SAX) XML Reader object
	 */
	public <xsl:value-of select="$handlerClassname"/>(ParserTask task, XMLReader reader) {
		super(reader
		, new <xsl:value-of select="$type"/>Handler(
			task
			, reader
			, null	// root has no parent
			, ELEMENT_NAME
			, <xsl:value-of select="$type"/>.getAllocator()
			, null	// not applicable for root
			, doProcess(ELEMENT_NAME, task))
		);
	}
}

</xsl:document>
</xsl:template>




<!-- DATA TEMPLATE -->
<!-- BEGIN -->
<xsl:template name="complexType">
<xsl:param name="path" />

<!-- local variables -->

<!-- classname -->
<xsl:variable name="tclassname" select="translate(@type,$org_char,$rep_char)"/>
<xsl:variable name="classname" select="concat(translate(substring($tclassname,1,1),$lowercase,$uppercase),substring($tclassname,2))"/>

<!--Creating datatype: <xsl:value-of select="$classname"/>-->
<xsl:variable name="package" select="@package"/>
<xsl:variable name="lpath" select="concat(translate($package,'.','/'),'/')"/>
<xsl:variable name="filename" select="concat($path,$lpath,$classname)" />

<xsl:document href="{$filename}.java">package <xsl:value-of select="$package"/>;

<xsl:value-of select="$header"/>
<!-- implementation of data class -->

<!-- with PRINTING -->
<xsl:if test="$with-printing='1'">
import com.xml2j.util.Printer;<xsl:text>&#xA;</xsl:text>
</xsl:if>


<xsl:if test="elementList/element[@ismulti='true' and @base!='complex']">
import <xsl:value-of select="$import-util"/>.StringList;
</xsl:if>
<xsl:if test="elementList/element[@ismulti='true' and @base='complex']">
import java.util.List;<xsl:text/>
import java.util.ArrayList;
</xsl:if>
<xsl:if test="elementList/element">
import com.xml2j.util.Compare;
</xsl:if>

<xsl:variable name="doExtend">
	<xsl:call-template name="extends-complex" />
</xsl:variable>
import <xsl:value-of select="$import"/>.ComplexDataType;
<xsl:if test="$doExtend='false'">
import <xsl:value-of select="$import"/>.TypeAllocator;
</xsl:if>


<xsl:variable name="super">
	<xsl:choose>
	<xsl:when test="$doExtend='true'">
		<xsl:value-of select="concat(translate(substring(@extends,1,1),$lowercase,$uppercase),substring(@extends,2))"/>
	</xsl:when>
	<xsl:otherwise>
		<xsl:value-of select="'ComplexDataType'"/>
	</xsl:otherwise>
	</xsl:choose>
</xsl:variable>

<xsl:variable name="superAlloc">
	<xsl:choose>
	<xsl:when test="$doExtend='true'">
		<xsl:value-of select="concat('extends ', $super, '.Allocator')"/>
	</xsl:when>
	<xsl:otherwise>
		<xsl:value-of select="concat('implements TypeAllocator&lt;', $classname, '&gt;')"/>
	</xsl:otherwise>
	</xsl:choose>
</xsl:variable>


/**
 * <xsl:value-of select="$classname"/> data class.
 *
 * This class provides getters and setters for embedded attributes and elements.
 * Any complex data structure can be navigated by using the element getter methods.
 * <!-- @see &lt;<xsl:value-of select="$classname"/>Handler&gt; -->
 */
public class <xsl:value-of select="$classname"/> extends <xsl:value-of select="$super"/> {
<xsl:if test="$with-serialization='1'">
	/**
	 * serial version UID 
	 */
	private static final long serialVersionUID = <xsl:value-of select="$serialversion-uid"/>;
</xsl:if>
	/**
	 * Constructor for <xsl:value-of select="$classname"/>.
	 *
	 * @param elementName the name of the originating XML tag
	 * @param parent the parent data
	 */
	public <xsl:value-of select="$classname"/>(String elementName, ComplexDataType parent) {
		super(elementName, parent);
	}
  
	/**
	 * Allocator class.	
	 *
	 * This class implements the generic allocator interface that is used by the framework.
	 * The allocator is used by the framework to instantiate type <xsl:value-of select="$classname"/>.
	 */
	static class Allocator <xsl:value-of select="$superAlloc"/> {
		/**
		 * method for getting a new instance of type <xsl:value-of select="$classname"/>.
		 *
		 * @param elementName the name of the originating XML tag
		 * @param parent the parent data
		 * @return new instance
		 */
		<xsl:choose>
			<xsl:when test="$doExtend='true'">public <xsl:value-of select="$super"/> newInstance(String elementName, ComplexDataType parent) {
			</xsl:when>
			<xsl:otherwise>public <xsl:value-of select="$classname"/> newInstance(String elementName, ComplexDataType parent) {
			</xsl:otherwise>
		</xsl:choose>return new <xsl:value-of select="$classname"/>(elementName, parent);
		}
	}
	
	/** instance of allocator class for this data class. */
	private static Allocator allocator = new Allocator();
	
	/**
	 * Get Allocator for this data class.
	 * This method is used by the handler class.
	 *
	 * @return instance of Allocator
	 */
	static public Allocator getAllocator() {
		return allocator;
	}
	
  <!-- adding attributes for elementList -->	
  <xsl:for-each select="elementList/element">
  <xsl:if test="not(@substitutes)">
  	<xsl:variable name="tName" select="translate(@name,$org_char,$rep_char)"/>
	<xsl:variable name="attributeName" select="concat('m_',translate(substring($tName,1,1),$uppercase,$lowercase),substring($tName,2))"/>
	
	<xsl:variable name="localClassName">
		<xsl:choose>	
			<xsl:when test="@base='complex'">
  				<xsl:variable name="tType" select="translate(@type,$org_char,$rep_char)"/>
				<xsl:value-of select="concat(translate(substring($tType,1,1),$lowercase,$uppercase),substring($tType,2))" />
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="'String'" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
	
	<xsl:choose>
	<xsl:when test="@ismulti='true' and @base!='complex'">
	/** list of <xsl:value-of select="@name"/> element. 
	<xsl:if test="$with-serialization='1'"> *  @serial</xsl:if>
	 */	
	private <xsl:value-of select="$localClassName"/>List <xsl:value-of select="$attributeName"/>List = new <xsl:value-of select="$localClassName"/>List("<xsl:value-of select="@name"/>");
	</xsl:when>
	<xsl:when test="@ismulti='true'">
	/** list of <xsl:value-of select="@name"/> element. 
	<xsl:if test="$with-serialization='1'"> *  @serial</xsl:if>
	 */	
	private List&lt;<xsl:value-of select="$localClassName"/>&gt; <xsl:value-of select="$attributeName"/>List = new ArrayList&lt;<xsl:value-of select="$localClassName"/>&gt;();
	</xsl:when>
	<xsl:otherwise>
	/** element item for <xsl:value-of select="@name"/> element. 
	<xsl:if test="$with-serialization='1'"> *  @serial</xsl:if>
	 */	
	private <xsl:value-of select="$localClassName"/><xsl:text> </xsl:text><xsl:value-of select="$attributeName"/> = null;
	</xsl:otherwise>
	</xsl:choose>
  </xsl:if>	
  </xsl:for-each><xsl:text/>

  <!-- adding getters and setters for elementList -->
  <xsl:for-each select="elementList/element">
   <xsl:if test="not(@substitutes)">
  	<xsl:variable name="tName" select="translate(@name,$org_char,$rep_char)"/>
  	<xsl:variable name="tType" select="translate(@type,$org_char,$rep_char)"/>
	<xsl:variable name="attributeName" select="concat('m_',translate(substring($tName,1,1),$uppercase,$lowercase),substring($tName,2))"/>
    <xsl:variable name="lName" select="concat(translate(substring($tName,1,1),$lowercase,$uppercase),substring($tName,2))"/>
  	<xsl:variable name="localClassName">
		<xsl:choose>	
			<xsl:when test="@base='complex'">
				<xsl:value-of select="concat(translate(substring($tType,1,1),$lowercase,$uppercase),substring($tType,2))" />
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="'String'" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>

	<xsl:choose>
		<xsl:when test="@ismulti='true' and @base!='complex'">	
	/**
	 * Get the embedded list of <xsl:value-of select="$lName" /> elements.
	 * @return list of items.
	 */
	public <xsl:value-of select="$localClassName"/>List get<xsl:value-of select="$lName"/>s() {
		return <xsl:value-of select="$attributeName"/>List;
	}
		</xsl:when>
		<xsl:when test="@ismulti='true'">
	/**
	 * Get the embedded list of <xsl:value-of select="$lName" /> elements.
	 * @return list of items.
	 */
	public List&lt;<xsl:value-of select="$localClassName"/>&gt; get<xsl:value-of select="$lName"/>s() {
		return <xsl:value-of select="$attributeName"/>List;
	}
		</xsl:when>
		<xsl:otherwise>
	/**
	 * Get the embedded <xsl:value-of select="$lName" /> element.
	 * @return the item.
	 */
	public <xsl:value-of select="$localClassName"/> get<xsl:value-of select="$lName"/>() {
		return <xsl:value-of select="$attributeName"/>;
	}
		</xsl:otherwise>
	</xsl:choose>	
	<xsl:choose>	
		<xsl:when test="@ismulti='true'">
	/**
	 * This method adds data to the list of <xsl:value-of select="$lName" />.
	 * @param data the item that needs to be added.
	 */
	void set<xsl:value-of select="$lName" />(<xsl:value-of select="$localClassName"/> data) {
		<xsl:value-of select="$attributeName"/>List.add(data);
	}
		</xsl:when>
		<xsl:otherwise>
	/**
	 * This method sets (overwrites) the element <xsl:value-of select="$lName" />.
	 * @param data the item that needs to be added.
	 */
	void set<xsl:value-of select="$lName" />(<xsl:value-of select="$localClassName"/> data) {
		<xsl:value-of select="$attributeName"/> = data;
	}
		</xsl:otherwise>
	</xsl:choose>
   </xsl:if>	
  </xsl:for-each><xsl:text/>
  <!-- adding equals method -->
	/**
	 * This method compares this and that.
	 * @return true if this and that are the same, false otherwise.	
	 */
	public boolean equals(Object that) {  
		if (!super.equals(that))
			return false;
      
	 <xsl:if test="elementList/element"> 
		      <xsl:text>&#x9;</xsl:text><xsl:value-of select="$classname"/> t = (<xsl:value-of select="$classname"/>)that;
	 </xsl:if>        
  <xsl:for-each select="elementList/element">
    <xsl:if test="not(@substitutes)">
  	<xsl:variable name="tName" select="translate(@name,$org_char,$rep_char)"/>
  	<xsl:variable name="tType" select="translate(@type,$org_char,$rep_char)"/>
	<xsl:variable name="attributeName" select="concat('m_',translate(substring($tName,1,1),$uppercase,$lowercase),substring($tName,2))"/>
    <xsl:variable name="lName" select="concat(translate(substring($tName,1,1),$lowercase,$uppercase),substring($tName,2))"/>
  	
	<xsl:choose>	
		<xsl:when test="@ismulti='true'">
		if (!Compare.equals(<xsl:value-of select="$attributeName"/>List, t.<xsl:value-of select="$attributeName"/>List))
			return false;
		</xsl:when>
		<xsl:otherwise>
		if (!Compare.equals(<xsl:value-of select="$attributeName"/>, t.<xsl:value-of select="$attributeName"/>))
			return false;
		</xsl:otherwise>
	</xsl:choose>	
	
   </xsl:if>	
  </xsl:for-each><xsl:text/>
		return true;
	}	<!-- end equals method -->

  <!-- adding getters and setters for attributeList -->
  <xsl:for-each select="attributeList/attribute">
  	<xsl:variable name="tName" select="translate(@name,$org_char,$rep_char)"/>
  	<xsl:variable name="tType" select="translate(@type,$org_char,$rep_char)"/>
  	<xsl:variable name="attributeName" select="concat('m_',translate(substring($tName,1,1),$uppercase,$lowercase),substring($tName,2))"/>
    <xsl:variable name="lName" select="concat(translate(substring($tName,1,1),$lowercase,$uppercase),substring($tName,2))"/>
  	<xsl:variable name="localClassName" select="'String'" />

	/**
	 * Get '<xsl:value-of select="@name"/>' attribute.
	 * @return the item.
	 */
//	public <xsl:value-of select="$localClassName"/> get<xsl:value-of select="$lName"/>() {
//		return getAttr("<xsl:value-of select="@name"/>");
//	}

	/**
	 * Set '<xsl:value-of select="@name"/>' attribute.
	 * 
	 * Set (overwrite) the attribute data.
	 * @param data the item that needs to be added.
	 */
//	public void set<xsl:value-of select="$lName" />(<xsl:value-of select="$localClassName"/> data) {
//		setAttr("<xsl:value-of select="@name"/>", data);
//	}
  </xsl:for-each><xsl:text/>
  <xsl:if test="$with-printing='1'">
  <!-- printing method for debugging purposes -->
	/**
	 *	Printing method, prints the XML element to a Printer.
	 *  This method prints an XML fragment starting from <xsl:value-of select="@type" />.
	 *
	 *  @param out the Printer that the element is printed to
	 *  @see com.xml2j.util.Printer
	 */
	protected void printElements(Printer out) {
		super.printElements(out);
  <xsl:for-each select="elementList/element">
   <xsl:if test="not(@substitutes)">
  	<xsl:variable name="tName" select="translate(@name,$org_char,$rep_char)"/>
  	<xsl:variable name="lName" select="concat('l_',$tName)"/>
	<xsl:variable name="elementName">
		<xsl:choose> 
			<xsl:when test="@ismulti='true'">
				<xsl:value-of select="concat('m_',translate(substring($tName,1,1),$uppercase,$lowercase),substring($tName,2),'List')"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="concat('m_',translate(substring($tName,1,1),$uppercase,$lowercase),substring($tName,2))"/>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
  	<xsl:variable name="tType" select="translate(@type,$org_char,$rep_char)"/>
  	<xsl:variable name="localClassName">
		<xsl:choose>	
			<xsl:when test="@base='complex'">
				<xsl:value-of select="concat(translate(substring($tType,1,1),$lowercase,$uppercase),substring($tType,2))" />
			</xsl:when>
			<xsl:otherwise>
				<xsl:value-of select="'String'" />
			</xsl:otherwise>
		</xsl:choose>
	</xsl:variable>
	
	<xsl:choose>	
		<xsl:when test="@base='complex' and @ismulti='false'">
		if (<xsl:value-of select="$elementName" /> != null)
			<xsl:value-of select="$elementName" />.print(out);
		else {
			// out.print("&lt;<xsl:value-of select="@name" />&gt;null&lt;/<xsl:value-of select="@name" />&gt;");
		}
		</xsl:when>
		<xsl:when test="@base='complex' and @ismulti='true'">
		if (<xsl:value-of select="$elementName" /> != null)
			for(<xsl:value-of select="$localClassName" /><xsl:text> </xsl:text><xsl:value-of select="$lName" /> : <xsl:value-of select="$elementName" />) {
				<xsl:value-of select="$lName" />.print(out);
			}
		else {
			// out.print("&lt;<xsl:value-of select="@name" />&gt;null&lt;/<xsl:value-of select="@name" />&gt;");
		}
		</xsl:when>
		<xsl:when test="@base='simple' and @ismulti='true'">
		if (<xsl:value-of select="$elementName" /> != null)
			<xsl:value-of select="$elementName" />.print(out);
		else {
			// out.print("&lt;<xsl:value-of select="@name" />&gt;null&lt;/<xsl:value-of select="@name" />&gt;");
		}
		</xsl:when>
		<xsl:otherwise>
		if (<xsl:value-of select="$elementName" /> != null) {
			out.print("\n&lt;<xsl:value-of select="@name" />&gt;");
			out.print(<xsl:value-of select="$elementName" />);
			out.print("&lt;/<xsl:value-of select="@name" />&gt;\n");
		}
		</xsl:otherwise>
	</xsl:choose>
   </xsl:if>
  </xsl:for-each>
	}<xsl:text/>
	</xsl:if><xsl:text/>
}
</xsl:document>
</xsl:template>
<!-- END -->


<!-- handler template -->
<!-- BEGIN -->
<xsl:template name="complexHandler">
<xsl:param name="path" />

<!-- local variables -->
<xsl:variable name="tclassname" select="translate(@type,$org_char,$rep_char)"/>
<xsl:variable name="classname" select="concat(translate(substring($tclassname,1,1),$lowercase,$uppercase),substring($tclassname,2))"/>

<xsl:variable name="package" select="@package"/>
<xsl:variable name="lpath" select="concat(translate($package,'.','/'),'/')"/>
<xsl:variable name="filename" select="concat($path,concat($lpath,$classname))" />

<!-- determines whether or not extending another generated type -->
<xsl:variable name="doExtend">
	<xsl:call-template name="extends-complex" />
</xsl:variable>


<!--Creating datahandler: <xsl:value-of select="$classname"/>Handler-->

<xsl:document href="{$filename}Handler.java">package <xsl:value-of select="$package"/>;

<xsl:value-of select="$header"/>

<xsl:text>
/* SAX 2.0 dependencies */
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
</xsl:text>
/* Framework dependencies */
import <xsl:value-of select="$import"/>.DataSetter;<xsl:text />
<xsl:if test="elementList/element[@base='complex']">
import <xsl:value-of select="$import"/>.ComplexDataType;</xsl:if>
import <xsl:value-of select="$import"/>.XMLFragmentHandler;<xsl:text/>
import com.xml2j.xml.parser.ParserTask;<xsl:text/>

<!-- write imports -->
<xsl:for-each select="elementList/element"><xsl:text />
  <xsl:if test="@package">
    <xsl:text>&#xA;// import elementList definitions:</xsl:text>
    <xsl:variable name="lpackage" select="@package"/><xsl:text />
    <xsl:text>&#xA;import </xsl:text><xsl:value-of select="$lpackage"/>;<xsl:text/>
  </xsl:if>
</xsl:for-each>


<!-- determine the type to be used in the template -->
<xsl:variable name="templateType">
	<xsl:choose>
		<xsl:when test="$doExtend='true'">
			<xsl:call-template name="get-classname">
				<xsl:with-param name="gc-type" select="@root"/>
			</xsl:call-template>	
		</xsl:when>
		<xsl:otherwise>
			<xsl:value-of select="$classname"/>
		</xsl:otherwise>
	</xsl:choose>
</xsl:variable>

<!-- generate proper classname based on @extends -->
<xsl:variable name="extendsType">
	<xsl:call-template name="get-classname">
		<xsl:with-param name="gc-type" select="@extends"/>
	</xsl:call-template>	
</xsl:variable>


/**
 * <xsl:value-of select="$classname"/> handler class.
 *
 * @see <xsl:value-of select="$classname"/>
 */
public class <xsl:value-of select="$classname"/>Handler <xsl:choose>
<xsl:when test="$doExtend='true'">extends <xsl:value-of select="$extendsType"/>Handler {</xsl:when>
<xsl:otherwise>extends XMLFragmentHandler&lt;<xsl:value-of select="$classname"/>&gt; {</xsl:otherwise>
</xsl:choose>
	/**
	 * Proxy for <xsl:value-of select="$classname"/>Handler.
	 */
	static class Proxy extends HandlerProxy&lt;<xsl:value-of select="$templateType"/>&gt; {
		/**
		 * Allocator for <xsl:value-of select="$classname"/>Handler.
		 */
		private static class Allocator 
				extends HandlerProxy.Allocator&lt;<xsl:value-of select="$templateType"/>&gt; {			
			public XMLFragmentHandler&lt;<xsl:value-of select="$templateType"/>&gt; create(
					ParserTask task
					, XMLReader reader
					, XMLFragmentHandler&lt;?&gt; handler
					, String elementName
					, DataSetter setter
					, boolean doProcess) {
				return new <xsl:value-of select="$classname"/>Handler(
					task
					, reader
					, handler
					, elementName
					, <xsl:value-of select="$classname"/>.getAllocator()
					, setter
					, doProcess);
			}
		}
		
		/**
		 * Constructor for Proxy.
		 *
		 * @param task the XML parser task
		 * @param reader the XML reader
		 * @param parentH the parent XML handler class
		 * @param elementName the name of the XML Element (tag).
		 * @param pSetter the setter for the parent data
		 * @param doProcess indicates whether processing is active for this handler instance
		 */
		public Proxy(ParserTask task, XMLReader reader, XMLFragmentHandler&lt;?&gt; parentH, String elementName,
				DataSetter pSetter, boolean doProcess) {
			super(task, reader, parentH, elementName, pSetter, new Allocator(), doProcess);
		}
	}
<xsl:for-each select="elementList/element[@base='complex' and not(@substitutes)]">
  <xsl:sort select="@name" />
  <xsl:variable name="tName" select="translate(@name,$org_char,$rep_char)"/>
  <xsl:variable name="tType" select="translate(@type,$org_char,$rep_char)"/>
  <xsl:variable name="attributeName" select="concat(translate(substring($tName,1,1),$uppercase,$lowercase),substring($tName,2))"/><xsl:text />
  <xsl:variable name="lName" select="concat(translate(substring($tName,1,1),$lowercase,$uppercase),substring($tName,2))"/><xsl:text />	
  <xsl:variable name="lType" select="concat(translate(substring($tType,1,1),$lowercase,$uppercase),substring($tType,2))"/><xsl:text />	
	/** Data setter class for <xsl:value-of select="@name"/> element. */
	private class <xsl:value-of select="$lName"/>Setter implements DataSetter {
		/** data target. */
		private <xsl:value-of select="$classname"/>Handler pHandler = null;
		
		/**
		 * Constructor.
		 * @param pHandler parent that needs to be updated
		 */
		public <xsl:value-of select="$lName"/>Setter(<xsl:value-of select="$classname"/>Handler pHandler) {
			this.pHandler = pHandler;
		}

		/** {@inheritDoc} */
		public void set(ComplexDataType data) {
			pHandler.getData().set<xsl:value-of select="$lName"/>((<xsl:value-of select="$lType"/>) data);	
		}
	}<xsl:text/>	
</xsl:for-each>


<xsl:text>
&#xA;
	/**
	 * Constructor for handler class.
	 *
	 * @param reader the XML reader
	 * @param parentH the parent XML handler class
	 * @param elementName the name of the XML Element (tag)
	 * @param allocator the allocator for the data type
	 * @param pSetter the setter for the parent data
	 * @param doProcess indicates whether processing is active for this handler instance
	 */</xsl:text>
	public <xsl:value-of select="$classname"/>Handler(
			ParserTask application
			, XMLReader reader
			, XMLFragmentHandler&lt;?&gt; parentH
			, String elementName
			, <xsl:value-of select="$classname"/>.Allocator allocator
			, DataSetter pSetter
			, boolean doProcess) {
		super(application, reader, parentH, elementName, allocator, pSetter, doProcess);
<xsl:if test="elementList/element[@base='complex']">
		// code for linking children..<xsl:text />
</xsl:if>
	
  <xsl:for-each select="elementList/element[@base='complex']">
    <xsl:sort select="@name" />
      	
	  <xsl:variable name="tag">
	  	<xsl:choose>
	  	 <xsl:when test="@substitutes">
	  	 <xsl:value-of select="@substitutes"/>
	  	 </xsl:when>
	  	 <xsl:otherwise>
	  	<xsl:value-of select="@name"/>
	  	 </xsl:otherwise>
	  	</xsl:choose> 
	  </xsl:variable>
     	
	  <xsl:variable name="tName">
	  	<xsl:value-of select="translate($tag,$org_char,$rep_char)"/>
	  </xsl:variable>

	  <xsl:variable name="lName" select="concat(translate(substring($tName,1,1),$lowercase,$uppercase),substring($tName,2))"/><xsl:text />	
  	  <xsl:variable name="lType" select="concat(translate(substring(@type,1,1),$lowercase,$uppercase),substring(@type,2))"/><xsl:text />	
	  <xsl:variable name="lSetter" select="concat('new ',$lName,'Setter(this)')"/>
	  <xsl:if test="not($tag=@name)">
	  	// type <xsl:value-of select="@name"/> is a derived type from <xsl:value-of select="$tag"/>
	  </xsl:if>
		registerHandler(
			new <xsl:value-of select='$lType'/>Handler.Proxy(
				application
				, reader	// XML reader
				, this	// 'this' is parent of <xsl:value-of select="@type"/>Handler
				, "<xsl:value-of select='@name'/>" // XML element name
				, doLink("<xsl:value-of select='@name'/>") // linking to parent
					? <xsl:value-of select="$lSetter"/> // ON
					: null // OFF
				, doProcess("<xsl:value-of select='@name'/>")) // processing active or not
				);
  </xsl:for-each>	}


	/**
	 * This method overrides the getData() of the super type, returning the more
	 * specific type.
	 * 
	 */
	@Override 
	public <xsl:value-of select="$classname"/> getData() {
		return (<xsl:value-of select="$classname"/>)super.getData();
	}

<xsl:text>
&#xA;
	/**
	 * This method is called by the XML parser on an end of element event.
	 *
	 * If the localName == 'the name of the element that this handler handles' control is
	 * passed back to the parent handler (future events go there) and the data of
	 * the children of this handler is attached to the data associated to this handler.	
	 * 
	 * The data that is collected is connected to the parent data only if a parentDataSetter
	 * if found (getParentDataSetter()).
	 *
	 * If processing is enabled for a handler, the processor is called.
	 */
	@Override</xsl:text>
	public void endElement(String uri, String localName, String name)
		throws SAXException {
		<xsl:if test="elementList/element[@base!='complex']">
		// collect data from children..
		</xsl:if>		
		<xsl:for-each select="elementList/element[@base!='complex']">
		    <xsl:sort select="@name" /><xsl:text />
	        <xsl:variable name="tName" select="translate(@name,$org_char,$rep_char)"/>
	        <xsl:variable name="lName" select="concat(translate(substring($tName,1,1),$lowercase,$uppercase),substring($tName,2))"/>
		<xsl:choose>
		<xsl:when test="position()=1">if (localName.equals("<xsl:value-of select="@name"/>")) {<xsl:text />
			getData().set<xsl:value-of select="$lName"/>(getValue());<xsl:text />
			getContents().reset();<xsl:text />
		</xsl:when>
			<xsl:otherwise>
		} else if (localName.equals("<xsl:value-of select="@name"/>")) {<xsl:text />
			getData().set<xsl:value-of select="$lName"/>(getValue());<xsl:text />
			getContents().reset();<xsl:text />
		</xsl:otherwise>
		</xsl:choose>
		</xsl:for-each>		
		<xsl:choose>
		<xsl:when test="$doExtend='false'">
		<xsl:if test="elementList/element[@base!='complex']">
		} else </xsl:if>if (localName.equals(getXMLElementName())) {
			handleElement();
		}
		</xsl:when>
		<xsl:otherwise>
		<xsl:choose>
			<xsl:when test="elementList/element[@base!='complex']">
		} else {
			super.endElement(uri, localName, name);
		}	</xsl:when>
			<xsl:otherwise>
		super.endElement(uri, localName, name);
			</xsl:otherwise>
		</xsl:choose>	
		</xsl:otherwise>
		</xsl:choose>
	}	
}
</xsl:document>
</xsl:template>



<!-- GENERATE PROCESSOR -->
<xsl:template name="generate-processor">
	<xsl:param name="path"/>

Creating processor: <xsl:value-of select="concat($processor-package,'.',$processor-name)"/><xsl:text/>

<!-- local variables -->
<xsl:variable name="classname" select="concat(translate(substring($processor-name,1,1),$lowercase,$uppercase),substring($processor-name,2))"/>
<xsl:variable name="lpath" select="concat(translate($processor-package,'.','/'),'/')"/>
<xsl:variable name="filename" select="concat($path,$lpath,$classname)" />

<xsl:document href="{$filename}.java">package <xsl:value-of select="$processor-package"/>;

<xsl:value-of select="$header"/>
<!-- import <xsl:value-of select="$module-package"/>.*; -->
<xsl:if test="$with-printing='1'">
import com.xml2j.util.ConsoleWriter;
</xsl:if>	
import com.xml2j.xml.core.ComplexDataType;
import com.xml2j.xml.core.MessageProcessor;
import com.xml2j.xml.core.ProcessorException;
import com.xml2j.xml.core.XMLEvent;

/**
 *	This class processes events that are sent by the XML2J framework.
 */
public class <xsl:value-of select="$processor-name"/> implements MessageProcessor {

	@Override
	public void process(XMLEvent evt, ComplexDataType data)
			throws ProcessorException {

		/*
		 *	TODO Auto-generated method stub	implement your own handling here.
		 * 	Use the runtime configuration file to determine which events are to be sent to the processor.
		 */	
			
		if (evt == XMLEvent.END) {
		<xsl:choose>
		<xsl:when test="$with-printing='1'">	data.print( ConsoleWriter.out );</xsl:when>
		<xsl:otherwise>	System.out.println( data.getClass().toString() );</xsl:otherwise>		
		</xsl:choose>
		}
	}
}
</xsl:document>
</xsl:template>


<!-- GENERATE RUNNABLE -->
<xsl:template name="generate-runnable">
	<xsl:param name="path"/>
	
<xsl:variable name="classname" select="concat(translate(substring($runnable-name,1,1),$lowercase,$uppercase),substring($runnable-name,2))"/>
<xsl:variable name="lpath" select="concat(translate($runnable-package,'.','/'),'/')"/>
<xsl:variable name="filename" select="concat($path,$lpath,$classname)" />

<xsl:document href="{$filename}.java">package <xsl:value-of select="$runnable-package"/>;
<xsl:value-of select="$header"/>
import java.io.IOException;

//-----------------------    	SAX		-----------------------//
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
//-----------------------    	XML2J		-----------------------//
import com.xml2j.xml.core.MessageHandler;
import com.xml2j.xml.core.ParserConfiguration;
import com.xml2j.xml.core.ParserConfigurationException;
import com.xml2j.xml.parser.ParserRunnable;

import <xsl:value-of select="concat($message-handler-package,'.',$message-handler-name)"/>;

/**
 * An example implementation of a task.
 * Adapt this to meet your specific requirements.
 * Use XML parser tasks with threads.
 */
public class <xsl:value-of select="$runnable-name"/> extends ParserRunnable {
	
	/**
	 * Constructor of the task.
	 * @param configuration the runtime configuration 
	 * @throws org.xml.sax.SAXException
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 */
	public <xsl:value-of select="$runnable-name"/>(ParserConfiguration configuration) 
			throws SAXException, ParserConfigurationException, IOException {

		// To use a custom ErrorHandler:
		// a) implement the interface org.xml.sax.ErrorHandler, 
		// b) instantiate the custom ErrorHandler and pass it to the super constructor.
		super(configuration);
	}
	
	/**
	 * Constructor of the task.
	 * @param configuration the runtime configuration 
	 * @param errorHandler the custom error handler 
	 * @throws org.xml.sax.SAXException
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 */
	public <xsl:value-of select="$runnable-name"/>(ParserConfiguration configuration, ErrorHandler errorHandler)
			throws SAXException, ParserConfigurationException, IOException {
		super(configuration, errorHandler);
	}

	@Override
	protected MessageHandler getMessageHandler(XMLReader reader) {
		return new <xsl:value-of select="$message-handler-name"/>(this, reader);
	}
	
}
</xsl:document>
</xsl:template>

<!-- GENERATE APPLICATION TASK -->
<xsl:template name="generate-application-task">
	<xsl:param name="path"/>
	
<xsl:variable name="classname" select="concat(translate(substring($application-task-name,1,1),$lowercase,$uppercase),substring($application-task-name,2))"/>
<xsl:variable name="lpath" select="concat(translate($application-task-package,'.','/'),'/')"/>
<xsl:variable name="filename" select="concat($path,$lpath,$classname)" />

<xsl:document href="{$filename}.java">package <xsl:value-of select="$application-task-package"/>;
<xsl:value-of select="$header"/>
//----------------------- 		IO		-----------------------//
import java.io.IOException;
//-----------------------    	SAX		-----------------------//
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ErrorHandler;
//-----------------------    	XML2J		-----------------------//
import com.xml2j.xml.core.MessageHandler;
import com.xml2j.xml.core.ParserConfiguration;
import com.xml2j.xml.core.ParserConfigurationException;
import com.xml2j.xml.parser.ParserTask;
import <xsl:value-of select="concat($message-handler-package,'.',$message-handler-name)"/>;

/**
 * An example implementation of a parser application.
 * You will need to adapt this to meet your specific requirements.
 * This example demonstrates:
 * - the glue code that connects reader and processor
 * - how you can customize error handling
 *
 * The application uses arguments passed on the command line, however
 * you can connect any class derived from java.io.InputStream.
 */
public class <xsl:value-of select="$application-task-name"/> extends ParserTask {
	
	/**
	 * Constructor of the application.
	 * @param configuration the runtime configuration 
	 * @throws org.xml.sax.SAXException
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 */
	public <xsl:value-of select="$application-task-name"/>(ParserConfiguration configuration) 
			throws SAXException, ParserConfigurationException, IOException {

 	 // To use a custom ErrorHandler:
	 // a) implement the interface org.xml.sax.ErrorHandler, 
	 // b) instantiate the custom ErrorHandler and pass it to the super constructor.
		super(configuration);
	}
	
	/**
	 * Constructor of the application.
	 * @param configuration the runtime configuration 
	 * @param errorHandler the custom error handler 
	 * @throws org.xml.sax.SAXException
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 */
	public <xsl:value-of select="$application-task-name"/>(ParserConfiguration configuration, ErrorHandler errorHandler)
			throws SAXException, ParserConfigurationException, IOException {
		super(configuration, errorHandler);
	}
	

	@Override
	protected MessageHandler getMessageHandler(XMLReader reader) {
		return new <xsl:value-of select="$message-handler-name"/>(this, reader);
	}

}
</xsl:document>
</xsl:template>

<!-- GENERATE APPLICATION -->
<xsl:template name="generate-application">
	<xsl:param name="path"/>
	
<xsl:variable name="classname" select="concat(translate(substring($application-name,1,1),$lowercase,$uppercase),substring($application-name,2))"/>
<xsl:variable name="lpath" select="concat(translate($application-package,'.','/'),'/')"/>
<xsl:variable name="filename" select="concat($path,$lpath,$classname)" />

<xsl:document href="{$filename}.java">package <xsl:value-of select="$application-package"/>;
<xsl:value-of select="$header"/>

//----------------------- 		IO		-----------------------//
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
//-----------------------    LOGGING	-----------------------//
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//-----------------------    	SAX		-----------------------//
import org.xml.sax.SAXException;
//-----------------------    	XML2J		-----------------------//
import com.xml2j.xml.core.ParserConfiguration;
import com.xml2j.xml.core.ProcessorException;
<xsl:choose>
	<xsl:when test="$application-name and $runnable-name">
import com.xml2j.xml.parser.ParserRunnable;
import com.xml2j.util.DefaultThreadManager;
	</xsl:when>
	<xsl:otherwise>
import com.xml2j.xml.parser.ParserTask;
	</xsl:otherwise>
</xsl:choose>	
<xsl:if test="$application-name and $runnable-name">
import <xsl:value-of select="concat($runnable-package,'.',$runnable-name)"/>;
</xsl:if>
import <xsl:value-of select="concat($processor-package,'.',$processor-name)"/>;

/**
 * An example implementation of a parser application.
 * You will need to adapt this to meet your specific requirements.
 * This example demonstrates:
 * - the glue code that connects reader and processor
 * - how you can customize error handling
 *
 * The application uses arguments passed on the command line, however
 * you can connect any class derived from java.io.InputStream.
 */
public class <xsl:value-of select="$classname"/> {
	
	/** command line parameters */
	private final static String usage = "parameters:\n\t(1): xml input \n\t(2): config \n\t(3): schema";

	/** print command line usage */
	private static void usage() {
		System.out.println(usage);
		System.exit(0);
	}

	/**
	 * Entry point of the application.
	 * @param args args[0] = XML, args[1] = runtime configuration, args[2] = XML Schema
	 */
	public static void main(String[] args) {
		if (args.length &lt; 2) {
			usage();
		}

		// get program arguments
		final String input = args[0];
		final String config = args[1];
		final String schema = args.length &gt;= 3 ? args[2] : null;
		
		// initialize logger component
		BasicConfigurator.configure();
		Logger log = LoggerFactory.getLogger(<xsl:value-of select="$classname"/>.class);
		
		try {
			log.info("Starting application.");
			
			// load runtime configuration
			log.info("Loading runtime configuration");
			ParserConfiguration configuration = new ParserConfiguration(config);
	<xsl:choose>	
		<xsl:when test="$application-name and $runnable-name">
			// create thread manager
			DefaultThreadManager manager = new DefaultThreadManager();

			// create a task object
			ParserRunnable task = new <xsl:value-of select="$runnable-name"/>(configuration);

			// validate (optional)
			if (schema != null) {
				log.info("Validating {} against {}", input, schema);
				task.validateXML(new FileInputStream(input), new FileInputStream(schema));
			}

			// prepare the XML parser
			task.prepareStart(new FileInputStream(input), new <xsl:value-of select="$processor-name"/>());
				
			// add the task to list of tasks
			manager.addTask("<xsl:value-of select="$runnable-name"/>", task);

			// when all tasks have been added start threads	
			manager.startThreads();
		</xsl:when>
		<xsl:otherwise>
			/*	
				single threaded (default) mode. to use multiple processors simultaneously specify message-handler-runnable.
				see: documentation version 2.3.0
			*/
			// create the application object
			ParserTask app = new <xsl:value-of select="$application-task-name"/>(configuration);

			InputStream inputStream = null;
			if (input.endsWith(".gz")) {
				log.info("Assuming gz format.");
				inputStream = new GZIPInputStream(new FileInputStream(input));
			} else if (input.endsWith(".xml")) {
				log.info("Assuming regular xml format.");
				inputStream = new FileInputStream(input);
			} else {
				log.error("Unsupported file format. File must be either gz compressed xml or plain xml");
				System.exit(0);
			}

			// validate (optional)
			if (schema != null) {
				log.info("Validating {} against {}", input, schema);
				app.validateXML(inputStream, new FileInputStream(schema));
			}
			
			// process the XML file
			log.info("Start Processing..");	
			app.prepareStart(inputStream, new <xsl:value-of select="$processor-name"/>());
			app.processXML();
		</xsl:otherwise>
	</xsl:choose>	
			log.info("Processing complete.");
			
		} catch (ProcessorException e) {
			log.error("Execution aborted due to PROCESSING error (\n\tmessage: {}\n\tcause: {})"
						, e.getMessage()
						, e.getCause());
		} catch (SAXException | IOException e) {
			log.error(e.getMessage());
		} 
	}	 
}
</xsl:document>
</xsl:template>


</xsl:stylesheet>


