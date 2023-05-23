package br.ufscar.dc.compiladores.t1.lexico;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class Principal {

    public static void main(String[] args) {
        try {
            // args[0] é o primeiro argumento da linha de comando
            CharStream cs = CharStreams.fromFileName(args[0]);
<<<<<<< HEAD:t1-lexico/src/main/java/br/ufscar/dc/compiladores/t1/lexico/Principal.java
            T1Lexer lex = new T1Lexer(cs);
            while (lex.nextToken().getType() != Token.EOF) {
                System.out.println("");
=======
            AlgumaLexer lex = new AlgumaLexer(cs);

            Token t = null;
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                System.out.println("<" + AlgumaLexer.VOCABULARY.getDisplayName(t.getType()) + "," + t.getText() + ">");
>>>>>>> origin/main:alguma-lexico/src/main/java/br/ufscar/dc/compiladores/alguma/lexico/Principal.java
            }
        } catch (IOException ex) {
        }
    }
}