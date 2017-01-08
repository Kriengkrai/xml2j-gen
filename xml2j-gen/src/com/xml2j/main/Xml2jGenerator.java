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

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import java.util.HashMap;
import java.util.Map;

import org.xml.sax.SAXException;

import com.xml2j.Xml2jConfiguration;
import com.xml2j.Xml2jDomain;
import com.xml2j.Xml2jInterface;
import com.xml2j.Xml2jModule;


public class Xml2jGenerator {
	static final String VERSION = "VERSION: 2.4.0";

	static final boolean INTERMEDIATE = true;


	final static String xsl1 = "xml2j1";
	final static String xsl2 = "xml2j2";
	final static String xsl3 = "xml2j3";
	final static String xsl4 = "xml2j4";
	
	/* input parameters */
	final static String PACKAGE_NAME = "package-name";
	final static String MODULE_NAME = "module-name";
	final static String MODULE_PACKAGE = "module-package";
	
	final static String MESSAGE_HANDLER_ROOT = "message-handler-root";
	final static String MESSAGE_HANDLER_NAME = "message-handler-name";
	final static String MESSAGE_HANDLER_PACKAGE = "message-handler-package";
	final static String ROOT_TYPE_RENAME = "root-type-rename";

	final static String PROCESSOR_PACKAGE = "processor-package";
	final static String PROCESSOR_NAME = "processor-name";

	final static String APPLICATION_NAME = "application-name";
	final static String APPLICATION_PACKAGE = "application-package";
	final static String APPLICATION_TASK_NAME = "application-task-name";
	final static String APPLICATION_TASK_PACKAGE = "application-task-package";
	final static String RUNNABLE_NAME = "runnable-name";
	final static String RUNNABLE_PACKAGE = "runnable-package";

	final static String PRINTING = "with-printing";
	final static String LICENSE = "license";
	final static String SOURCE_PATH = "source-path";
	final static String AUTHOR = "author";
	final static String CUSTOMHEADER = "custom-header";
	
	final static String SERIALIZATION = "with-serialization";
	final static String SERIALVERSION_UID = "serialversion-uid";

	static String author = null;
	static String configFileName = null;
	static String workingDirectory = ".";
	static boolean printMethods = false;
	static boolean printLicense = false;
	static boolean printVersion = false;
	static boolean verbose = false;
	static boolean serialization = true;
	static long UID = 1L;

	
	static String license = 
			"\n\r---------------------------------------------------------------------------------------"	
			+ "\nCopyright 2016 Lolke B. Dijkstra "
			+ "\nPermission is hereby granted, free of charge, to any person obtaining a copy"
			+ "\nof this software and associated documentation files (the \"Software\"), to deal"
			+ "\nin the Software without restriction, including without limitation the rights to "
			+ "\nuse, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of "
			+ "\nthe Software, and to permit persons to whom the Software is furnished to do so, "
			+ "\nsubject to the following conditions:\n"

			+ "\nThe above copyright notice and this permission notice shall be included in all copies"
			+ "\nor substantial portions of the Software.\n"
			
			+ "\nTHE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,"
			+ "\nINCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A"
			+ "\nPARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT"
			+ "\nHOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION "
			+ "\nOF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE "
			+ "\nOR THE USE OR OTHER DEALINGS IN THE SOFTWARE."
				
			+ "\nhttps://sourceforge.net/projects/xml-java/"
			+ "\nemail: lolke@lolkedijkstra.com"
			+ "\n---------------------------------------------------------------------------------------\n";	
	
	
	/* CUSTOM HEADER */
	static String headerFile = null;
	static String header =
			"\n	This software was generated using xml-java code generator. "
			+ "\n see: https://sourceforge.net/projects/xml-java/"
			+ "\n  -----------------------------------------------------------------------------\n";	

	
	static class Header {
		static String customHeader = null;

			static String readHeader(String fileName) {
				String input = "\r";
				String line = null;
				
				BufferedReader br = null;
				try {
					br = new BufferedReader(new FileReader(fileName));
					for ( int i=0 ;; i++ ) {
						line = br.readLine();
						if (line == null)
							break;
						if (i==0)
							input = input + line;
						else
							input = input + "\n" + line;
					}
				} catch (IOException e) {
					System.err.println("Unable to read: " + fileName);
				} finally {
					try {
						br.close();
					} catch (Exception e) {}
				}
				return customHeader = input;
			}
	}
	
	
	/* COMMAND LINE */
	
	static class CommandLine {
		
		public static void parse(String[] args) {

			for (String arg : args) {
				if (arg.startsWith("-a") && arg.length() > 2) {
					author = "@author " + arg.substring(2);
				} else if (arg.startsWith("-h")) {
					headerFile = arg.substring(2);
				} else if (arg.startsWith("-c")) {
					configFileName = arg.substring(2);
				} else if (arg.startsWith("-s")) {
					try {
						UID = Long.parseLong(arg.substring(2));
					} catch (Exception e) {}
				} else if (arg.equals("-p")) {
					printMethods = true;
				} else if (arg.startsWith("-w")) {
					workingDirectory = arg.substring(2);
				} else if (arg.equals("-v")) {
					verbose = true;
				} else if (arg.equals("-l")) {
					printLicense = true;
				} else if (arg.equals("-version")) {
					printVersion = true;
				} 
			}
		}

		/** command line parameters */
		public final static String usage = "Error: Must provide configuration file. Option: -c"
				+ "\n\t-? prints this message"
				+ "\n\t-l print license details"
				+ "\n\t-w working directory either absolute or relative to xml2j.jar's directory"
				+ "\n\t-h[customheader] insert custom header"
				+ "\n\t-s[UID] support for serialization with optional UID"
				+ "\n\t-p generate printing methods"
				+ "\n\t-v verbose"
				+ "\n\t-version prints version";

		/** print command line usage */
		public static void usage() {
			System.out.println(usage);
			System.exit(0);
		}
	}


	/* basic settings */
	static final String XML2J_HOME = System.getenv("XML2J_HOME");
	static final String SCHEMA = XML2J_HOME + "/schema/xml2j.xsd";
	static final String BASE = "com.xml2j";
	
    static ByteArrayOutputStream raw(String input) throws IOException {
    	InputStream is = new FileInputStream(XML2J_HOME + "/xsl/" + input + ".xsl");

    	ByteArrayOutputStream bos = null;
		try {
			bos = new ByteArrayOutputStream();
			
			byte[] buf = new byte[1024];
			int n;
			while ((n = is.read(buf)) >= 0) {
				bos.write(buf, 0, n);
			}
			return bos;

		} catch (Exception e) {
			// swallow: return null in case of failure
		} finally {
			try { is.close(); 	} catch (IOException e) {}
        }
    	return bos;
    }
	
	
	static final String SAXPARSERFACTORY = "org.apache.xerces.jaxp.SAXParserFactoryImpl";
	
  
	public static void main(String[] args) {
		if( XML2J_HOME == null )
			Notification.error("configuration error. Missing environment variable: XML2J_HOME.");

		if (args.length < 1) 
			CommandLine.usage();

		/* initialize */
		CommandLine.parse(args);

		if (Xml2jGenerator.printVersion) {
			System.out.println(VERSION);
			System.exit(0);
		}
		
		if (!workingDirectory.equals(".")) 
			configFileName = workingDirectory + "/" + configFileName;
		
		if (verbose) {
			Notification.message("workingDirectory: " + workingDirectory);
			Notification.message("configFileName: " + configFileName);
		}
		
		if (headerFile != null) {
			Header.readHeader(headerFile);
		}

		if (Xml2jGenerator.printLicense) {
			System.out.println("LICENSE: " + license);
			System.exit(0);
		}
		
		if (Xml2jGenerator.configFileName == null)
			CommandLine.usage();

		
		
		
		System.setProperty("javax.xml.parsers.SAXParserFactory",
				SAXPARSERFACTORY);
		
		/* validate configuration */
		Notification.message("Validating configuration...");

		ConfigurationValidator validator = new ConfigurationValidator(SCHEMA);
		try {
			validator.validateDocument(configFileName);
		} catch (IOException e) {
			Notification.error("Cannot find or read file: " + configFileName);
		} catch (SAXException e) {
			Notification.error("Incorrect configuration file. \n" 
					+ e.getMessage());
		} 

		/* parse configuration */
		Notification.message("Reading configuration...");

		ConfigurationHandler handler = new ConfigurationHandler();
		try {
			handler.parseDocument(configFileName);
		} catch (IOException e) {
			Notification.error("Cannot find or read file: " + configFileName);
		} catch (Exception e) {
			Notification.error("Invalid or missing data. Reinstall LDX Generator.");
		}
		
		/* load configuration */
		Xml2jConfiguration configuration = Xml2jConfiguration.instance();
		Xml2jDomain domain = configuration.getDomain();
		
		/* create package names */
		final String base = domain.base != null && !domain.base.isEmpty() ?  domain.base : BASE;
		final String domainname = domain.name != null && !domain.name.isEmpty() ? ("." + domain.name) : "";
		final String domainpackage = base + domainname;
		
		/* load transformations */
		byte[] xb1 = null, xb2 = null, xb3 = null, xb4 = null;
		try {
			xb1 = raw(xsl1).toByteArray();
			xb2 = raw(xsl2).toByteArray();
			xb3 = raw(xsl3).toByteArray();
			xb4 = raw(xsl4).toByteArray();
		} catch (IOException e1) {
			Notification.error("Unsupported option -x");
		}

		/* start transformation */
		Notification.message("Generating java code...");
		
		for( Xml2jModule m : domain.modules() ) {
			final String modulepackage = domainpackage + "." + m.name; 
			final String moduleroot = workingDirectory + "/" + m.input_path  + "/";
			
			for ( Xml2jInterface i : m.interfaces() ) {
				/* configuration parameters */
				Map<String, String> param = new HashMap<String, String>();

				if (verbose)
					i.print(System.out);
				else
					Notification.message(moduleroot + i.name);
				
				InputStream xslt1 = new ByteArrayInputStream( xb1 );
				InputStream xslt2 = new ByteArrayInputStream( xb2 );
				InputStream xslt3 = new ByteArrayInputStream( xb3 );
				InputStream xslt4 = new ByteArrayInputStream( xb4 );
				
				//////////// step 1
			
				InputStream currentXsl = xslt1;
				InputStream input = null;
				try {
					if (verbose )
						Notification.message(moduleroot + i.name);
					input = new FileInputStream(moduleroot + i.name);
				} catch (FileNotFoundException e) {
					Notification.error(String.format(
							"%s \nDETAIL: module '%s' input_path, name = { %s, %s }",
							e.getMessage(), m.name, m.input_path, i.name));
				} 
				ByteArrayOutputStream output = new ByteArrayOutputStream();
				param.clear();
				Transformation.execute(input, output, currentXsl, param, moduleroot + i.name);
								
				if (INTERMEDIATE) 
					writeIntermediate(i.name, output.toByteArray(), 1);
				
				//////////// step 2

				currentXsl = xslt2;
				input = new ByteArrayInputStream(output.toByteArray());
				output = new ByteArrayOutputStream();
				
				param.clear();
				if (verbose) 
					System.out.println(String.format("%s : %s, %s : %s", PACKAGE_NAME, modulepackage, MODULE_NAME, m.name));
				
						
				param.put(PACKAGE_NAME, modulepackage);
				param.put(MODULE_NAME, m.name);
				
				Transformation.execute(input, output, currentXsl, param, null);

				if (INTERMEDIATE) 
					writeIntermediate(i.name, output.toByteArray(), 2);
				
				//////////// step 3

				currentXsl = xslt3;
				input = new ByteArrayInputStream(output.toByteArray());
				output = new ByteArrayOutputStream();

				param.clear();
				param.put(MESSAGE_HANDLER_ROOT, i.message_handler_root);
				param.put(MESSAGE_HANDLER_NAME, i.message_handler_name);
				param.put(MESSAGE_HANDLER_PACKAGE, modulepackage + ".handlers");  
				param.put(ROOT_TYPE_RENAME, i.root_type_rename);

				Transformation.execute(input, output, currentXsl, param, null);

				if (INTERMEDIATE) 
					writeIntermediate(i.name, output.toByteArray(), 3);
				
				//////////// step 4

				currentXsl = xslt4;
				input = new ByteArrayInputStream(output.toByteArray());
				output = new ByteArrayOutputStream();
				
				if (verbose) {
					System.out.println(SOURCE_PATH + ": " + workingDirectory + "/" + m.output_path);
				}
				
				param.clear();
				param.put(MODULE_NAME, m.name);
				param.put(MODULE_PACKAGE, modulepackage);
				param.put(PROCESSOR_NAME, i.message_handler_processor);
				param.put(PROCESSOR_PACKAGE, modulepackage + ".processor");
						
				if (i.message_handler_application != null 
						&& i.message_handler_runnable == null
						&& i.message_handler_application_task == null)
					i.message_handler_application_task = i.message_handler_application + "Task";

				param.put(RUNNABLE_NAME, i.message_handler_runnable);
				param.put(RUNNABLE_PACKAGE, modulepackage + ".runnable");
				param.put(APPLICATION_TASK_NAME, i.message_handler_application_task);
				param.put(APPLICATION_TASK_PACKAGE, modulepackage + ".application");
				param.put(APPLICATION_NAME, i.message_handler_application);
				param.put(APPLICATION_PACKAGE, modulepackage + ".application");
				
				param.put(MESSAGE_HANDLER_NAME, i.message_handler_name);
				param.put(MESSAGE_HANDLER_PACKAGE, modulepackage + ".handlers");  
				param.put(SOURCE_PATH, workingDirectory + "/" + m.output_path);
				param.put(PRINTING, printMethods ? "1" : "0");
				param.put(SERIALIZATION, serialization ? "1" : "0");
				param.put(SERIALVERSION_UID, String.format("%dL", UID));
				param.put(AUTHOR, author);
				param.put(CUSTOMHEADER, Header.customHeader);
				
				Transformation.execute(input, output, currentXsl, param, null);

				if (INTERMEDIATE) 
					writeIntermediate(i.name, output.toByteArray(), 4);
				
			}
		}
	}


	/**
	 * Write intermediate steps to existing $HOME/temp/int folder.
	 * @pre $HOME/temp/int directory exists  
	 * @param intName	name of the interface 
	 * @param byteArray input
	 * @param step step
	 */
	private static void writeIntermediate(String intName, byte[] byteArray, int step) {
		try {
			FileOutputStream fi = new FileOutputStream(String.format(
					"%s/temp/int/%s-step%d.xml", System.getenv("HOME"), intName, step));
			fi.write(byteArray);
			fi.flush();
			fi.close();
		} catch (IOException e) {
			//System.err.println("write intermediate: " + e.getMessage());
		}
	}
}
