package com.xml2j.tutorial.choice.handlers;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: CHOICE 
  Generation date: Fri Jan 13 16:19:38 CET 2017 

******************************************************************************/

import org.xml.sax.XMLReader;

import com.xml2j.tutorial.choice.ContainerType_d0e5_a6;
import com.xml2j.tutorial.choice.ContainerType_d0e5_a6Handler;

import com.xml2j.xml.core.XMLMessageHandler;
import com.xml2j.xml.parser.ParserTask;

/**
 * This class reads the XML document from an XML inputsource.
 *
 * This class is the entry point for the client application.
 */
public class ChoiceMessageHandler extends
		XMLMessageHandler<ContainerType_d0e5_a6> {
	
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
	public ChoiceMessageHandler(ParserTask task, XMLReader reader) {
		super(reader
		, new ContainerType_d0e5_a6Handler(
			task
			, reader
			, null	// root has no parent
			, ELEMENT_NAME
			, ContainerType_d0e5_a6.getAllocator()
			, null	// not applicable for root
			, doProcess(ELEMENT_NAME, task))
		);
	}
}

