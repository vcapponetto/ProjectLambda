package com.functionalProgramming.Streams.Ejs_Stream;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
* CREACIÓN DE STREAMS A PARTIR DE STRINGS, StringBuilder y StringBuffer
* */
public class CreaStreams4 {
    public static void main(String[] args) {
        //todo para obtener el string por pantalla usamos el objeto scanner
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();

        IntStream streamChars = entrada.chars();
        //todo filtra del string recibido por pantalla sólo las letras, saca nros y espacios y muestra el string por pant
        streamChars.filter(n -> !Character.isDigit((char)n) && !Character.isWhitespace((char)n))
                   .forEach(n -> System.out.print((char)n));
        System.out.println("");

        //todo ejemplo con pattern y el uso del método split que puede dividir un string en streams de strings
        String str = "HTML, CSS, JAVASCRIPT, JAVA, C++, C#, RUBY";
        Pattern.compile(", ")
                .splitAsStream(str)
                .forEach(System.out::println);

    }
}
