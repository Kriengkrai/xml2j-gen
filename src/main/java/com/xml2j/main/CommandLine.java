package com.xml2j.main;

/**
 * Command line options.
 **/

class CommandLine {

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
            + "\n\t-r remove old code before generating code"
            + "\n\t-version prints version";
    // @formatter:on

    /** print command line usage */
    static void usage() {
        Notification.message(usage);
    }

    static String headerFile = null;

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
            } else if (arg.equals("-r")) {
                Options.removeOldCode = true;
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
}