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
import static java.lang.String.format;

//import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.ParseException;
import org.xml.sax.SAXException;

import com.xml2j.Xml2jConfiguration;
import com.xml2j.Xml2jDomain;
import com.xml2j.Xml2jInterface;
import com.xml2j.Xml2jModule;

import org.slf4j.LoggerFactory;


public class Xml2jGenerator {
	private static final String VERSION = "2.5.0";
	private static Notification logger = new Notification(LoggerFactory.getLogger(Xml2jGenerator.class));
	private static CLIParser cli = new CLIParser();

		// @formatter:off
	private static String LICENSE = "\n\r---------------------------------------------------------------------------------------"
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
    static final private String DOMAIN_NAME = "domain-name";
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
	static final private String SOURCE_PATH = "source-path";
	static final private String AUTHOR = "author";
	static final private String CUSTOMHEADER = "custom-header";

	static final private String SERIALIZATION = "with-serialization";
	static final private String SERIALVERSION_UID = "serialversion-uid";

	static final private String XML2J_VERSION = "xml2j-version";
	static final private String XML2J_VERSION_NUMBER = VERSION;


    private static Xml2jDomain domain;
    private static Xml2jModule module;
	private static Xml2jInterface iface;
	private static String moduleRoot;
	private static String modulePackage;
	private static Xml2jGeneratorSettings generatorSettings;

	/* basic settings */
	private static final String XML2J_HOME = "XML2J_HOME";
	static final String HOME = System.getenv(XML2J_HOME);
	private static final String SCHEMA = HOME + "/schema/xml2j.xsd";

	static String configFileName;
	static String workingDirectory = ".";

	private static final String SAX_PARSER_FACTORY = "org.apache.xerces.jaxp.SAXParserFactoryImpl";

	private static void initialize(CLIParser cli) {
		workingDirectory = cli.getWorkingDirectory();
		if (workingDirectory == null)
			workingDirectory = ".";

		if (!workingDirectory.equals(".")) {
			configFileName = cli.getWorkingDirectory() + "/" + cli.getConfigfileName();
		}
		else {
			configFileName = cli.getConfigfileName();
		}

		if (cli.hasVerbose()) {
			logger.info("workingDirectory: " + workingDirectory);
			logger.info("configFileName: " + configFileName);
		}

		if (cli.hasHeader()) {
			Header.readHeader(workingDirectory + '/'+ cli.getHeader());
		}

		setParserFactory();
	}

	private static void setParserFactory() {
		System.setProperty("javax.xml.parsers.SAXParserFactory", SAX_PARSER_FACTORY);
	}

	private static void validateConfiguration() {
		logger.info("Validating configuration...");

		ConfigurationValidator validator = new ConfigurationValidator(SCHEMA);
		try {
			validator.validateDocument(configFileName);
		} catch (IOException e) {
			logger.warn("Cannot find or read file: " + configFileName);
			System.exit(0);
		} catch (SAXException e) {
			logger.warn("Incorrect configuration file. \n" + e.getMessage());
			System.exit(0);
		}
	}

	private static void parseConfiguration() {
		logger.info("Reading configuration...");

		ConfigurationHandler handler = new ConfigurationHandler();
		try {
			handler.parseDocument(configFileName);
		} catch (IOException e) {
			logger.warn("Cannot find or read file: " + configFileName);
			System.exit(0);
		} catch (Exception e) {
			logger.fatal("Invalid or missing data. Reinstall XML2J Generator.");
		}
	}

	/* steps */
	// @formatter:off
	enum Step {
		STEP_ONE,
		STEP_TWO,
		STEP_THREE,
		GENERATE_JAVA,
		DEFAULT_POM,
		MASTER_POM,
		MODULE_POM
	}
	// @formatter:on

	private static Map<Step, String> steps = new EnumMap<>(Step.class);

	static {
		steps.put(Step.STEP_ONE, "xml2j1");
		steps.put(Step.STEP_TWO, "xml2j2");
		steps.put(Step.STEP_THREE, "xml2j3");
		steps.put(Step.GENERATE_JAVA, "xml2j4");
		steps.put(Step.DEFAULT_POM, "pom-single");
		steps.put(Step.MASTER_POM, "pom-master");
		steps.put(Step.MODULE_POM, "pom-module");
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
		param.put(SOURCE_PATH, workingDirectory + "/" + module.name + "/" + module.output_path);
		param.put(PRINTING, cli.hasPrint() ? "1" : "0");
		param.put(SERIALIZATION, cli.hasSerialize() ? "1" : "0");
		param.put(SERIALVERSION_UID, format("%dL", cli.getSerialize()));
		param.put(AUTHOR, cli.getAuthor());
		param.put(CUSTOMHEADER, Header.customHeader);
		param.put(XML2J_VERSION, XML2J_VERSION_NUMBER);

		return param;
	}

	private static Map<String, String> getParamStep5() {
		Map<String, String> param = new HashMap<>();

		param.put(GROUP_ID, modulePackage.substring(0, modulePackage.lastIndexOf('.')));
        param.put(DOMAIN_NAME, domain.name);
        param.put(MODULE_NAME, module.name);
        param.put(MODULE_DESCRIPTION, module.description);
		param.put(MODULE_PACKAGE, modulePackage);
		param.put(SOURCE_PATH, module.output_path);
		param.put(APPLICATION_NAME, iface.message_handler_application);
		param.put(APPLICATION_PACKAGE, modulePackage + ".application");
		param.put(XML2J_VERSION, XML2J_VERSION_NUMBER);

		if (cli.hasVerbose()) {
			logger.info(
					format("\n\tGROUP_ID: %s, \n\tDOMAIN_NAME: %s, \n\tMODULE_NAME: %s, \n\tMODULE_DESCRIPTION: %s, \n\tMODULE_PACKAGE: %s, \n\tSOURCE_PATH: %s, \n\tAPPLICATION_NAME: %s \n\tAPPLICATION_PACKAGE: %s",
							param.get(GROUP_ID), param.get(DOMAIN_NAME), param.get(MODULE_NAME), param.get(MODULE_DESCRIPTION), param.get(MODULE_PACKAGE), param.get(SOURCE_PATH), param.get(APPLICATION_NAME), param.get(APPLICATION_PACKAGE))
			);
		}

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

		case DEFAULT_POM:
		case MASTER_POM:
		case MODULE_POM:
			return getParamStep5();
		}
		return null;
	}

	private static ByteArrayOutputStream performStep(final Step step, final InputStream input) {
		final Map<String, String> param = getParam(step);
		Transformation t = new Transformation(steps.get(step), param);

		String inSystemId = Step.STEP_ONE == step ? getSchemaFileName(iface) : null;
		return t.executeStep(input, inSystemId);
	}

	private static String getSchemaFileName(Xml2jInterface i) {
		String name = module.input_path != null ? module.name  + "/" + module.input_path : (domain.input_path != null ? domain.input_path : "schema");
		return moduleRoot + "/" + name + "/" + i.name;
	}

	private static InputStream getInputStream() {
		InputStream input = null;
		try {
			String name = getSchemaFileName(iface);

			if (cli.hasVerbose())
				logger.info(name);

			input = new FileInputStream(name);
		} catch (FileNotFoundException e) {
			logger.error(e.getMessage());
		}
		return input;
	}

	private static InputStream toInputStream(final ByteArrayOutputStream output) {
		return new ByteArrayInputStream(output.toByteArray());
	}

	private static void closeStream(final Closeable stream) {
		try {
			if (stream != null)
				stream.close();
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
	}

	private static void generateCodeForDomain(final Xml2jDomain d) {
		if (cli.hasVerbose())
			d.print(System.out);

		List<Xml2jModule> modules = d.modules();
		for (Xml2jModule m : modules) {
			generateCodeForModule(m);
		}
	}

	private static void generateCodeForModule(final Xml2jModule m) {
		/* remove old code? */
		if (cli.hasRemove()) {
			String sourcePath = workingDirectory + "/" + m.output_path;
			logger.info("Removing directory: " + sourcePath);
			fileDelRecursive(new File(sourcePath));
		}

		/* setting parameters for code generation */
		module = m;
		moduleRoot = workingDirectory;
		modulePackage = generatorSettings.domainpackage + "." + module.name;

		if (cli.hasVerbose())
			module.print(System.out);

		/* for all interfaces in module generate code */
		List<Xml2jInterface> interfaces = m.interfaces();
		for (Xml2jInterface i : interfaces) {
            logger.info(getSchemaFileName(i));
			generateCodeForInterface(i);
		}
	}

	private static void generateCodeForInterface(final Xml2jInterface i) {
		iface = i;

		/* print configuration parameters */
		if (cli.hasVerbose())
			iface.print(System.out);

		if (iface.message_handler_application != null
				&& iface.message_handler_runnable == null
				&& iface.message_handler_application_task == null)
			iface.message_handler_application_task = iface.message_handler_application + "Task";

		try {
			/* transformation steps */
			InputStream input = getInputStream();
			ByteArrayOutputStream output;

			Step step = Step.STEP_ONE;
			output = performStep(step, input);
			if (cli.hasIntermediate())
				writeTransformationResultFile(iface.name, output.toByteArray(), step);
			closeStream(input);

			step = Step.STEP_TWO;
			input = toInputStream(output);
			closeStream(output);
			output = performStep(step, input);
			if (cli.hasIntermediate())
				writeTransformationResultFile(iface.name, output.toByteArray(), step);
			closeStream(input);

			step = Step.STEP_THREE;
			input = toInputStream(output);
			closeStream(output);
			output = performStep(step, input);
			if (cli.hasIntermediate())
				writeTransformationResultFile(iface.name, output.toByteArray(), step);
			closeStream(input);

			input = toInputStream(output);
			output = performStep(Step.GENERATE_JAVA, input);
			closeStream(output);
			closeStream(input);
		} catch (RuntimeException e) {
			logger.fatal("Configuration error: reinstall.");
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
				if(!folder.mkdir()) {
					logger.error("could not create " + tmpDir);
				}
			}
			FileOutputStream fi = new FileOutputStream(format("%s/temp/%s-%s.xml", HOME, intName, step));
			fi.write(bytes);
			fi.flush();
			fi.close();
		} catch (IOException e) {
			logger.error("write intermediate: " + e.getMessage());
		}
	}

	private static boolean fileDelRecursive(File file) {
		if (!file.exists())
			return false;

		File[] files = file.listFiles();
		if (files != null) {
			for (File f : files) {
				fileDelRecursive(f);
			}
		}
		return file.delete();
	}

	private static void writeFile(byte[] bytes, final String pom) {
		try (FileOutputStream f = new FileOutputStream(pom)) {
			f.write(bytes);
			f.flush();
		} catch (IOException e) {
			logger.error(format("Failed writing POM file: %s %s", pom, e.getMessage()) );
		}
	}

	private static void generateMasterPom() {
		final Step step = Step.MASTER_POM;
		final String empty = "<?xml version=\"1.0\" encoding=\"utf-8\"?><modules>";

		StringBuilder stringBuilder = new StringBuilder(empty);
		for( Xml2jModule m : domain.modules()) {
			stringBuilder.append("<module xmlns=\"http://maven.apache.org/POM/4.0.0\">").append(m.name).append("</module>");
		}
		stringBuilder.append("</modules>");

		try {
			Transformation t = new Transformation(steps.get(step), getParam(step));

			final String xml = stringBuilder.toString();
			final String pom = workingDirectory + "/pom.xml";
			InputStream input = new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8));
			ByteArrayOutputStream output = t.executeStep(input, null);

			logger.info("Creating (master) POM file: " + pom);
			writeFile(output.toByteArray(), pom);

			closeStream(input);
			closeStream(output);
		} catch (RuntimeException e) {
			logger.fatal("Configuration error: reinstall.");
		}
	}

	private static void generateModulePom(Xml2jModule m, boolean child) {
		final Step step = child ? Step.MODULE_POM : Step.DEFAULT_POM;

		if (m.interfaces().isEmpty()) {
			logger.warn(format("Module has no interfaces. POM cannot be generated for module %s.", m.name));
			return;
		}

		final String empty = "<?xml version=\"1.0\" encoding=\"utf-8\"?><document xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\"/>";
		InputStream input = new ByteArrayInputStream(empty.getBytes(StandardCharsets.UTF_8));

		if (module.interfaces().size() > 1) {
			logger.warn(format("Module %s has more than 1 interface. Settings of first interface are used for module POM.", module.name));
		}

		/* set parameters for pom generation */
		module = m;
		modulePackage = generatorSettings.domainpackage + "." + module.name;
		iface = module.interfaces().get(0);

		Transformation t = new Transformation(steps.get(step), getParam(step));
		ByteArrayOutputStream output = t.executeStep(input, null);

		String pomFile = null;
		String type = null;
		switch (step) {
			case MODULE_POM:
				pomFile = workingDirectory + "/" + module.name + "/pom.xml";
				type = "(module)";
				break;
			case DEFAULT_POM:
				pomFile = workingDirectory + "/pom.xml";
				type = "(default)";
				break;
		}
		logger.info(format("Creating %s POM file: %s", type, pomFile));
		writeFile(output.toByteArray(), pomFile);

		closeStream(input);
		closeStream(output);
	}

	private static void generatePomFiles(final Xml2jDomain d) {
		List<Xml2jModule> modules = d.modules();
		boolean hierarchical = modules.size() > 1;

		if (hierarchical) {
			generateMasterPom();
		}
		for (Xml2jModule m : modules) {
			generateModulePom(m, hierarchical);
		}
	}



	public static void main(final String[] args) {
		if (HOME == null) {
			logger.fatal("Configuration error. Missing environment variable: XML2J_HOME.");
		}

		/* set command line options */
		try {
			cli.parse(args);
		} catch (ParseException e) {
			logger.message(e.getMessage());
			return;
		}

		/* exit conditions */
		if (cli.doPrintVersion()) {
			logger.message(VERSION);
			return;
		}

		if (cli.doPrintLicense()) {
			logger.message(LICENSE);
			return;
		}

		if (cli.doPrintHelp() || !cli.hasConfig()) {
			cli.printHelp();
			return;
		}

		/* initialization */
		Xml2jGenerator.initialize(cli);
		validateConfiguration();
		parseConfiguration();

		/* load configuration */
		Xml2jConfiguration configuration = Xml2jConfiguration.instance();
		generatorSettings = new Xml2jGeneratorSettings(configuration, workingDirectory);
		domain = configuration.getDomain();

		/* start transformation */
		logger.info("Generating java code...");

		/* generate code */
		generateCodeForDomain(configuration.getDomain());

		if (cli.hasPom()) {
			generatePomFiles(configuration.getDomain());
		}
	}
}
