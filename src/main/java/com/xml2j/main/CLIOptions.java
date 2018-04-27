package com.xml2j.main;

import org.slf4j.LoggerFactory;

public class Options {
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
    static boolean removeOldCode = false;
    static boolean pom = false;

    private static Notification logger = new Notification(LoggerFactory.getLogger(Options.class));

    static void print() {
        logger.message("author: " + Options.author);
        logger.message("configFileName: " + Options.configFileName);
        logger.message("workingDirectory: " + Options.workingDirectory);
        logger.message("printMethods: " + Options.printMethods);
        logger.message("printLicense: " + Options.printLicense);
        logger.message("printVersion: " + Options.printVersion);
        logger.message("serialization: " + Options.serialization);
        logger.message("UID: " + Options.UID);
        logger.message("intermediate: " + Options.intermediate);
        logger.message("remove old code: " + Options.removeOldCode);
        logger.message("pom: " + Options.pom);
    }
}
