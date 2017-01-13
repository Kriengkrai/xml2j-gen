package com.xml2j.main;
/********************************************************************************
Copyright 2016 Lolke B. Dijkstra

Permission is hereby granted, free of charge, to any person obtaining a copy of 
this software and associated documentation files (the "Software"), to deal in the
Software without restriction, including without limitation the rights to use, 
copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the 
Software, and to permit persons to whom the Software is furnished to do so, 
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all 
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION 
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

Project root: https://sourceforge.net/projects/xml2j/
********************************************************************************/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;



public class ConfigurationValidator {
	
	static public class Exception extends SAXException {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public Exception(String err) {
			super(err);
		}
	}


	private String schemaName = null;
	
	public ConfigurationValidator(String schema) {
		schemaName = schema;
	}
	
	
	static class ConfigurationErrorHandler implements ErrorHandler {

		//@Override
		public void error(SAXParseException exception) throws SAXException {
			throw new Exception(exception.getMessage());
		}

		//@Override
		public void fatalError(SAXParseException exception) throws SAXException {
			throw new Exception(exception.getMessage());
		}

		//@Override
		public void warning(SAXParseException exception) throws SAXException {
			throw new Exception(exception.getMessage());
		}
	}

	
	public void validateDocument(String document) throws SAXException, FileNotFoundException, IOException {
		SchemaFactory schemaFactory = SchemaFactory
				.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		
		Schema schema = schemaFactory.newSchema(new StreamSource(schemaName));
		Validator validator = schema.newValidator();
		validator.setErrorHandler(new ConfigurationErrorHandler());
		validator.validate(new StreamSource(new FileInputStream( document )));
	}

}
