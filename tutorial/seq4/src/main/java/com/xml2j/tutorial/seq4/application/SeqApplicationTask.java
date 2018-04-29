package com.xml2j.tutorial.seq4.application;

/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.5.0 
  Project home: XML2J https://github.com/lolkedijkstra/ 

  Module: SEQ4 
  Generation date: Sun Apr 29 12:06:43 CEST 2018 
  Author: XML2J-GEN

******************************************************************************/

//----------------------- 		IO		-----------------------//
import java.io.IOException;
//-----------------------    	SAX		-----------------------//
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ErrorHandler;
//-----------------------    	XML2J		-----------------------//
import com.xml2j.xml.core.MessageHandler;
import com.xml2j.xml.core.ParserConfiguration;
import com.xml2j.xml.core.ParserConfigurationException;
import com.xml2j.xml.parser.ParserTask;
import com.xml2j.tutorial.seq4.handlers.SeqMessageHandler;

/**
 * An example implementation of a parser application.
 * You will need to adapt this to meet your specific requirements.
 * This example demonstrates:
 * - the glue code that connects reader and processor
 * - how you can customize error handling
 *
 * The application uses arguments passed on the command line, however
 * you can connect any class derived from java.io.InputStream.
 */
public class SeqApplicationTask extends ParserTask {
	
	/**
	 * Constructor of the application.
	 * @param configuration the runtime configuration 
	 * @throws org.xml.sax.SAXException
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 */
	public SeqApplicationTask(ParserConfiguration configuration) 
			throws SAXException, ParserConfigurationException, IOException {

 	 // To use a custom ErrorHandler:
	 // a) implement the interface org.xml.sax.ErrorHandler, 
	 // b) instantiate the custom ErrorHandler and pass it to the super constructor.
		super(configuration);
	}
	
	/**
	 * Constructor of the application.
	 * @param configuration the runtime configuration 
	 * @param errorHandler the custom error handler 
	 * @throws org.xml.sax.SAXException
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 */
	public SeqApplicationTask(ParserConfiguration configuration, ErrorHandler errorHandler)
			throws SAXException, ParserConfigurationException, IOException {
		super(configuration, errorHandler);
	}
	

	@Override
	protected MessageHandler getMessageHandler(XMLReader reader) {
		return new SeqMessageHandler(this, reader);
	}

}
