package com.functionalProgramming.EjercicioFunction;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import static java.util.Arrays.asList;

public class DatosComensales {
    public static void main(String[] args) {
        List<Comensal> listaComensales = asList(new Comensal("Jorge", 100.5, 1),
                new Comensal("María", 250.6, 3),
                new Comensal("Miguel", 548.3, 2 ),
                new Comensal("Laura", 657.36, 7),
                new Comensal("Vicente", 1500.5,5));

        List<Object> nombresComensales =
                getDatosComensales(listaComensales, x -> x.getNombre());
        List<Object> montosComensales =
                getDatosComensales(listaComensales, x -> x.getMontoPedido());
        List<Object> mesasComensales =
                getDatosComensales(listaComensales, x -> x.getMesa());


        System.out.println("Lista de nombres de comensales: ");
        for (Object nombreComensal : nombresComensales) {
            System.out.println("El nombre del comensal es: " + nombreComensal);
        }

        System.out.println("Lista de montos de comensales: ");
        for (Object montoComensal : montosComensales) {
            System.out.println("El monto del comensal es: " + montoComensal);
        }

    }
    public static List<Object> getDatosComensales(
            List<Comensal> listaCom, Function<Comensal, Object> func) {
        //en el parámetro func voy a personalizar la función

        //ESta lista guarda datos personalizados de los comensales
        List<Object> listaDatos = new ArrayList<>();

        for (Comensal comensal : listaCom){
            listaDatos.add(func.apply(comensal));
        }
        return listaDatos;
    }
}
