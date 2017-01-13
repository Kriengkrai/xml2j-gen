@echo off
if [%1]==[] GOTO ERROR

copy ..\build-one.xml build.xml
ant jar -Dmain-class=com.xml2j.tutorial.seq4.application.Seq4Application -Djar.name=%1.jar
del build.xml

goto END

:ERROR	
	echo Missing MODULE
:END
