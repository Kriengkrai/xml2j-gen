package com.xml2j.main;

import com.xml2j.Xml2jConfiguration;
import com.xml2j.Xml2jDomain;

class Xml2jGeneratorSettings {
    String workingDirectory;
    String base;
    String domainname;
    String domainpackage;
    Xml2jConfiguration configuration;

    private static final String BASE = "com.xml2j";

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