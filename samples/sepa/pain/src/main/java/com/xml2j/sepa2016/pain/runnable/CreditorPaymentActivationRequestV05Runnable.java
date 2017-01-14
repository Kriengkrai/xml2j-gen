package com.xml2j.sepa2016.pain.runnable;

/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: PAIN 
  Generation date: Sat Jan 14 14:27:48 CET 2017 

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

import com.xml2j.sepa2016.pain.handlers.CreditorPaymentActivationRequestV05MessageHandler;

/**
 * An example implementation of a task.
 * Adapt this to meet your specific requirements.
 * Use XML parser tasks with threads.
 */
public class CreditorPaymentActivationRequestV05Runnable extends ParserRunnable {
	
	/**
	 * Constructor of the task.
	 * @param configuration the runtime configuration 
	 * @throws org.xml.sax.SAXException
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 */
	public CreditorPaymentActivationRequestV05Runnable(ParserConfiguration configuration) 
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
	public CreditorPaymentActivationRequestV05Runnable(ParserConfiguration configuration, ErrorHandler errorHandler)
			throws SAXException, ParserConfigurationException, IOException {
		super(configuration, errorHandler);
	}

	@Override
	protected MessageHandler getMessageHandler(XMLReader reader) {
		return new CreditorPaymentActivationRequestV05MessageHandler(this, reader);
	}
	
}
