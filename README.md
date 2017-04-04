"# xml2j-gen" 

This is the code generator that goes with xml2j (core).
Since the code generator relies on the Saxon XSLT and XQuery Processor (SAXON 6.5.5), you'll need to get it: http://prdownloads.sourceforge.net/saxon/saxon6-5-5.zip and include the saxon.jar to your build path. For your convenience I also included it in the libs folder.

If you need to generate an XSD from XML I recommend: https://devutilsonline.com/xsd-xml/generate-xsd-from-xml
This service allows you to generate an XSD using various options, of which the default works very well (Venetian Blind Design). To make sure your XSD covers the optional elements as well, paste in a sufficiently large XML sample.

**INSTALLATION**
* Add XML2J_HOME to your environment (home of the XML2J Generator)


**REBUILD FROM SCRATCH**
<<<<<<< HEAD
* If you want to rebuild xml2j-gen use: `mvn clean install`. You will probably be getting an error due to the dependency to saxon. To resolve this add the jar to your maven repo.
From the xml2j-gen directory issue the following command: `mvn install:install-file -Dfile=./libs/saxon.jar -DgroupId=com.icl.saxon -DartiffactId=saxon -Dversion=6.5.5 -Dpackaging=jar` 
=======
* If you want to rebuild xml2j-gen use: mvn clean install. You will probably be getting an error due to the dependency to saxon. To resolve this add the jar to your maven repo.
From the xml2j-gen directory issue the following command: mvn install:install-file -Dfile=./libs/saxon.jar -DgroupId=com.icl.saxon -DartiffactId=saxon -Dversion=6.5.5 -Dpackaging=jar 
>>>>>>> 36a3e720feca581c9e0857d034f4a3f8f681ba70
(assuming the jar is in the libs subdirectory) 

**Code Generation** 
* java -jar xml2j.jar -wtutorials/choice -ccfg/cfg.xml

In the example above:
* -w is the working directory for the choice project
* -c is the fully qualified name of the configuration file

To see possible arguments (help): 
* java -jar xml2j.jar

**SAMPLES**

I have added a samples directory with among others SEPA. In here I am also using Spring Data with MongoDB to persists transactions to Mongo. You will need to have [xml2j-springdata](https://github.com/lolkedijkstra/xml2j-springdata.git) as well if you want to use these samples.


The core of XML2J can be found under: 
[xml2j-core](https://github.com/lolkedijkstra/xml2j-core.git)
