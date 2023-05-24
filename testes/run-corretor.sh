#!/bin/bash

corretor=$PWD/corretor-automatico.jar
# corretor=/home/recoaro/Codes/UFSCAR/2023/Compiladores/compiladores-corretor-automatico/target/compiladores-corretor-automatico-1.0-SNAPSHOT-jar-with-dependencies.jar
executavel=$PWD/../t1-lexico/target/t1-lexico-1.0-SNAPSHOT-jar-with-dependencies.jar
pastaTemp=$PWD/temp
casosTeste=$PWD/casos-de-teste
ras="790716, 791964, 790035"
opcao="gabarito-t1"

mkdir $pastaTemp
java -jar $corretor $executavel gcc $pastaTemp $casosTeste "$ras" "$opcao"
rm -rf $pastaTemp