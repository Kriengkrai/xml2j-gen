package com.xml2j.tutorial.subst2.handlers;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: SUBST2 
  Generation date: Fri Jan 13 16:19:39 CET 2017 

******************************************************************************/

import org.xml.sax.XMLReader;

import com.xml2j.tutorial.subst2.LibraryType_d0e8_a14;
import com.xml2j.tutorial.subst2.LibraryType_d0e8_a14Handler;

import com.xml2j.xml.core.XMLMessageHandler;
import com.xml2j.xml.parser.ParserTask;

/**
 * This class reads the XML document from an XML inputsource.
 *
 * This class is the entry point for the client application.
 */
public class Subst2MessageHandler extends
		XMLMessageHandler<LibraryType_d0e8_a14> {
	
	/** root element. */	
	static final String ELEMENT_NAME = "library";	
	
	/**
	 * Constructor.
	 *
	 * @see XMLMessageHandler XMLMessageHandler
	 * @param task 
	 *            The parser task
	 * @param reader
	 *            The (SAX) XML Reader object
	 */
	public Subst2MessageHandler(ParserTask task, XMLReader reader) {
		super(reader
		, new LibraryType_d0e8_a14Handler(
			task
			, reader
			, null	// root has no parent
			, ELEMENT_NAME
			, LibraryType_d0e8_a14.getAllocator()
			, null	// not applicable for root
			, doProcess(ELEMENT_NAME, task))
		);
	}
}

