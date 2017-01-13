cp ../build-one.xml ./build.xml
if [ $1 ]; then
	ant jar -Dmain-class=com.xml2j.tutorial.choice.application.ChoiceApplication -Djar.name=$1.jar
else
	echo Missing MODULE
fi
rm ./build.xml
