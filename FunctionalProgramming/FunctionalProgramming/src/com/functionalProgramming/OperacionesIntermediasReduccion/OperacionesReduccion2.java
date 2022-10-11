package com.functionalProgramming.OperacionesIntermediasReduccion;

import java.util.stream.IntStream;

public class OperacionesReduccion2 {
    public static void main(String[] args) {
        int [] numeros = {4, 6, 10, 12, 15, 55, 7, 8, 9, 10, 2, 5};

        int suma = IntStream.of(numeros).reduce(0, Integer::sum);
        System.out.println("La suma es: "+ suma);




    }

}
