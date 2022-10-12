package com.functionalProgramming.EjercicioBiConsumer;

import java.net.SocketOption;
import java.util.function.BiConsumer;

public class BiConsumerTest {
    public static void main(String[] args) {
        BiConsumer<Double, Double> biConsumer = (x, y) -> {
            Double mult = x * y;
            System.out.println("La multiplicación es: " + mult);
        };

        biConsumer.accept(3.0, 2.0);
    }
}
