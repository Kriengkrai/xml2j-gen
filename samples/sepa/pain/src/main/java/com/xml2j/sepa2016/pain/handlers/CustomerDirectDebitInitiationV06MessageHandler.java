package com.xml2j.sepa2016.pain.handlers;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: PAIN 
  Generation date: Sat Jan 14 14:27:47 CET 2017 

******************************************************************************/

import org.xml.sax.XMLReader;

import com.xml2j.sepa2016.pain.CustomerDirectDebitInitiationV06Document;
import com.xml2j.sepa2016.pain.CustomerDirectDebitInitiationV06DocumentHandler;

import com.xml2j.xml.core.XMLMessageHandler;
import com.xml2j.xml.parser.ParserTask;

/**
 * This class reads the XML document from an XML inputsource.
 *
 * This class is the entry point for the client application.
 */
public class CustomerDirectDebitInitiationV06MessageHandler extends
		XMLMessageHandler<CustomerDirectDebitInitiationV06Document> {
	
	/** root element. */	
	static final String ELEMENT_NAME = "Document";	
	
	/**
	 * Constructor.
	 *
	 * @see XMLMessageHandler XMLMessageHandler
	 * @param task 
	 *            The parser task
	 * @param reader
	 *            The (SAX) XML Reader object
	 */
	public CustomerDirectDebitInitiationV06MessageHandler(ParserTask task, XMLReader reader) {
		super(reader
		, new CustomerDirectDebitInitiationV06DocumentHandler(
			task
			, reader
			, null	// root has no parent
			, ELEMENT_NAME
			, CustomerDirectDebitInitiationV06Document.getAllocator()
			, null	// not applicable for root
			, doProcess(ELEMENT_NAME, task))
		);
	}
}

