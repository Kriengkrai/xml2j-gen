if [ $1 ]; then
	cd $1
	cp ../build-one.xml ./build.xml
	ant -q -S clean
	rm -rf ./lib
	rm -rf ./src
	rm -f *.txt
	rm -f build.xml
	rm -f $1.jar
	cd ..
else
	echo Missing MODULE
fi
