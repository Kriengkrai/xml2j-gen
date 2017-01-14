package com.xml2j.sepa2016.pain.application;

/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: PAIN 
  Generation date: Sat Jan 14 14:27:48 CET 2017 

******************************************************************************/


//----------------------- 		IO		-----------------------//
import java.io.FileInputStream;
import java.io.IOException;
//-----------------------    LOGGING	-----------------------//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//-----------------------    	SAX		-----------------------//
import org.xml.sax.SAXException;
//-----------------------    	XML2J		-----------------------//
import com.xml2j.xml.core.ParserConfiguration;
import com.xml2j.xml.core.ProcessorException;

import com.xml2j.xml.parser.ParserRunnable;
import com.xml2j.util.DefaultThreadManager;
	
import com.xml2j.sepa2016.pain.runnable.CreditorPaymentActivationRequestV05Runnable;

import com.xml2j.sepa2016.pain.processor.CreditorPaymentActivationRequestV05Processor;

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
public class CreditorPaymentActivationRequestV05Application {
	
	/** command line parameters */
	private final static String usage = "parameters:\n\t(1): xml input \n\t(2): config \n\t(3): schema";

	/** print command line usage */
	private static void usage() {
		System.out.println(usage);
		System.exit(0);
	}

	/**
	 * Entry point of the application.
	 * @param args args[0] = XML, args[1] = runtime configuration, args[2] = XML Schema
	 */
	public static void main(String[] args) {
		if (args.length < 2) {
			usage();
		}

		// get program arguments
		final String xml = args[0];
		final String config = args[1];
		final String schema = args.length >= 3 ? args[2] : null;
		
		// initialize logger component
		Logger log = LoggerFactory.getLogger(CreditorPaymentActivationRequestV05Application.class);
		
		try {
			log.info("Starting application.");
			
			// load runtime configuration
			log.info("Loading runtime configuration");
			ParserConfiguration configuration = new ParserConfiguration(config);
	
			// create thread manager
			DefaultThreadManager manager = new DefaultThreadManager();

			// create a task object
			ParserRunnable task = new CreditorPaymentActivationRequestV05Runnable(configuration);

			// validate (optional)
			if (schema != null) {
				log.info("Validating {} against {}", xml, schema);
				task.validateXML(new FileInputStream(xml), new FileInputStream(schema));
			}

			// prepare the XML parser
			task.prepareStart(new FileInputStream(xml), new CreditorPaymentActivationRequestV05Processor());
				
			// add the task to list of tasks
			manager.addTask("CreditorPaymentActivationRequestV05Runnable", task);

			// when all tasks have been added start threads	
			manager.startThreads();
			
			log.info("Processing complete.");
			
		} catch (ProcessorException e) {
			log.error("Execution aborted due to PROCESSING error (\n\tmessage: {}\n\tcause: {})"
						, e.getMessage()
						, e.getCause());
		} catch (SAXException | IOException e) {
			log.error(e.getMessage());
		} 
	}	 
}
