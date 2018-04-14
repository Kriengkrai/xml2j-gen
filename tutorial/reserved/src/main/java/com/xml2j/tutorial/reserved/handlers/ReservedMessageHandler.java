package com.xml2j.tutorial.reserved.handlers;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: RESERVED 
  Generation date: Sat Apr 14 12:01:30 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import org.xml.sax.XMLReader;

import com.xml2j.tutorial.reserved.ContainerType_d0e3_a2;
import com.xml2j.tutorial.reserved.ContainerType_d0e3_a2Handler;

import com.xml2j.xml.core.XMLMessageHandler;
import com.xml2j.xml.parser.ParserTask;

/**
 * This class reads the XML document from an XML inputsource.
 *
 * This class is the entry point for the client application.
 */
public class ReservedMessageHandler extends
		XMLMessageHandler<ContainerType_d0e3_a2> {
	
	/** root element. */	
	static final String ELEMENT_NAME = "container";	
	
	/**
	 * Constructor.
	 *
	 * @see XMLMessageHandler XMLMessageHandler
	 * @param task 
	 *            The parser task
	 * @param reader
	 *            The (SAX) XML Reader object
	 */
	public ReservedMessageHandler(ParserTask task, XMLReader reader) {
		super(reader
		, new ContainerType_d0e3_a2Handler(
			task
			, reader
			, null	// root has no parent
			, ELEMENT_NAME
			, ContainerType_d0e3_a2.getAllocator()
			, null	// not applicable for root
			, doProcess(ELEMENT_NAME, task))
		);
	}
}

