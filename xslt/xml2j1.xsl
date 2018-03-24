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
	module: 		step1 (1/5)
	purpose:		merging of xsd files into one xsd
	
	version:		2.4.1			
*******************************************************************************
-->

<xsl:stylesheet version="1.1"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:xsd="http://www.w3.org/2001/XMLSchema" 
  elementFormDefault="qualified">


<!-- document containing types -->
<xsl:output method='xml' version='1.0' encoding='utf-8' indent='yes'/>
<xsl:strip-space elements="*" />


<!-- 
	include schema 
-->
<xsl:template match="xsd:include" mode="types">
	<xsl:variable name="module" select="document(@schemaLocation)"/>
	
	<!-- recursively merge included xml schema into parent schema -->
	<xsl:apply-templates select="$module/xsd:schema" />
</xsl:template>



<!-- 
	extract types from schema
-->
<xsl:template match="xsd:schema">
	<xsl:apply-templates select="xsd:include" mode="types"/>

	<xsl:apply-templates select="xsd:element"/>
	<xsl:apply-templates select="xsd:simpleType"/>
	<xsl:apply-templates select="xsd:complexType"/>
	<xsl:apply-templates select="xsd:group"/>
</xsl:template>



<xsl:template match="xsd:element | xsd:complexType | xsd:simpleType | xsd:group">
	<xsl:copy-of select="."/>
</xsl:template>

<!-- 
	MAIN PROGRAM 
-->
<xsl:template match="/">
	<xsd:schema>
		<xsl:apply-templates select="xsd:schema"/>
	</xsd:schema>
</xsl:template>

</xsl:stylesheet>
