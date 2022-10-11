package com.functionalProgramming.OperacionesReduccionMutable;

/*
* Una operacion de reduccion mutable lo que hace es acumular los resultados en un contenedor mutable,
* y un contenedor mutable es un contenedor donde se pueden modificar sus datos, como un arrayList,
* una list, una coleccion, un conjunto (set : lista sin datos repetidos) o un mapa, o incluso un stringBuilder
* */

import com.functionalProgramming.OperacionesIntermediasReduccion.Empleado;

import java.util.*;
import java.util.stream.Collectors;

public class OperacionesReduccionMutable1 {
    public static void main(String[] args) {
        /*
        * Firmas del metodo collect
        * 1 - <R> R collect (Supplier<R> supplier, BiConsumer<R, ? super T> accumulator,BiConsumer<R, R> combiner)
        * 2 - <R, A> R collect (Collector<? super T, A, R> collector)
        * */
        /* EJEMPLO CON La primer firma :
        Supplier<ArrayList<String>> proveedor = () -> new ArrayList<>();
        // o con métodos referenciados : Supplier<ArrayList<String>> proveedor = ArrayList::new;
        BiConsumer<ArrayList<String>, String> acumulador = (lista, str) -> lista.add(str);
        // o con métodos referenciados : BiConsumer<ArrayList<String>, String> acumulador = ArrayList::add;
        BiConsumer<ArrayList<String>, ArrayList<String>> combinador = (list1, list2) -> list1.addAll(list2);
        // o con métodos referenciados : BiConsumer<ArrayList<String>, ArrayList<String>> combinador = ArrayList::addAll;\
        collect(ArrayList::new, ArrayList::add,ArrayList::addAll);

        ArrayList<String> nombres = Empleado.empleados()
                                            .stream()
                                            .map(Empleado::getNombre)
                                            .collect(ArrayList::new, ArrayList::add,ArrayList::addAll);
        */

        //Ejemplo 1) - Collect
        List<String> nombres = Empleado.empleados()
                .stream()
                .map(Empleado::getNombre)
                .collect(ArrayList::new, ArrayList::add,ArrayList::addAll);
        System.out.println(nombres);


        //Ejemplo 2) - Collector
        List<String> nombres1 = Empleado.empleados()
                .stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toList());
        System.out.println("Nombres con Collector.toList:" + nombres1);

        Set<String> nombres2 = Empleado.empleados()
                .stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toSet());
        System.out.println("Nombres con Collector.toSet:" +nombres2);

        //Lista ordenada
        SortedSet<String> nombres3 = Empleado.empleados()
                .stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Nombres con Collector.toCollection TreeSet:" +nombres3);

    }

}
