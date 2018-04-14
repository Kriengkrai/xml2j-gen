package com.xml2j.discogs.releases.processor;


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

import com.xml2j.discogs.releases.ReleaseType;
import com.xml2j.discogs.releases.Releases;
import com.xml2j.discogs.releases.repo.ReleasesTypeRepo;
import com.xml2j.util.ConsoleWriter;
	
import com.xml2j.xml.core.ComplexDataType;
import com.xml2j.xml.core.MessageProcessor;
import com.xml2j.xml.core.ProcessorException;
import com.xml2j.xml.core.XMLEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 *	This class processes events that are sent by the XML2J framework.
 */
public class ReleasesProcessor implements MessageProcessor {
	final String path = new ClassPathResource("spring-config.xml").getPath();
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);

	ReleasesTypeRepo repo = context.getBean(ReleasesTypeRepo.class);

	public void closeContext() {
		context.close();
	}

	@Override
	public void process(XMLEvent evt, ComplexDataType data)
			throws ProcessorException {

		/*
		 *	TODO Auto-generated method stub	implement your own handling here.
		 * 	Use the runtime configuration file to determine which events are to be sent to the processor.
		 */	
			
		if (evt == XMLEvent.END) {
			if( data instanceof ReleaseType) {
				process((ReleaseType)data);
			}
		}
	}

	private void process(ReleaseType data) {
		data.print( ConsoleWriter.out );
	}
}
