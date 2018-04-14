package com.xml2j.discogs.releases.handlers;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: RELEASES 
  Generation date: Sat Apr 14 18:02:46 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import org.xml.sax.XMLReader;

import com.xml2j.discogs.releases.Releases;
import com.xml2j.discogs.releases.ReleasesHandler;

import com.xml2j.xml.core.XMLMessageHandler;
import com.xml2j.xml.parser.ParserTask;

/**
 * This class reads the XML document from an XML inputsource.
 *
 * This class is the entry point for the client application.
 */
public class ReleasesMessageHandler extends
		XMLMessageHandler<Releases> {
	
	/** root element. */	
	static final String ELEMENT_NAME = "releases";	
	
	/**
	 * Constructor.
	 *
	 * @see XMLMessageHandler XMLMessageHandler
	 * @param task 
	 *            The parser task
	 * @param reader
	 *            The (SAX) XML Reader object
	 */
	public ReleasesMessageHandler(ParserTask task, XMLReader reader) {
		super(reader
		, new ReleasesHandler(
			task
			, reader
			, null	// root has no parent
			, ELEMENT_NAME
			, Releases.getAllocator()
			, null	// not applicable for root
			, doProcess(ELEMENT_NAME, task))
		);
	}
}

