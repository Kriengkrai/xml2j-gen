@echo off
if [%1]==[] GOTO ERROR

java -jar "%XML2J_HOME%/xml2j.jar" -w./%1 -p -cconf/cfg.xml
goto END

:ERROR	
	echo Missing MODULE
:END