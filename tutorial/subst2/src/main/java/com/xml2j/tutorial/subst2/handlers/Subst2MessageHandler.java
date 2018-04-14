package com.xml2j.tutorial.subst2.handlers;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: SUBST2 
  Generation date: Thu Apr 12 19:34:42 CEST 2018 
  Author: XML2J-Generator

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

