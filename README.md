"# xml2j-gen" 

This is the code generator that goes with xml2j (core).
Since the code generator relies on the Saxon XSLT and XQuery Processor (SAXON 6.5.5), you'll need to get it: http://prdownloads.sourceforge.net/saxon/saxon6-5-5.zip and include the saxon.jar to your build path. For your convenience I also included it in the libs folder.

If you need to generate an XSD from XML I recommend: https://devutilsonline.com/xsd-xml/generate-xsd-from-xml
This service allows you to generate an XSD using various options, of which the default works very well (Venetian Blind Design). To make sure your XSD covers the optional elements as well, paste in a sufficiently large XML sample.

The samples folder contains some examples (sepa and others), which also use Spring Data with Mongo DB.

**INSTALLATION**

Make sure to add XML2J_HOME to your environment and set it to the home directory (root) of the generator.

Now you can generate code using the following command:
java -jar xml2j.jar -wtutorial/choice -ccfg/cfg.xml

* where -w is the working directory for the project (in this case choice) relative to XML2J_HOME
* -c is the configuration file for the generator

E.g. for the PACS domain (part of SEPA): 
java -jar xml2j.jar -wsamples/sepa -ccfg/2016pacs.xml


The core of XML2J can be found under: 
https://github.com/lolkedijkstra/xml2j-core.git
