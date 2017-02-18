package com.xml2j.tutorial.choice.processor;


/******************************************************************************
  -----------------------------------------------------------------------------
  XML-Java XSD to Java code generator
  -----------------------------------------------------------------------------
  
  This code was generated using XML-JAVA code generator.
  Project home: XML2J https://sourceforge.net/projects/xml2j/ 
  
  Module: CHOICE 
  Generation date: Sat Feb 18 11:45:10 CET 2017 

******************************************************************************/
	
import com.xml2j.xml.core.ComplexDataType;
import com.xml2j.xml.core.MessageProcessor;
import com.xml2j.xml.core.ProcessorException;
import com.xml2j.xml.core.XMLEvent;

/**
 *	This class processes events that are sent by the XML2J framework.
 */
public class ChoiceProcessor implements MessageProcessor {

	@Override
	public void process(XMLEvent evt, ComplexDataType data)
			throws ProcessorException {

		/*
		 *	TODO Auto-generated method stub	implement your own handling here.
		 * 	Use the runtime configuration file to determine which events are to be sent to the processor.
		 */	
			
		if (evt == XMLEvent.END) {
			System.out.println( data.getClass().toString() );
		}
	}
}
