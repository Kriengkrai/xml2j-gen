package com.xml2j.discogs.labels.handlers;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: LABELS 
  Generation date: Mon Apr 16 18:56:35 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import org.xml.sax.XMLReader;

import com.xml2j.discogs.labels.Labels;
import com.xml2j.discogs.labels.LabelsHandler;

import com.xml2j.xml.core.XMLMessageHandler;
import com.xml2j.xml.parser.ParserTask;

/**
 * This class reads the XML document from an XML inputsource.
 *
 * This class is the entry point for the client application.
 */
public class LabelsMessageHandler extends
		XMLMessageHandler<Labels> {
	
	/** root element. */	
	static final String ELEMENT_NAME = "labels";	
	
	/**
	 * Constructor.
	 *
	 * @see XMLMessageHandler XMLMessageHandler
	 * @param task 
	 *            The parser task
	 * @param reader
	 *            The (SAX) XML Reader object
	 */
	public LabelsMessageHandler(ParserTask task, XMLReader reader) {
		super(reader
		, new LabelsHandler(
			task
			, reader
			, null	// root has no parent
			, ELEMENT_NAME
			, Labels.getAllocator()
			, null	// not applicable for root
			, doProcess(ELEMENT_NAME, task))
		);
	}
}

