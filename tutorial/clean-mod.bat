@echo off
if [%1]==[] GOTO ERROR
	cd %1
	call ant -q -S clean
	del /f /q .\lib
	del /s /q src\*.*
	rd /s /q src
	del /f /q build.xml
	del /f /q %1.jar
	cd ..
	goto END
	
:ERROR	
	echo Missing MODULE
:END
