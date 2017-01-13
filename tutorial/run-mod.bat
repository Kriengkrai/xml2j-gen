@echo off
if [%1]==[] GOTO ERROR

cd %1
echo "Running with the default properties file prop/default.prop."
java -jar %1.jar input/data.xml prop/default.prop schema/schema.xsd

cd ..
goto END


:ERROR	
	echo Missing MODULE
:END

