package com.xml2j.tutorial.zoo.handlers;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: ZOO 
  Generation date: Fri Jan 13 16:19:39 CET 2017 

******************************************************************************/

import org.xml.sax.XMLReader;

import com.xml2j.tutorial.zoo.ZooCollection;
import com.xml2j.tutorial.zoo.ZooCollectionHandler;

import com.xml2j.xml.core.XMLMessageHandler;
import com.xml2j.xml.parser.ParserTask;

/**
 * This class reads the XML document from an XML inputsource.
 *
 * This class is the entry point for the client application.
 */
public class ZooCollectionMessageHandler extends
		XMLMessageHandler<ZooCollection> {
	
	/** root element. */	
	static final String ELEMENT_NAME = "zooCollection";	
	
	/**
	 * Constructor.
	 *
	 * @see XMLMessageHandler XMLMessageHandler
	 * @param task 
	 *            The parser task
	 * @param reader
	 *            The (SAX) XML Reader object
	 */
	public ZooCollectionMessageHandler(ParserTask task, XMLReader reader) {
		super(reader
		, new ZooCollectionHandler(
			task
			, reader
			, null	// root has no parent
			, ELEMENT_NAME
			, ZooCollection.getAllocator()
			, null	// not applicable for root
			, doProcess(ELEMENT_NAME, task))
		);
	}
}

