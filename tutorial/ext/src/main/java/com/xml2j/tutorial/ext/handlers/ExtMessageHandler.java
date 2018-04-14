package com.xml2j.tutorial.ext.handlers;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: EXT 
  Generation date: Sat Apr 14 12:01:30 CEST 2018 
  Author: XML2J-Generator

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

