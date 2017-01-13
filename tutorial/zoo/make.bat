@echo off
if [%1]==[] GOTO ERROR

copy ..\build-one.xml .\build.xml
ant jar -Dmain-class=com.xml2j.tutorial.zoo.application.ZooApplication -Djar.name=%1.jar
del ./build.xml
GOTO END

:ERROR
echo Missing MODULE

:END
