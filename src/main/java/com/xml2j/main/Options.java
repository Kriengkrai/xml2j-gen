package com.xml2j.main;

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
        Notification.message("remove old code: " + Options.removeOldCode);
        Notification.message("pom: " + Options.pom);
    }
}
