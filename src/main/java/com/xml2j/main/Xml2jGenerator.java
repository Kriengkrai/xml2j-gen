package com.xml2j.main;
/********************************************************************************
Copyright 2016-2018 Lolke B. Dijkstra

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

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xml.sax.SAXException;

import com.xml2j.Xml2jConfiguration;
import com.xml2j.Xml2jDomain;
import com.xml2j.Xml2jInterface;
import com.xml2j.Xml2jModule;

public class Xml2jGenerator {
	private static final String VERSION = "VERSION: 2.4.2";

	// @formatter:off
	private static String license = "\n\r---------------------------------------------------------------------------------------"
			+ "\nCopyright 2016-2018 Lolke B. Dijkstra " + "\nPermission is hereby granted, free of charge, to any person obtaining a copy"
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

			+ "\nhttps://sourceforge.net/projects/xml2j/" + "\nemail: lolke@lolkedijkstra.com"
			+ "\n---------------------------------------------------------------------------------------\n";

	/* CUSTOM HEADER */
	private static String headerFile = null;
	private static String header = "\n	This software was generated using XML2J code generator. "
			+ "\n see: https://sourceforge.net/projects/xml2j/"
			+ "\n  -----------------------------------------------------------------------------\n";
	// @formatter:on

	/* input parameters for transformations */
	static final private String PACKAGE_NAME = "package-name";
	static final private String MODULE_NAME = "module-name";
	static final private String MODULE_PACKAGE = "module-package";
    static final private String MODULE_DESCRIPTION = "module-description";
	static final private String GROUP_ID = "group-id";

	static final private String MESSAGE_HANDLER_ROOT = "message-handler-root";
	static final private String MESSAGE_HANDLER_NAME = "message-handler-name";
	static final private String MESSAGE_HANDLER_PACKAGE = "message-handler-package";
	static final private String ROOT_TYPE_RENAME = "root-type-rename";

	static final private String PROCESSOR_PACKAGE = "processor-package";
	static final private String PROCESSOR_NAME = "processor-name";

	static final private String APPLICATION_NAME = "application-name";
	static final private String APPLICATION_PACKAGE = "application-package";
	static final private String APPLICATION_TASK_NAME = "application-task-name";
	static final private String APPLICATION_TASK_PACKAGE = "application-task-package";
	static final private String RUNNABLE_NAME = "runnable-name";
	static final private String RUNNABLE_PACKAGE = "runnable-package";

	static final private String PRINTING = "with-printing";
	static final private String LICENSE = "license";
	static final private String SOURCE_PATH = "source-path";
	static final private String AUTHOR = "author";
	static final private String CUSTOMHEADER = "custom-header";

	static final private String SERIALIZATION = "with-serialization";
	static final private String SERIALVERSION_UID = "serialversion-uid";

	static final private String XML2J_VERSION = "xml2j-version";
	static final private String EMPTY_DOCUMENT = "<?xml version=\"1.0\" encoding=\"utf-8\"?><document xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"/>";


	private static Xml2jModule module;
	private static Xml2jInterface iface;
	private static String moduleRoot;
	private static String modulePackage;
	private static Xml2jGeneratorSettings generatorSettings;
	private static Xml2jDomain d;

	static class Header {
		static String customHeader = null;

		static String readHeader(final String fileName) {
			String input = "\r";
			String line;

			BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader(fileName));
				for (int i = 0;; i++) {
					line = br.readLine();
					if (line == null)
						break;
					if (i == 0)
						input = input + line;
					else
						input = input + "\n" + line;
				}
			} catch (IOException e) {
				Notification.error("Unable to read: " + fileName);
			} finally {
				try {
					br.close();
				} catch (Exception e) {
					Notification.error(e.getMessage());
				}
			}
			return customHeader = input;
		}
	}

	static class Options {
		static String author = "XML2J-Generator";
		static String configFileName = null;
		static String workingDirectory = ".";
		static boolean printMethods = false;
		static boolean printLicense = false;
		static boolean printVersion = false;
		static boolean verbose = false;
		static boolean serialization = true;
		static long UID = 1L;
		static boolean intermediate = false;
		static boolean pom = false;

		static void print() {
			Notification.message("author: " + Options.author);
			Notification.message("configFileName: " + Options.configFileName);
			Notification.message("workingDirectory: " + Options.workingDirectory);
			Notification.message("printMethods: " + Options.printMethods);
			Notification.message("printLicense: " + Options.printLicense);
			Notification.message("printVersion: " + Options.printVersion);
			Notification.message("serialization: " + Options.serialization);
			Notification.message("UID: " + Options.UID);
			Notification.message("intermediate: " + Options.intermediate);
			Notification.message("pom: " + Options.pom);
		}

	}

	/**
	 * Command line options.
	 **/

	static class CommandLine {

		 static void parse(final String[] args) {

			for (String arg : args) {
				if (arg.startsWith("-a") && arg.length() > 2) {
					Options.author = arg.substring(2);
				} else if (arg.startsWith("-h")) {
					headerFile = arg.substring(2);
				} else if (arg.startsWith("-c")) {
					Options.configFileName = arg.substring(2);
				} else if (arg.startsWith("-s")) {
					try {
						Options.UID = Long.parseLong(arg.substring(2));
					} catch (Exception e) {
						Notification.message("Warning: option -s ignored (not an integral number)");
					}
				} else if (arg.equals("-p")) {
					Options.printMethods = true;
				} else if (arg.startsWith("-w")) {
					Options.workingDirectory = arg.substring(2);
				} else if (arg.equals("-v")) {
					Options.verbose = true;
				} else if (arg.equals("-l")) {
					Options.printLicense = true;
				} else if (arg.equals("-i")) {
					Options.intermediate = true;
				} else if (arg.equals("-version")) {
					Options.printVersion = true;
				} else if (arg.equals("-pom")) {
					Options.pom = true;
				}
			}

			if (Options.verbose) {
				Options.print();
			}
		}

		// @formatter:off
		/** command line parameters */
		static final String usage = "Error: Must provide configuration file. Option: -c"
				+ "\n\t-? prints this message" 
				+ "\n\t-l print license details"
				+ "\n\t-w working directory either absolute or relative to xml2j.jar's directory" 
				+ "\n\t-h[customheader] insert custom header"
				+ "\n\t-s[UID] support for serialization with optional UID" 
				+ "\n\t-p generate printing methods" 
				+ "\n\t-v verbose"
				+ "\n\t-i output intermediate results" 
				+ "\n\t-version prints version";
		// @formatter:on

		/** print command line usage */
		static void usage() {
			Notification.message(usage);
		}
	}

	/* basic settings */
	private static final String XML2J_HOME = "XML2J_HOME";
	static final String HOME = System.getenv(XML2J_HOME);
	private static final String SCHEMA = HOME + "/schema/xml2j.xsd";
	private static final String BASE = "com.xml2j";

	private static final String SAXPARSERFACTORY = "org.apache.xerces.jaxp.SAXParserFactoryImpl";

	private static void initialize() {
		if (!Options.workingDirectory.equals("."))
			Options.configFileName = Options.workingDirectory + "/" + Options.configFileName;

		if (Options.verbose) {
			Notification.message("workingDirectory: " + Options.workingDirectory);
			Notification.message("configFileName: " + Options.configFileName);
		}

		if (headerFile != null) {
			Header.readHeader(headerFile);
		}

		setParserFactory();
	}

	private static void setParserFactory() {
		System.setProperty("javax.xml.parsers.SAXParserFactory", SAXPARSERFACTORY);
	}

	private static void validateConfiguration() {
		Notification.message("Validating configuration...");

		ConfigurationValidator validator = new ConfigurationValidator(SCHEMA);
		try {
			validator.validateDocument(Options.configFileName);
		} catch (IOException e) {
			Notification.error("Cannot find or read file: " + Options.configFileName);
		} catch (SAXException e) {
			Notification.error("Incorrect configuration file. \n" + e.getMessage());
		}
	}

	private static void parseConfiguration() {
		Notification.message("Reading configuration...");

		ConfigurationHandler handler = new ConfigurationHandler();
		try {
			handler.parseDocument(Options.configFileName);
		} catch (IOException e) {
			Notification.error("Cannot find or read file: " + Options.configFileName);
		} catch (Exception e) {
			Notification.error("Invalid or missing data. Reinstall XML2J Generator.");
		}
	}

	private static class Xml2jGeneratorSettings {
		String workingDirectory;
		String base;
		String domainname;
		String domainpackage;
		Xml2jConfiguration configuration;

		Xml2jGeneratorSettings(final Xml2jConfiguration configuration, final String workingDir) {
			this.configuration = configuration;
			this.workingDirectory = workingDir;
			this.setNames();
		}

		private void setNames() {
			Xml2jDomain domain = configuration.getDomain();

			/* create package names */
			base = domain.base != null && !domain.base.isEmpty() ? domain.base : BASE;
			domainname = domain.name != null && !domain.name.isEmpty() ? ("." + domain.name) : "";
			domainpackage = base + domainname;
		}
	}

	/* steps */
	enum Step {
		STEP_ONE, STEP_TWO, STEP_THREE, GENERATE_JAVA, GENERATE_POM
	}

	private static Map<Step, String> steps = new EnumMap<>(Step.class);

	static {
		steps.put(Step.STEP_ONE, "xml2j1");
		steps.put(Step.STEP_TWO, "xml2j2");
		steps.put(Step.STEP_THREE, "xml2j3");
		steps.put(Step.GENERATE_JAVA, "xml2j4");
		steps.put(Step.GENERATE_POM, "xml2j5");
	}

	private static Map<String, String> getParamStep1() {
		return new HashMap<>();
	}

	private static Map<String, String> getParamStep2() {
		Map<String, String> param = new HashMap<>();

		param.put(Xml2jGenerator.PACKAGE_NAME, modulePackage);
		param.put(Xml2jGenerator.MODULE_NAME, module.name);

		return param;
	}

	private static Map<String, String> getParamStep3() {
		Map<String, String> param = new HashMap<>();

		param.put(MESSAGE_HANDLER_ROOT, iface.message_handler_root);
		param.put(MESSAGE_HANDLER_NAME, iface.message_handler_name);
		param.put(MESSAGE_HANDLER_PACKAGE, modulePackage + ".handlers");
		param.put(ROOT_TYPE_RENAME, iface.root_type_rename);

		return param;
	}

	private static Map<String, String> getParamStep4() {
		Map<String, String> param = new HashMap<>();

		param.put(MODULE_NAME, module.name);
		param.put(MODULE_PACKAGE, modulePackage);
		param.put(PROCESSOR_NAME, iface.message_handler_processor);
		param.put(PROCESSOR_PACKAGE, modulePackage + ".processor");
		param.put(RUNNABLE_NAME, iface.message_handler_runnable);
		param.put(RUNNABLE_PACKAGE, modulePackage + ".runnable");
		param.put(APPLICATION_TASK_NAME, iface.message_handler_application_task);
		param.put(APPLICATION_TASK_PACKAGE, modulePackage + ".application");
		param.put(APPLICATION_NAME, iface.message_handler_application);
		param.put(APPLICATION_PACKAGE, modulePackage + ".application");
		param.put(MESSAGE_HANDLER_NAME, iface.message_handler_name);
		param.put(MESSAGE_HANDLER_PACKAGE, modulePackage + ".handlers");
		param.put(SOURCE_PATH, Options.workingDirectory + "/" + module.output_path);
		param.put(PRINTING, Options.printMethods ? "1" : "0");
		param.put(SERIALIZATION, Options.serialization ? "1" : "0");
		param.put(SERIALVERSION_UID, String.format("%dL", Options.UID));
		param.put(AUTHOR, Options.author);
		param.put(CUSTOMHEADER, Header.customHeader);

		return param;
	}

	private static Map<String, String> getParamStep5() {
		Map<String, String> param = new HashMap<>();

		param.put(GROUP_ID, modulePackage.substring(0, modulePackage.lastIndexOf('.')));
        param.put(MODULE_NAME, module.name);
        param.put(MODULE_DESCRIPTION, module.description);
		param.put(MODULE_PACKAGE, modulePackage);
		param.put(APPLICATION_NAME, iface.message_handler_application);
		param.put(APPLICATION_PACKAGE, modulePackage + ".application");

		param.put(SOURCE_PATH, module.output_path);

		return param;
	}


	private static Map<String, String> getParam(final Step step) {
		switch (step) {
		case STEP_ONE:
			return getParamStep1();

		case STEP_TWO:
			return getParamStep2();

		case STEP_THREE:
			return getParamStep3();

		case GENERATE_JAVA:
			return getParamStep4();

		case GENERATE_POM:
			return getParamStep5();
		}
		return null;
	}

	private static boolean isIntermediateStep(final Step step) {
		return (step == Step.STEP_ONE || step == Step.STEP_TWO || step == Step.STEP_THREE);
	}

	private static ByteArrayOutputStream performStep(final Step step, final InputStream input) {
		final Map<String, String> param = getParam(step);
		Transformation t = new Transformation(steps.get(step), param);

		String inSystemId = Step.STEP_ONE == step ? moduleRoot + iface.name : null;
		ByteArrayOutputStream output = t.executeStep(input, inSystemId);

		return output;
	}

	private static InputStream getInputStream() {
		InputStream input = null;
		try {
			if (Xml2jGenerator.Options.verbose)
				Notification.message(moduleRoot + iface.name);

			input = new FileInputStream(moduleRoot + iface.name);
		} catch (FileNotFoundException e) {
			Notification
					.error(String.format("%s \nDETAIL: module '%s' input_path, name = { %s, %s }", e.getMessage(), module.name, module.input_path, iface.name));
		}
		return input;
	}

	private static InputStream toInputStream(final ByteArrayOutputStream output) {
		return new ByteArrayInputStream(output.toByteArray());
	}

	private static void closeStream(final Closeable input) {
		try {
			input.close();
		} catch (IOException e) {
			Notification.error(e.getMessage());
		}
	}

	private static void generateCodeForDomain(final Xml2jDomain d) {
		List<Xml2jModule> modules = d.modules();
		for (Xml2jModule m : modules) {
			generateCodeForModule(m);
		}
	}

    private static void generateCodeForModule(final Xml2jModule m) {
		/* setting parameters for code generation */
		module = m;
		moduleRoot = Options.workingDirectory + "/" + module.input_path + "/";
		modulePackage = generatorSettings.domainpackage + "." + module.name;

		if (Options.verbose)
			Notification.message(String.format("\n%s : %s, %s : %s", MODULE_NAME, module.name, PACKAGE_NAME, modulePackage));

		/* for all interfaces in module generate code */
		List<Xml2jInterface> interfaces = m.interfaces();
		for (Xml2jInterface i : interfaces) {
			generateCodeForInterface(i);
		}
	}

	private static void generateCodeForInterface(final Xml2jInterface i) {
		iface = i;

		/* print configuration parameters */
		if (Options.verbose)
			iface.print(System.out);
		else
			Notification.message(moduleRoot + iface.name);

		if (iface.message_handler_application != null
				&& iface.message_handler_runnable == null
				&& iface.message_handler_application_task == null)
			iface.message_handler_application_task = iface.message_handler_application + "Task";

		/* transformation steps */
		InputStream input = getInputStream();
		ByteArrayOutputStream output;

		Step step = Step.STEP_ONE;
		output = performStep(step, input);
		if (Options.intermediate)
			writeTransformationResultFile(iface.name, output.toByteArray(), step);
		closeStream(input);

		step = Step.STEP_TWO;
		input = toInputStream(output);
		output = performStep(step, input);
		if (Options.intermediate)
			writeTransformationResultFile(iface.name, output.toByteArray(), step);
		closeStream(input);

		step = Step.STEP_THREE;
		input = toInputStream(output);
		output = performStep(step, input);
		if (Options.intermediate)
			writeTransformationResultFile(iface.name, output.toByteArray(), step);
		closeStream(input);

		step = Step.GENERATE_JAVA;
		input = toInputStream(output);
		output = performStep(step, input);
		closeStream(input);

		if (Options.pom) {
			step = Step.GENERATE_POM;
			input = new ByteArrayInputStream(EMPTY_DOCUMENT.getBytes(StandardCharsets.UTF_8));
			output = performStep(step, input);
			closeStream(input);
			writeMvnPomFile(output.toByteArray());
		}
		closeStream(output);
	}

    private static int count = 0;

    private static void writeMvnPomFile(byte[] bytes) {
		try {
            String pom = Options.workingDirectory + "/pom";
            if (count != 0)
                pom += count;
            pom += ".xml";
			count++;

		    Notification.message("Creating POM file: " + pom);
			FileOutputStream fi = new FileOutputStream(pom);
			fi.write(bytes);
			fi.flush();
			fi.close();
		} catch (IOException e) {
			Notification.error("write POM: " + e.getMessage());
		}
	}

	/**
	 * Write transformation steps to existing $HOME/temp/int folder.
	 * 
	 * pre-condition: $HOME/temp directory exists
	 * @param intName
	 *            name of the interface
	 * @param bytes
	 *            input
	 * @param step
	 *            step
	 */
	private static void writeTransformationResultFile(final String intName, final byte[] bytes, final Step step) {
		try {
			final String tmpDir = HOME + "/temp";
			File folder = new File(tmpDir);
			if (!folder.exists()) {
				folder.mkdir();
			}
			FileOutputStream fi = new FileOutputStream(String.format("%s/temp/%s-%s.xml", HOME, intName, step));
			fi.write(bytes);
			fi.flush();
			fi.close();
		} catch (IOException e) {
			Notification.error("write intermediate: " + e.getMessage());
		}
	}

	public static void main(final String[] args) {
		if (HOME == null)
			Notification.error("Configuration error. Missing environment variable: XML2J_HOME.");

		if (args.length < 1) {
			CommandLine.usage();
			System.exit(0);
		}

		/* set command line options */
		CommandLine.parse(args);

		/* exit conditions */
		if (Options.printVersion) {
			Notification.message(VERSION);
			System.exit(0);
		}

		if (Options.printLicense) {
			Notification.message("LICENSE: " + license);
			System.exit(0);
		}

		if (Options.configFileName == null) {
			CommandLine.usage();
			System.exit(0);
		}

		/* initialize generator */
		Xml2jGenerator.initialize();

		/* validate configuration */
		validateConfiguration();

		/* parse configuration */
		parseConfiguration();

		/* load configuration */
		Xml2jConfiguration configuration = Xml2jConfiguration.instance();
		generatorSettings = new Xml2jGeneratorSettings(configuration, Options.workingDirectory);

		/* start transformation */
		Notification.message("Generating java code...");

		/* generate code */
		generateCodeForDomain(configuration.getDomain());
	}
}
