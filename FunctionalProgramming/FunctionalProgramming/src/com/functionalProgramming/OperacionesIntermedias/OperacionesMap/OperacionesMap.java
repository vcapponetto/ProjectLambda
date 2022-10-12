package com.functionalProgramming.OperacionesIntermedias.OperacionesMap;

import com.functionalProgramming.OperacionesIntermedias.OperacionesFilter.Empleado;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class OperacionesMap {
    public static void main(String[] args) {
        IntStream.range(1, 5)
                .map(new IntUnaryOperator() {
                    @Override
                    public int applyAsInt(int numero) {
                        return numero * numero;
                    }
                })
                .forEach(System.out::println);
        System.out.println(" ");

        //TODO Con lambdas
        IntStream.range(1, 10)
                .map(n -> n*n)
                .forEach(System.out::println);

        List<Empleado> empleados = Empleado.empleados();

        System.out.println("\nIngreso Promedio del personal femenimo mayor a 30 años: ");
        double suma = empleados.stream()
                .filter(emp -> emp.esMujer())
                .filter(emp -> emp.getEdad() > 30)
                .mapToDouble(emp -> emp.getIngresos())
                .sum();

        double promedio = suma / empleados.stream()
                .filter(emp -> emp.esMujer())
                .filter(emp -> emp.getEdad() > 30)
                .mapToDouble(emp -> emp.getIngresos())
                .count();

        System.out.println(promedio);


    }
}
