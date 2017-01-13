package com.xml2j.tutorial.ext.handlers;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: EXT 
  Generation date: Fri Jan 13 16:19:38 CET 2017 

******************************************************************************/

import org.xml.sax.XMLReader;

import com.xml2j.tutorial.ext.ProductContainerType;
import com.xml2j.tutorial.ext.ProductContainerTypeHandler;

import com.xml2j.xml.core.XMLMessageHandler;
import com.xml2j.xml.parser.ParserTask;

/**
 * This class reads the XML document from an XML inputsource.
 *
 * This class is the entry point for the client application.
 */
public class ExtMessageHandler extends
		XMLMessageHandler<ProductContainerType> {
	
	/** root element. */	
	static final String ELEMENT_NAME = "ProductContainer";	
	
	/**
	 * Constructor.
	 *
	 * @see XMLMessageHandler XMLMessageHandler
	 * @param task 
	 *            The parser task
	 * @param reader
	 *            The (SAX) XML Reader object
	 */
	public ExtMessageHandler(ParserTask task, XMLReader reader) {
		super(reader
		, new ProductContainerTypeHandler(
			task
			, reader
			, null	// root has no parent
			, ELEMENT_NAME
			, ProductContainerType.getAllocator()
			, null	// not applicable for root
			, doProcess(ELEMENT_NAME, task))
		);
	}
}

