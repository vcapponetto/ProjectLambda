package com.functionalProgramming.MetodosReferenciados.Ejercicios;

/*
* En el curso es la clase EjercicioNew
* */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static java.util.Arrays.asList;

public class EjercicioRefenciaConstructor {
    public static void main(String[] args) {
        List<String> numerosEnString = asList("10","10","15","15","25","30","40","6","30");

        // Con Mét. Referenciados a un CONSTRUCTOR
        // Esto: getResults(numeros, numeroEnString -> new Integer(numeroEnString));
        // se representa :
        getResults(numerosEnString, Integer::new).forEach(nro->System.out.println(nro*10));
        // si creamos un mét. para multiplicar podemos volver a usar met. referenciados y esta expresión:
        // getResults(numerosEnString, Integer::new).forEach(num ->EjercicioRefenciaConstructor.multiplicarPor10(num));
        // se reemplaza por:
        getResults(numerosEnString, Integer::new).forEach(EjercicioRefenciaConstructor::multiplicarPor10);
    }
    public static List<Integer> getResults(List<String> datos, Function<String, Integer> func) {
        List<Integer> resultados = new ArrayList<>();
        datos.forEach(strNum -> resultados.add(func.apply(strNum)));
        return resultados;
    }
    public static void multiplicarPor10(int numero) {
        System.out.println("El nuevo valor de "+ numero+ " es: "+ numero * 10);
    }
}
