package com.xml2j.tutorial.seq1.application;

/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML-JAVA https://sourceforge.net/projects/xml-java/ 
  
  Module: SEQ1 
  Generation date: Fri Jan 13 16:19:38 CET 2017 

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

import com.xml2j.xml.parser.ParserTask;
	
import com.xml2j.tutorial.seq1.processor.SeqProcessor;

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
public class SeqApplication {
	
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
		Logger log = LoggerFactory.getLogger(SeqApplication.class);
		
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
			ParserTask app = new SeqApplicationTask(configuration);
			
			// validate (optional)
			if (schema != null) {
				log.info("Validating {} against {}", xml, schema);
				app.validateXML(new FileInputStream(xml), new FileInputStream(schema));
			}
			
			// process the XML file
			log.info("Start Processing..");	
			app.prepareStart( new FileInputStream(xml), new SeqProcessor());
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
