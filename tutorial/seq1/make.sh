cp ../build-one.xml ./build.xml
if [ $1 ]; then
	ant jar -Dmain-class=com.xml2j.tutorial.seq1.application.Seq1Application -Djar.name=$1.jar
else
	echo Missing MODULE
fi
rm ./build.xml
