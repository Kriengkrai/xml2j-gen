@echo off

if [%1]==[] GOTO END 
	cd %1
	call make.bat %1
	cd..

:END

