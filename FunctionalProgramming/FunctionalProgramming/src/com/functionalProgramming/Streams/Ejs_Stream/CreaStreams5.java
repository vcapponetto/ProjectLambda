package com.functionalProgramming.Streams.Ejs_Stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/*
* CREA STREAMS A PARTIR DE ARCHIVOS para recorrerlos
* */
public class CreaStreams5 {
    public static void main(String[] args) {
       //TODO abre un archivo y lo envía a un stream para recorrer cada línea
        try(Stream<String> lineas = Files.lines(Paths.get("parrafo.txt"), Charset.forName("windows-1251"))){
            lineas.forEach(
                    linea -> {
                        System.out.println("Linea...");
                        System.out.println(linea);
                    }
            );
        } catch (IOException e){
            e.printStackTrace();
        }

        //TODO envía el listado de directorios a un stream para recorrer cada línea y mostrarla
        Path dir = Paths.get(".");
        System.out.printf("%nEl arbol de archivos del proyecto para : %s es %n ", dir.toAbsolutePath());
        try (Stream<Path> paths = Files.walk(dir)) {
            paths.forEach(System.out::println);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
