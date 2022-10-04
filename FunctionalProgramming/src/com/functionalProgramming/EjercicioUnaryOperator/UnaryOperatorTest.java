package com.functionalProgramming.EjercicioUnaryOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

import static java.util.Arrays.asList;

public class UnaryOperatorTest {
    public static void main(String[] args) {
        //Este método devuelve el mismo TIPO que el que recibe - MISMA FUNCIONALIDAD DE FUNTION
        List<Integer> lista = asList(10,20,30,40,50,60,70,80,90,100);
        UnaryOperator<Integer> unaryOpt = (x) -> x*x;
        List<Integer> listaAct = operadorUnary(unaryOpt, lista);
        // También se puede enviar directamente la implementación  List<Integer> listaAct = operadorUnary((x) -> x*x, lista);
        listaAct.forEach(x ->System.out.println(x));
    }

    public static List<Integer> operadorUnary(UnaryOperator<Integer> unaryOpt, List<Integer> lista) {
        List<Integer> listaActualizada = new ArrayList<Integer>();

        lista.forEach(num -> listaActualizada.add(unaryOpt.apply(num)));
        return listaActualizada;
    }
}
