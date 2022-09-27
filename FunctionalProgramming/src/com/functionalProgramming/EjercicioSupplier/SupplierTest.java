package com.functionalProgramming.EjercicioSupplier;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<String> sup = () -> "Hola Mundo!";
        System.out.println("El valor pasado es: "+ sup.get());
    }
}
