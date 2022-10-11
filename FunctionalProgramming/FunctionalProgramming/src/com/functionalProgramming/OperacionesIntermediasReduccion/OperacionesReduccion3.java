package com.functionalProgramming.OperacionesIntermediasReduccion;

import java.util.stream.IntStream;

/*
* Método summaryStatistics nos permite hacer lo mismo que sum, max, min, avg, pero más
* eficientemente y óptimo en cuanto a rendimiento
* */
public class OperacionesReduccion3 {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 20)
                            .summaryStatistics());
        //La salida es : IntSummaryStatistics{count=19, sum=190, min=1, average=10.000000, max=19}

        //Si solo quiero obtener uno de los valores particulares lo invoco con el metodo get
        System.out.println("La suma es: "+ IntStream.range(1, 20).summaryStatistics().getSum());
        System.out.println("El promedio es: "+ IntStream.range(1, 20).summaryStatistics().getAverage());
    }
}
