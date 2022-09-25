package com.functionalProgramming.EjercicioConsumer;

import java.util.Locale;
import java.util.function.Consumer;

public class TestConsumer {
    public static void main(String[] args) {
        Consumer<String> cons = x -> System.out.println(x.toUpperCase());
        cons.accept("hola mundo!");
    }

}
