package com.functionalProgramming.OperacionesTerminalesDeReduccion;

import java.util.stream.IntStream;

public class OperacionesDeReduccion2 {
    public static void main(String[] args) {
        int[] numeros = {4, 6, 10, 12, 15, 55, 7, 8, 9, 10, 2, 5, 8, 9, 10, 45, 6, 9, 33, 66, 85, 97, 81, 24, 99};

        //uso del Método REDUCE
        int suma = IntStream.of(numeros)
                    .reduce(0, Integer::sum);
            // Otra forma --> .reduce(0, (num1, num2) -> Integer.sum(num1, num2));

        System.out.println("La suma es: "+ suma);
        
    }
}
