package com.xml2j.discogs.labels.runnable;

/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: LABELS 
  Generation date: Sat Apr 14 18:02:47 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/

import java.io.IOException;

//-----------------------    	SAX		-----------------------//
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
//-----------------------    	XML2J		-----------------------//
import com.xml2j.xml.core.MessageHandler;
import com.xml2j.xml.core.ParserConfiguration;
import com.xml2j.xml.core.ParserConfigurationException;
import com.xml2j.xml.parser.ParserRunnable;

import com.xml2j.discogs.labels.handlers.LabelsMessageHandler;

/**
 * An example implementation of a task.
 * Adapt this to meet your specific requirements.
 * Use XML parser tasks with threads.
 */
public class LabelsRunnable extends ParserRunnable {
	
	/**
	 * Constructor of the task.
	 * @param configuration the runtime configuration 
	 * @throws org.xml.sax.SAXException
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 */
	public LabelsRunnable(ParserConfiguration configuration) 
			throws SAXException, ParserConfigurationException, IOException {

		// To use a custom ErrorHandler:
		// a) implement the interface org.xml.sax.ErrorHandler, 
		// b) instantiate the custom ErrorHandler and pass it to the super constructor.
		super(configuration);
	}
	
	/**
	 * Constructor of the task.
	 * @param configuration the runtime configuration 
	 * @param errorHandler the custom error handler 
	 * @throws org.xml.sax.SAXException
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 */
	public LabelsRunnable(ParserConfiguration configuration, ErrorHandler errorHandler)
			throws SAXException, ParserConfigurationException, IOException {
		super(configuration, errorHandler);
	}

	@Override
	protected MessageHandler getMessageHandler(XMLReader reader) {
		return new LabelsMessageHandler(this, reader);
	}
	
}
