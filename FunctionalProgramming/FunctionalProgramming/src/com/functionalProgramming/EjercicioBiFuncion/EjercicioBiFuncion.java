package com.functionalProgramming.EjercicioBiFuncion;

import java.util.function.BiFunction;

public class EjercicioBiFuncion {
    public static void main(String[] args){
        BiFunction<String, String, String> bi = (x, y) -> x + y;

        System.out.println(bi.apply("Hola ", "Mundo!"));
    }

}
