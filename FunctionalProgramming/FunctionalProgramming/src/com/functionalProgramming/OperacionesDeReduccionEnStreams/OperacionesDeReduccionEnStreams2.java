package com.functionalProgramming.OperacionesDeReduccionEnStreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/*
* Ejemplo de operaciones de Reducción en Streams - método reduce()
* */

public class OperacionesDeReduccionEnStreams2 {
        public static void main(String[] args) {
        int [] numeros = {4, 6, 10, 12, 15, 55, 7, 8, 9, 10, 2, 5};

        int suma = IntStream.of(numeros).reduce(0, Integer::sum);
        // Otra forma --> .reduce(0, (num1, num2) -> Integer.sum(num1, num2));
        System.out.println("La suma es: "+ suma);
        // ejemplo de uso del método reduce
        String texto = "";
        try(Stream<String> lineas = Files.lines(Paths.get("parrafo.txt"), Charset.forName("windows-1251"))){
            texto  = lineas.map(linea -> linea.replace("a", "@"))
                        .reduce("", (linea1, linea2) -> linea1.concat("\n").concat(linea2));

        } catch (IOException e){
            e.printStackTrace();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("parrafo2.txt"))) {
            bw.write(texto);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
