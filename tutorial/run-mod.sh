if [ $1 ]
then
	cd $1
	echo "Running with the default properties file prop/default.prop."
	java -jar $1.jar input/data.xml prop/default.prop schema/schema.xsd
else
	echo Missing MODULE
fi

