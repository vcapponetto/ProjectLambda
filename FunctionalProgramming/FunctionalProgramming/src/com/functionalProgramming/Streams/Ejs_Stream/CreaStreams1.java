package com.functionalProgramming.Streams.Ejs_Stream;

import com.functionalProgramming.Streams.Ejs_Stream.Pojo.Estudiantes;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
* SE CREAN STREAMS A PARTIR DE VALORES
*
*/

public class CreaStreams1 {
    public static void main(String[] args) {
        //--TODO se crea un STREAM a partir de un string con el  método of()
        Stream<String> stream1 = Stream.of("Curso de programación");
        stream1.forEach(System.out::println);
        System.out.println("");

        //--TODO se crea un STREAM a partir de una lista de strings con el método of()
        Stream<String> stream2 = Stream.of("curso1", "curso2", "curso3", "curso4");
        stream2.forEach(System.out::println);
        System.out.println("");

        //--TODO se crea un STREAM a partir de un arreglo con el método of()
        String[] arreglo = {"java", "c++", "c#", "ruby"};
        Stream<String> stream3 = Stream.of(arreglo);
        stream3.forEach(System.out::println);
        System.out.println("");

        //--todo Se crea un stream a partir de una lista de objetos con el método builder()
        Stream<Estudiantes> streamEstudiantes = Stream.<Estudiantes>builder()
                .add(new Estudiantes("n01", 17, 1.70, 9.5))
                .add(new Estudiantes("n02", 21, 1.70, 9.5))
                .build();
        streamEstudiantes.forEach(estudiante -> System.out.println(estudiante));

        //--TODO se crea un STREAM a partir con el método rangeClose()
        System.out.println("");
        IntStream unoAVeinte =  IntStream.rangeClosed(1,20);
        unoAVeinte.forEach(System.out::println);



    }
}
