package com.xml2j.tutorial.ext.application;

/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.1 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: EXT 
  Generation date: Thu Apr 12 19:34:40 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/


//----------------------- 		IO		-----------------------//
import java.io.FileInputStream;
import java.io.IOException;
//-----------------------    LOGGING	-----------------------//
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//-----------------------    	SAX		-----------------------//
import org.xml.sax.SAXException;
//-----------------------    	XML2J		-----------------------//
import com.xml2j.xml.core.ParserConfiguration;
import com.xml2j.xml.core.ProcessorException;

import com.xml2j.xml.parser.ParserTask;
	
import com.xml2j.tutorial.ext.processor.ExtProcessor;

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
public class ExtApplication {
	
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
		BasicConfigurator.configure();
		Logger log = LoggerFactory.getLogger(ExtApplication.class);
		
		try {
			log.info("Starting application.");
			
			// load runtime configuration
			log.info("Loading runtime configuration");
			ParserConfiguration configuration = new ParserConfiguration(config);
	
			/*	
				single threaded mode. to use multiple processors simultaneously specify message-handler-runnable.
				see: documentation version 2.3.0
			*/
			// create the application object
			ParserTask app = new ExtApplicationTask(configuration);
			
			// validate (optional)
			if (schema != null) {
				log.info("Validating {} against {}", xml, schema);
				app.validateXML(new FileInputStream(xml), new FileInputStream(schema));
			}
			
			// process the XML file
			log.info("Start Processing..");	
			app.prepareStart( new FileInputStream(xml), new ExtProcessor());
			app.processXML();
			
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
