# SEPA - SAMPLES

To generate code for the pain samples issue the following command (from the XML2J_HOME directory):

```
$ java -jar xml2j.jar -wsamples/sepa/pain -cconf/2016pain.xml -pom -p
```
**NOTE**: You can remove the pain modules that you don't want to build from the 2016pain.xml configuration file. 

The *-pom* option causes the generator to generate POM files.

Next:
``` 
$ cd  samples/sepa/pain
$ mvn clean install
```
**NOTE**: You will need to first build and install the core. 

The core of XML2J can be found under: 
[xml2j-core](https://github.com/lolkedijkstra/xml2j-core.git)

You can run the *pain001.jar* using the following command:
```
$ java -jar pain001.jar input/pain.001.001.03.xml prop/default.properties
```
This will run it using input file: *pain.001.001.03.xml* and properties file: *default.properties*.