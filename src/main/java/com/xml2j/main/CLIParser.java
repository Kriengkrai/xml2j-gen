package com.xml2j.main;

import org.apache.commons.cli.*;
import org.slf4j.LoggerFactory;
import static java.lang.String.format;

/**
 * Command line options.
 **/

class CLIParser {
    private static Notification logger = new Notification(LoggerFactory.getLogger(CLIParser.class));

    private Options options = new Options();
    private CommandLineParser parser = new DefaultParser();
    private HelpFormatter helpFormatter = new HelpFormatter();
    private CommandLine commandLine = null;

    private static final String APPLICATION = "XML2J-GEN";

    void printHelp() {
        helpFormatter.printHelp(APPLICATION, options);
    }

    CLIParser() {
        options.addOption("p", "print", false, "generate printing methods (defaults to none)")
                .addOption("l", "license", false, "print license details")
                .addOption("?", "help", false, "prints help")
                .addOption("w", "workingdirectory", true, "working directory either absolute or relative to xml2j.jar's directory")
                .addOption("h", "header", true, "insert custom header")
                .addOption("s", "serialVersionUID", true, "serialVersionUID with (long) ID (defaults to 1L)")
                .addOption("v", "verbose", false, "verbose")
                .addOption("i", "intermediate", false, "output intermediate results")
                .addOption("r", "remove", false, "remove old code before generating code")
                .addOption("version", false, "prints version")
                .addOption("pom", "pom",false, "generate POM files (defaults to none)")
                .addOption("a", "author", true, format("author (defaults to %s)", APPLICATION))
                .addOption("c", "configuration", true, "(mandatory) configuration file used by generator");
    }

    private boolean isOptionSet(String opt) {
        if (commandLine == null)
            throw new NullPointerException("Commandline has not been parsed. Must use parse first");

        boolean hasOpt = commandLine.hasOption(opt);
        return commandLine.hasOption(opt);
    }

    private String getValue(String name) {
        return isOptionSet(name) ? commandLine.getOptionValue(name) : null;
    }

    boolean doPrintVersion() {
        return isOptionSet("version");
    }
    boolean doPrintLicense() {
        return isOptionSet("l");
    }

    boolean doPrintHelp() {
        return isOptionSet("?");
    }

    String getAuthor() {
        return hasAuthor() ? getValue("a") : APPLICATION;
    }

    String getConfigfileName() {
        return getValue("c");
    }

    String getHeader() {
        return getValue("h");
    }

    String getWorkingDirectory() {
        return getValue("w");
    }

    private boolean serialVersionNaN = false;
    private long serialDefaultVersionUID = 1L;
    private long serialVersionUID = 0L;         // if 0L -> not set

    long getSerialize() {
        if(serialVersionUID != 0L)
            return serialVersionUID;

        if(serialVersionNaN)
            return serialDefaultVersionUID;

        if (hasSerialize()) {
            try {
                serialVersionUID = Long.parseLong(getValue("s"));
                return serialVersionUID;
            } catch (NumberFormatException e) {
                logger.warn(format("serialVersionUID NaN: Provided \"%s\", defaulting to 1L.", getValue("s")));
                serialVersionNaN = true;
            }
        };
        return serialDefaultVersionUID;
    }

    boolean hasAuthor() {
        return isOptionSet("a");
    }
    boolean hasConfig() {
        return isOptionSet("c");
    }
    boolean hasIntermediate() {
        return isOptionSet("i");
    }
    boolean hasHeader() {
        return isOptionSet("h");
    }
    boolean hasPom() {
        return isOptionSet("pom");
    }
    boolean hasPrint() {
        return isOptionSet("p");
    }
    boolean hasRemove() {
        return isOptionSet("r");
    }
    boolean hasSerialize() {
        return isOptionSet("s");
    }
    boolean hasVerbose() {
        return isOptionSet("v");
    }
    boolean hasWorkingDirectory() {
        return isOptionSet("w");
    }

    void parse(String[] args) throws ParseException {
        commandLine = parser.parse(options, args);
    }

}