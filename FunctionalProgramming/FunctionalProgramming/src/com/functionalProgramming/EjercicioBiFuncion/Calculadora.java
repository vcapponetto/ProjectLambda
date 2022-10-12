package com.functionalProgramming.EjercicioBiFuncion;

import java.util.function.BiFunction;

public class Calculadora {
    //en la llamada a calc se deberá pasar como primer parámetro la implementación del parámetro tipo BiFunction
    public String calc(BiFunction<Integer, Integer, String> biFunction, Integer i1, Integer i2) {
        return biFunction.apply(i1, i2);
    }
}
