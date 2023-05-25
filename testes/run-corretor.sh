#!/bin/bash

corretor=$PWD/testes/corretor-automatico.jar
executavel=$PWD/t1-lexico/target/t1-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar
pastaTemp=$PWD/temp
casosTeste=$PWD/testes/casos-de-teste
ras="790716, 791964, 790035"
opcao="gabarito-t1"

mkdir $pastaTemp
java -jar $corretor "java -jar $executavel" gcc $pastaTemp $casosTeste "$ras" "$opcao"
rm -rf $pastaTemp