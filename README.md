**XML2J-GENERATOR**

This is the code generator that goes with xml2j-core.
This tool lets you generate xml handling code for your Java applications. The generator generates code using multiple steps. All code is included. 
You have full access to the source code that does the intermediate transformations.

**Maven in favour of Ant**

I have no appetite for maintaining the ant build files. Instead I have opted to go Maven. The code generator itself also now supports generation of a project POM file.

**Dependencies**

The code generator relies on the Saxon XSLT and XQuery Processor (SAXON 6.5.5), which is included in the libs subdirectory. You can also get it from here: http://prdownloads.sourceforge.net/saxon/saxon6-5-5.zip

If you need to generate an XSD from XML, I recommend: https://devutilsonline.com/xsd-xml/generate-xsd-from-xml
This service allows you to generate an XSD using various options, of which the default works very well (Venetian Blind Design). To make sure your XSD covers the optional elements as well, paste in a sufficiently large XML sample.

**First Use**
* Add XML2J_HOME to your environment (home directory of the XML2J Generator)
* For the generated code to work, you'll need the XML2J-CORE project, you can find it here: https://github.com/lolkedijkstra/xml2j-core
* Please, from the XML2J-CORE directory build and install the core library: `mvn clean install` 


**Rebuild the code generator**
* If you want to rebuild xml2j-gen use: `mvn clean install`. You may be getting an error due to the dependency to saxon. To resolve this add the jar to your maven repo.
From the xml2j-gen directory issue the following command: `mvn install:install-file -Dfile=./libs/saxon.jar -DgroupId=com.icl.saxon -DartifactId=saxon -Dversion=6.5.5 -Dpackaging=jar` 
(the jar is in the libs subdirectory). You will also find a corresponding comment in the POM, which is in the generator root directory.

**Code Generation** 

`java -jar xml2j.jar -w tutorials/choice -c conf/cfg.xml -i -p -pom` 

In the example above:
* -w is the working directory for the choice project
* -c is the fully qualified name of the configuration file
* -p optional parameter that adds printing methods for the generated Java POJO's
* -i optional parameter that generates intermediate files (results of transformations)

To see possible arguments (help):
 
`java -jar xml2j.jar -?`

**Tutorial**

The tutorial folder contains a collection of examples, each of which are in a subfolder. When in that subfolder you can generate code, build it and run the executable jar. 
For example:

	$XML2J_HOME/tutorial/zoo	in this folder you'll find the zoo example.
	
From within this folder:
	
	java -jar ../../xml2j.jar -cconf/cfg.xml -p -pom
	
	mvn clean install
	
	java -jar zoo.jar input/data.xml prop/default.prop

Note that the build step (mvn clean install) fails if the XML2J-CORE project is not installed. The generator doesn't need it, but the generated code does, it extends the framework.	
	
Alternatively you can generate code from the XML2J_HOME directory.	
	
	java -jar xml2j.jar -wtutorials/zoo -cconf/cfg.xml -p -pom

There are quite a few examples there, just try them out. Also experiment with different properties files (typically inside the prop subdirectory).
See the user manual for more information.
	
**Samples**

I have added a samples directory with among others SEPA. In here I am also using Spring Data with MongoDB to persists transactions to Mongo. You will need to have [xml2j-springdata](https://github.com/lolkedijkstra/xml2j-springdata.git) as well if you want to use these samples.


The core of XML2J can be found under: 
[xml2j-core](https://github.com/lolkedijkstra/xml2j-core.git)
