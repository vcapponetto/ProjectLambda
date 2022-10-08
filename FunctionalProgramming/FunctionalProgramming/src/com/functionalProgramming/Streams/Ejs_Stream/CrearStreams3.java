package com.functionalProgramming.Streams.Ejs_Stream;

import com.functionalProgramming.Streams.Ejs_Stream.Pojo.Estudiantes;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
* CREACIÓN DE STREAMS A PARTIR DE LOS MÉTODOS DE LAS CLASES ARRAYS y COLLECTIONS
*
*/

public class CrearStreams3 {
    public static void main(String[] args) {
        //-TODO con arrays
        System.out.println("Stream de números creado desde un array de enteros");
        IntStream numStream = Arrays.stream(new int[]{1,2,3,4,5,6});
        numStream.forEach(System.out::println);

        System.out.println("\nStream de strings creado desde un array de strings");
        Stream<String> nombres = Arrays.stream(new String[]{"Juan", "Pedro", "Marta"});
        nombres.forEach(System.out::println);

        //-TODO con collections como Set o List
        System.out.println("\nStream de Strings creado desde un Set de strings");
        Set<String> lenguajesSet = new HashSet<>();
        lenguajesSet.add("JAVA");
        lenguajesSet.add("C++");
        lenguajesSet.add("C#");

        Stream<String> lenguajesStream = lenguajesSet.stream();
        lenguajesStream.forEach(System.out::println);

        System.out.println("\nStream de objetos Estudiantes creado desde un List");
        List<Estudiantes> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiantes("n01", 16, 1.70, 7.0));
        estudiantes.add(new Estudiantes("n02", 16, 1.65, 7.5));
        estudiantes.add(new Estudiantes("n03", 17, 1.55, 8.0));
        estudiantes.add(new Estudiantes("n04", 16, 1.80, 8.5));
        estudiantes.add(new Estudiantes("n05", 17, 1.78, 9.0));
        estudiantes.add(new Estudiantes("n06", 16, 1.75, 9.5));

        Stream<Estudiantes> estudiantesStream = estudiantes.parallelStream();
        estudiantesStream.forEach(estudiantes1 -> System.out.println(estudiantes1.getIdentificacion()));

    }
}
