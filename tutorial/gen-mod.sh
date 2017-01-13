if [ $1 ]; then
	java -jar "$XML2J_HOME/xml2j.jar" -w./$1 -p -cconf/cfg.xml
else
	echo Missing MODULE
fi
