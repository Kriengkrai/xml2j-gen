cp ../build-one.xml ./build.xml
if [ $1 ]; then
	ant jar -Dmain-class=com.xml2j.tutorial.ext.application.ExtApplication -Djar.name=$1.jar
else
	echo Missing argument module
fi
rm ./build.xml
