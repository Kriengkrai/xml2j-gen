package com.xml2j.discogs.masters.processor;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML2J XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML2J code generator.
  
  Version: 2.4.2 
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 

  Module: MASTERS 
  Generation date: Mon Apr 16 18:56:35 CEST 2018 
  Author: XML2J-Generator

******************************************************************************/
	
import com.xml2j.discogs.masters.MasterType;
import com.xml2j.discogs.masters.repo.MastersTypeRepo;
import com.xml2j.xml.core.ComplexDataType;
import com.xml2j.xml.core.MessageProcessor;
import com.xml2j.xml.core.ProcessorException;
import com.xml2j.xml.core.XMLEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 *	This class processes events that are sent by the XML2J framework.
 */
public class MastersProcessor implements MessageProcessor {
	static private Logger logger = LoggerFactory.getLogger(MastersProcessor.class);
	final String path = new ClassPathResource("spring-config.xml").getPath();
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(path);
	MastersTypeRepo repo = context.getBean(MastersTypeRepo.class);

	private long count = 0;

	public long getCount() {
		return count;
	}
	public void closeContext() {
		context.close();
	}

	@Override
	public void process(XMLEvent evt, ComplexDataType data)
			throws ProcessorException {

		if (evt == XMLEvent.END) {
			if( data instanceof MasterType) {
				process((MasterType)data);
			}
		}
	}

	private void process(MasterType data) {
		if (logger.isInfoEnabled()) {
			count++;
			if (0==(count % 1000)){
				logger.info("Written: {}", count );
			}
		}
		try {
			long id = Long.parseLong(data.getAttr("id"));
			data.setId(id);
			repo.save(data);
		} catch (NumberFormatException e) {
			logger.error("Could not create Master with id {}", data.getId());
		}
	}
}