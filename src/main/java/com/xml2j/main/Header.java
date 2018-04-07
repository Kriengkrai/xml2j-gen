package com.xml2j.main;

import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Header {
    private static Notification logger = new Notification(LoggerFactory.getLogger(Header.class));
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
            logger.warn("Unable to read: " + fileName);
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                logger.warn(e.getMessage());
            }
        }
        return customHeader = input;
    }
}