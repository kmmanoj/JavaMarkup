#!/bin/bash
check_installed=`cat ~/.bashrc | grep JAVAMARKUP_HOME`

echo -e "\033[1mSetting up environment\033[0m";

if [ -n "${check_installed}" ]; then
	echo -e "\033[1;33mJavaMarkup environment is already set\033[0m";
	echo "Check the environment variable JAVAMARKUP_HOME";
else 
	javamarkup_home=`pwd`
	echo "" >> ~/.bashrc
	echo "# Java Markup Environment Variables" >> ~/.bashrc
	export JAVAMARKUP_HOME=${javamarkup_home}
	echo "export JAVAMARKUP_HOME=${javamarkup_home}" >> ~/.bashrc
fi

OUTPUT="bin"
if [ -d "$OUTPUT" ]; then
	echo "Using already existing bin/ folder";
else 
	mkdir bin
fi

echo -e "\033[1mCompiling Source code\033[0m";

echo "javac -d ${JAVAMARKUP_HOME}/bin -sourcepath ${JAVAMARKUP_HOME}/src ${JAVAMARKUP_HOME}/src/javamarkup/utilities/Sys.java";
javac -d ${JAVAMARKUP_HOME}/bin -sourcepath ${JAVAMARKUP_HOME}/src ${JAVAMARKUP_HOME}/src/javamarkup/utilities/Sys.java
echo "javac -d ${JAVAMARKUP_HOME}/bin -sourcepath ${JAVAMARKUP_HOME}/src ${JAVAMARKUP_HOME}/src/javamarkup/lexicalanalyser/CommentRemover.java";
javac -d ${JAVAMARKUP_HOME}/bin -sourcepath ${JAVAMARKUP_HOME}/src ${JAVAMARKUP_HOME}/src/javamarkup/lexicalanalyser/CommentRemover.java
echo "javac -d ${JAVAMARKUP_HOME}/bin -sourcepath ${JAVAMARKUP_HOME}/src ${JAVAMARKUP_HOME}/src/javamarkup/lexicalanalyser/Type.java";
javac -d ${JAVAMARKUP_HOME}/bin -sourcepath ${JAVAMARKUP_HOME}/src ${JAVAMARKUP_HOME}/src/javamarkup/lexicalanalyser/Type.java
echo "javac -d ${JAVAMARKUP_HOME}/bin -sourcepath ${JAVAMARKUP_HOME}/src ${JAVAMARKUP_HOME}/src/javamarkup/lexicalanalyser/State.java";
javac -d ${JAVAMARKUP_HOME}/bin -sourcepath ${JAVAMARKUP_HOME}/src ${JAVAMARKUP_HOME}/src/javamarkup/lexicalanalyser/State.java
echo "javac -d ${JAVAMARKUP_HOME}/bin -sourcepath ${JAVAMARKUP_HOME}/src ${JAVAMARKUP_HOME}/src/javamarkup/lexicalanalyser/TransitionDiagram.java";
javac -d ${JAVAMARKUP_HOME}/bin -sourcepath ${JAVAMARKUP_HOME}/src ${JAVAMARKUP_HOME}/src/javamarkup/lexicalanalyser/TransitionDiagram.java
echo "javac -d ${JAVAMARKUP_HOME}/bin -sourcepath ${JAVAMARKUP_HOME}/src ${JAVAMARKUP_HOME}/src/javamarkup/lexicalanalyser/SymbolRecord.java";
javac -d ${JAVAMARKUP_HOME}/bin -sourcepath ${JAVAMARKUP_HOME}/src ${JAVAMARKUP_HOME}/src/javamarkup/lexicalanalyser/SymbolRecord.java
echo "javac -d ${JAVAMARKUP_HOME}/bin -sourcepath ${JAVAMARKUP_HOME}/src ${JAVAMARKUP_HOME}/src/javamarkup/lexicalanalyser/Tokenizer.java";
javac -d ${JAVAMARKUP_HOME}/bin -sourcepath ${JAVAMARKUP_HOME}/src ${JAVAMARKUP_HOME}/src/javamarkup/lexicalanalyser/Tokenizer.java
echo "javac -d ${JAVAMARKUP_HOME}/bin -sourcepath ${JAVAMARKUP_HOME}/src ${JAVAMARKUP_HOME}/src/javamarkup/lexicalanalyser/LexicalAnalyser.java";
javac -d ${JAVAMARKUP_HOME}/bin -sourcepath ${JAVAMARKUP_HOME}/src ${JAVAMARKUP_HOME}/src/javamarkup/lexicalanalyser/LexicalAnalyser.java
echo "javac -d ${JAVAMARKUP_HOME}/bin -sourcepath ${JAVAMARKUP_HOME}/src ${JAVAMARKUP_HOME}/src/javamarkup/Main.java";
javac -d ${JAVAMARKUP_HOME}/bin -sourcepath ${JAVAMARKUP_HOME}/src ${JAVAMARKUP_HOME}/src/javamarkup/Main.java

echo -e "\033[1mFinishing installation\033[0m";
echo "java -classpath /root/Files/github/kmmanoj/JavaMarkup/bin javamarkup.Main \$@" > ~/jmparse
sudo mv ~/jmparse /usr/local/bin/jmparse
sudo chmod +x /usr/local/bin/jmparse

echo "";
echo -e "\033[1;32mJavaMarkup installation complete!!\033[0m";