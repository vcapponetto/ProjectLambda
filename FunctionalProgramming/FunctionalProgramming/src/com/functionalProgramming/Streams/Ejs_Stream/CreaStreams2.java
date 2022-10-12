package com.functionalProgramming.Streams.Ejs_Stream;
/*
* CREA STREAMS A PARTIR DE LOS MÉTODOS ITERATE Y GENERATE DE STREAMS
*
*/

import javax.swing.*;
import java.util.Random;
import java.util.stream.Stream;

public class CreaStreams2 {
    public static void main(String[] args) {
        //TODO Iterate genera una lista infinita,
        // el primer arg es el nro desde donde parte,
        // y el segundo es una unaryFuncition que indica como armar el resto de la lista
        // se llama al método limit para limitar el tamaño de la lista
        Stream<Long> primerosDiez = Stream.iterate(1L, n -> n + 1).limit(10L);
        primerosDiez.forEach(System.out::println);

        //TODO se puede hacer directamente
        System.out.println("\nLos primeros 20 nros pares");
        Stream.iterate(1L, n -> n+1)
                .filter(n -> n % 2 == 0)
                .limit(20)
                .forEach(System.out::println);

        System.out.println("\nLos primeros 5 nros pares después de 100");
        Stream.iterate(1L, n -> n + 1)
                .filter(n -> n % 2 == 0)
                .skip(100)
                .limit(5)
                .forEach(System.out::println);

        //TODO generamos streams con el método generate tiene como argumento un supplier
        System.out.println("\n5 Números aleatorios");
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("\n5 Números enteros aleatorios");
        new Random().ints()
                .limit(5)
                .forEach(System.out::println);
    }
}
