package com.functionalProgramming.EjercicioBinaryOperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
    public static void main(String[] args) {
        BinaryOperator<Integer> bOperator = (x,y) -> x * y;

        //-Uso del método Apply
        int rdo = bOperator.apply(2,3);
        System.out.println("El resultado es: "+ rdo);

        //-Uso del método MinBy
        Comparator<Integer> comparator = (i1, i2) -> i1.compareTo(i2);
        BinaryOperator<Integer> bOperatorMin = BinaryOperator.minBy(comparator);
        rdo = bOperatorMin.apply(10,20);
        System.out.println("El menor entre 10 y 20 es: "+ rdo);

        //-Uso del método MaxBy
        Comparator<Integer> comparator2 = (i1, i2) -> i1.compareTo(i2);
        BinaryOperator<Integer> bOperatorMax = BinaryOperator.maxBy(comparator2);
        rdo = bOperatorMax.apply(10,20);
        System.out.println("El mayor entre 10 y 20 es: "+ rdo);
    }
}
