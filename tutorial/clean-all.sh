echo "clean tutorial level"
ant -q -S clean
rm -rf ./src

echo "clean module choice"
cd choice
cp ../build-one.xml ./build.xml
ant -q -S clean
rm -rf ./src
rm -f ./*.jar
rm -f ./*.txt
rm -f ./*.xml

echo "clean module ext"
cd ../ext
cp ../build-one.xml ./build.xml
ant -q -S clean
rm -rf ./src
rm -f ./*.jar
rm -f ./*.txt
rm -f ./*.xml

echo "clean module group"
cd ../group
cp ../build-one.xml ./build.xml
ant -q -S clean
rm -rf ./src
rm -f ./*.jar
rm -f ./*.txt
rm -f ./*.xml

echo "clean module modular"
cd ../modular
cp ../build-one.xml ./build.xml
ant -q -S clean
rm -rf ./src
rm -f ./*.jar
rm -f ./*.txt
rm -f ./*.xml

echo "clean module recursion"
cd ../recursion
cp ../build-one.xml ./build.xml
ant -q -S clean
rm -rf ./src
rm -f ./*.jar
rm -f ./*.txt
rm -f ./*.xml

echo "clean module recursion2"
cd ../recursion2
cp ../build-one.xml ./build.xml
ant -q -S clean
rm -rf ./src
rm -f ./*.jar
rm -f ./*.txt
rm -f ./*.xml

echo "clean module reserved"
cd ../reserved
cp ../build-one.xml ./build.xml
ant -q -S clean
rm -rf ./src
rm -f ./*.jar
rm -f ./*.txt
rm -f ./*.xml

echo "clean module seq1"
cd ../seq1
cp ../build-one.xml ./build.xml
ant -q -S clean
rm -rf ./src
rm -f ./*.jar
rm -f ./*.txt
rm -f ./*.xml

echo "clean module seq2"
cd ../seq2
cp ../build-one.xml ./build.xml
ant -q -S clean
rm -rf ./src
rm -f ./*.jar
rm -f ./*.txt
rm -f ./*.xml

echo "clean module seq3"
cd ../seq3
cp ../build-one.xml ./build.xml
ant -q -S clean
rm -rf ./src
rm -f ./*.jar
rm -f ./*.txt
rm -f ./*.xml

echo "clean module seq4"
cd ../seq4
cp ../build-one.xml ./build.xml
ant -q -S clean
rm -rf ./src
rm -f ./*.jar
rm -f ./*.txt
rm -f ./*.xml

echo "clean module subst"
cd ../subst
cp ../build-one.xml ./build.xml
ant -q -S clean
rm -rf ./src
rm -f ./*.jar
rm -f ./*.txt
rm -f ./*.xml

echo "clean module subst2"
cd ../subst2
cp ../build-one.xml ./build.xml
ant -q -S clean
rm -rf ./src
rm -f ./*.jar
rm -f ./*.txt
rm -f ./*.xml

echo "clean module zoo"
cd ../zoo
cp ../build-one.xml ./build.xml
ant -q -S clean
rm -rf ./src
rm -f ./*.jar
rm -f ./*.txt
rm -f ./*.xml

echo "done."


