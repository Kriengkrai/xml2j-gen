package com.xml2j.main;
/********************************************************************************
Copyright 2016, 2017 Lolke B. Dijkstra

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

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import com.xml2j.Xml2jConfiguration;
import com.xml2j.Xml2jDomain;
import com.xml2j.Xml2jInterface;
import com.xml2j.Xml2jModule;

public class ConfigurationHandler extends org.xml.sax.helpers.DefaultHandler {

	final static String BASE = "base";
	final static String NAME = "name";
	final static String DESCRIPTION = "description";
	final static String PACKAGE_NAME = "package-name";
	final static String MODULE_NAME = "module-name";
	final static String MESSAGE_HANDLER_ROOT = "message-handler-root";
	final static String MESSAGE_HANDLER_NAME = "message-handler-name";
	final static String MESSAGE_HANDLER_PACKAGE = "message-handler-package";
	final static String MESSAGE_HANDLER_PROCESSOR = "message-handler-processor";
	final static String MESSAGE_HANDLER_RUNNABLE = "message-handler-runnable";
	final static String MESSAGE_HANDLER_APPLICATION_TASK = "message-handler-application-task";
	final static String MESSAGE_HANDLER_APPLICATION = "message-handler-application";
	final static String ROOT_TYPE_RENAME = "root-type-rename";
	final static String INPUT_PATH = "input-path";
	final static String OUTPUT_PATH = "output-path";

	private final Xml2jConfiguration configuration = Xml2jConfiguration.instance();

	public void parseDocument(final String document) throws SAXException, IOException, ParserConfigurationException {
		// get a factory
		SAXParserFactory spf = SAXParserFactory.newInstance();

		// get a new instance of parser
		SAXParser sp = spf.newSAXParser();

		// parse the file and also register this class for call backs
		sp.parse(document, this);
	}

	@Override
	public void startElement(final String uri, final String localName, final String qName, final Attributes atts) throws SAXException {

		if (qName.equals("xml2j-generator")) {
			//
		} else if (qName.equals("domain")) {
			Xml2jDomain domain = new Xml2jDomain();
			domain.base = atts.getValue(BASE);
			domain.name = atts.getValue(NAME);
			configuration.add(domain);

		} else if (qName.equals("module")) {
			Xml2jModule module = new Xml2jModule();
			module.name = atts.getValue(NAME);
			module.description = atts.getValue(DESCRIPTION);
			module.input_path = atts.getValue(INPUT_PATH);
			module.output_path = atts.getValue(OUTPUT_PATH);
			configuration.getDomain().add(module);

		} else if (qName.equals("interface")) {
			Xml2jInterface intf = new Xml2jInterface();
			intf.name = atts.getValue(NAME);
			intf.message_handler_root = atts.getValue(MESSAGE_HANDLER_ROOT);
			intf.message_handler_name = atts.getValue(MESSAGE_HANDLER_NAME);
			intf.root_type_rename = atts.getValue(ROOT_TYPE_RENAME);
			intf.message_handler_processor = atts.getValue(MESSAGE_HANDLER_PROCESSOR);
			intf.message_handler_runnable = atts.getValue(MESSAGE_HANDLER_RUNNABLE);
			intf.message_handler_application_task = atts.getValue(MESSAGE_HANDLER_APPLICATION_TASK);
			intf.message_handler_application = atts.getValue(MESSAGE_HANDLER_APPLICATION);
			configuration.getDomain().current().add(intf);
		}
	}
}
