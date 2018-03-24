package com.xml2j.tutorial.choice.application;

/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: CHOICE 
  Generation date: Sat Mar 24 17:37:02 CET 2018 
  Author: XML2J-Generator

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
import com.xml2j.tutorial.choice.handlers.ChoiceMessageHandler;

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
public class ChoiceApplicationTask extends ParserTask {
	
	/**
	 * Constructor of the application.
	 * @param configuration the runtime configuration 
	 * @throws org.xml.sax.SAXException
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 */
	public ChoiceApplicationTask(ParserConfiguration configuration) 
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
	public ChoiceApplicationTask(ParserConfiguration configuration, ErrorHandler errorHandler)
			throws SAXException, ParserConfigurationException, IOException {
		super(configuration, errorHandler);
	}
	

	@Override
	protected MessageHandler getMessageHandler(XMLReader reader) {
		return new ChoiceMessageHandler(this, reader);
	}

}
