package com.functionalProgramming.EjercicioFunction;

import java.util.function.Function;

public class TestFunction {
    public static void main(String[] args) {
        //-la forma convencional
        Function<Integer, String> convertidor2 =
                new Function<Integer, String>() {
                    @Override
                    public String apply(Integer integer) {
                        throw new UnsupportedOperationException("Not supported yet.");
                    }
                };

        //-Con lambdas
        Function<Integer, String> convertidor = x -> Integer.toString(x);
        System.out.println(convertidor.apply(3).length());
        System.out.println(convertidor.apply(30).length());
    }
}
