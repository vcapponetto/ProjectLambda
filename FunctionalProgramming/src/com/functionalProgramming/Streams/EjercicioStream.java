package com.functionalProgramming.Streams;

import java.util.List;
import java.util.stream.Stream;
import static java.util.Arrays.asList;

public class EjercicioStream {
    public static void main(String[] args) {
        List<Integer> numeros = asList(1,2,3,4,5);

        Stream<Integer> numStream = numeros.stream();

        int suma =  numStream
                .filter(n -> n % 2 == 1) //{1,3,5} selecciona impares
                .map(n -> n * n) //{1,9,25} eleva al cuadrado
                .reduce(0, Integer::sum); // hace la sumatoria desde le primer elemento

        System.out.println("la suma de los elementos de la lista es : "+ suma);
    }
}
