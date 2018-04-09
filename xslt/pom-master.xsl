<?xml version="1.0" encoding="ISO-8859-1"?>
<!-- 
/********************************************************************************
Copyright 2018 Lolke B. Dijkstra

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

Framework: 
	https://sourceforge.net/projects/xml2j-core/
Generator:	
	https://sourceforge.net/projects/xml2j-gen/
********************************************************************************/
-->
<!--
	step5 (5/5) generate pom.xml 
	
	version:		2.4.1		

	description:
		generate pom file based on generator configuration file  
	
	changelog:
		-
-->
<!--
<xsl:stylesheet version="1.1"
				xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
				xmlns:Date="java:java.util.Date"
				exclude-result-prefixes="Date #default">
-->
<xsl:stylesheet version="1.1"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:Date="java:java.util.Date"
	exclude-result-prefixes="Date">


<xsl:param name="xml2j-version" select="'2.4.0'"/>

<!-- group-id -->
<xsl:param name="group-id" select="''" />

<!-- domain -->
<xsl:param name="domain-name" select="'[domain-name]'" />
<xsl:param name="domain-package" select="'[domain-package]'" />
<xsl:param name="domain-description" select="'[domain-description]'" />


<!-- if application should be generated this field should be not empty -->
<xsl:param name="application-name" select="''"/>
<xsl:param name="application-package" select="''"/>
<xsl:param name="version" select="'1.0'"/>

<!-- path for generated source code -->
<xsl:param name="source-path" select="'./src'"/>

<!-- current date -->
<xsl:script
        implements-prefix="Date"
        language="java"
        src="java:java.util.Date" />

<xsl:variable
        name="current-date"
        select="Date:to-string(Date:new())" />

<!-- pom header -->
<xsl:variable
        name="header">
    XML2J XSD to Java code generator
    This (master) POM file was generated using XML2J code generator.
    Generation date: <xsl:value-of select="$current-date"/>
</xsl:variable>

<!-- pom -->
<xsl:output method='xml' version='1.0' encoding='utf-8' indent='yes'/>
<xsl:strip-space elements="*" />

<!-- global variables -->
<xsl:variable name="lowercase" select="'abcdefghijklmnopqrstuvwxyz'"/> 
<xsl:variable name="uppercase" select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ'"/> 

<xsl:variable name="domain" select="translate($domain-name,$uppercase,$lowercase)"/>

<xsl:template match="modules">

	<xsl:for-each select="node()">
		  <xsl:copy-of select="." />
	</xsl:for-each>
</xsl:template>

<!-- MAIN PROGRAM -->
<xsl:template match="/">
	<!-- GENERATE POM -->

	<xsl:variable name="className" select="concat(translate(substring($application-name,1,1),$lowercase,$uppercase),substring($application-name,2))"/>
	<xsl:variable name="mainClass" select="concat($application-package,'.',$className)" />

	<!--			xmlns="http://maven.apache.org/POM/4.0.0"
	-->
	<project
			xmlns="http://maven.apache.org/POM/4.0.0"
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
			<xsl:text>&#xa;</xsl:text>
		<xsl:comment>
			<xsl:value-of select="$header"/>
			<xsl:text>&#xa;</xsl:text>
		</xsl:comment>
		<properties>
			<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
			<src.dir>${project.basedir}/<xsl:value-of select="$source-path"/></src.dir>
			<dependency.locations.enabled>false</dependency.locations.enabled>
		</properties>
		<modelVersion>4.0.0</modelVersion>
		<groupId><xsl:value-of select="$group-id"/></groupId>
		<artifactId><xsl:value-of select="$domain"/></artifactId>
		<version><xsl:value-of select="$version"/></version>
		<name><xsl:value-of select="$domain"/></name>
		<description><xsl:value-of select="$domain-description"/></description>		
		<packaging>pom</packaging>

		<modules>
			<xsl:apply-templates select="node()"/>
		</modules>

	   <dependencies>
			<dependency>
				<groupId>junit</groupId>
				<artifactId>junit</artifactId>
				<version>4.12</version>
				<scope>test</scope>
			</dependency>
			<dependency>
				<groupId>org.slf4j</groupId>
				<artifactId>slf4j-log4j12</artifactId>
				<version>1.7.25</version>
			</dependency>
			<dependency>
				<groupId>com.xml2j</groupId>
				<artifactId>xml2j-core</artifactId>
				<version>2.4.0</version>
			</dependency>
	   </dependencies>
	</project>
</xsl:template>

</xsl:stylesheet>


