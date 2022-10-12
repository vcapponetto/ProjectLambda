package com.functionalProgramming.EjercicioFunction;

import java.util.function.Function;

public class DatosComensal {
    public static void main(String[] args) {
        Comensal com1 = new Comensal("Javier", 256.2, 5);
        String nombreComensal = (String)getDatoComensal(com1, x-> x.getNombre());
        double montoPedido = (double)getDatoComensal(com1, x-> x.getMontoPedido());
        int nroMesa = (int)getDatoComensal(com1, x-> x.getMesa());

        System.out.println("El comensal: " + nombreComensal +  " pago:" + montoPedido +" para la mesa nro: "+ nroMesa);
    }



    public static Object getDatoComensal(Comensal com, Function<Comensal, Object> func) {
        return func.apply(com);
    }
}
