package com.xml2j.tutorial.seq1.handlers;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: SEQ1 
  Generation date: Fri Jan 13 16:19:38 CET 2017 

******************************************************************************/

import org.xml.sax.XMLReader;

import com.xml2j.tutorial.seq1.ContainerType1;
import com.xml2j.tutorial.seq1.ContainerType1Handler;

import com.xml2j.xml.core.XMLMessageHandler;
import com.xml2j.xml.parser.ParserTask;

/**
 * This class reads the XML document from an XML inputsource.
 *
 * This class is the entry point for the client application.
 */
public class SeqMessageHandler extends
		XMLMessageHandler<ContainerType1> {
	
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
	public SeqMessageHandler(ParserTask task, XMLReader reader) {
		super(reader
		, new ContainerType1Handler(
			task
			, reader
			, null	// root has no parent
			, ELEMENT_NAME
			, ContainerType1.getAllocator()
			, null	// not applicable for root
			, doProcess(ELEMENT_NAME, task))
		);
	}
}

