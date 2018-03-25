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

	/* basic settings */
	private static final String XML2J_HOME = "XML2J_HOME";
	static final String HOME = System.getenv(XML2J_HOME);
	private static final String SCHEMA = HOME + "/schema/xml2j.xsd";


	private static final String SAXPARSERFACTORY = "org.apache.xerces.jaxp.SAXParserFactoryImpl";

	private static void initialize() {
		if (!Options.workingDirectory.equals("."))
			Options.configFileName = Options.workingDirectory + "/" + Options.configFileName;

		if (Options.verbose) {
			Notification.message("workingDirectory: " + Options.workingDirectory);
			Notification.message("configFileName: " + Options.configFileName);
		}

		if (CommandLine.headerFile != null) {
			Header.readHeader(CommandLine.headerFile);
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
			if (Options.verbose)
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

	private static void closeStream(final Closeable stream) {
		try {
			stream.close();
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

	// TODO needs refactoring
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
        closeStream(output);
		output = performStep(step, input);
		if (Options.intermediate)
			writeTransformationResultFile(iface.name, output.toByteArray(), step);
		closeStream(input);

		step = Step.STEP_THREE;
		input = toInputStream(output);
        closeStream(output);
		output = performStep(step, input);
		if (Options.intermediate)
			writeTransformationResultFile(iface.name, output.toByteArray(), step);
		closeStream(input);

		input = toInputStream(output);
		output = performStep(Step.GENERATE_JAVA, input);
        closeStream(output);
        closeStream(input);

		if (Options.pom) {
			input = new ByteArrayInputStream(EMPTY_DOCUMENT.getBytes(StandardCharsets.UTF_8));
			output = performStep(Step.GENERATE_POM, input);
			closeStream(input);
			writeMvnPomFile(output.toByteArray());
            closeStream(output);
		}
	}

    private static int count = 0;
	// TODO needs refactoring: if required generate master pom and child poms
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
