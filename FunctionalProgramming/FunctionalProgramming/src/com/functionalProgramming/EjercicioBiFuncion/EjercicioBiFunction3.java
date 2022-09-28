package com.functionalProgramming.EjercicioBiFuncion;

import java.util.List;

import static java.util.Arrays.asList;

public class EjercicioBiFunction3 {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = asList(new Empleado("Jorge", 100.5),
                new Empleado("Jorge", 100.5),
                new Empleado("Mirta", 1000.5),
                new Empleado("Juana", 200.5),
                new Empleado("María", 300.5));

        Calculadora2 calc2 =  new Calculadora2();
        List<Double> salariosNuevos = calc2.calc((salario, incremento) -> salario + (salario * (incremento/100)), listaEmpleados, 10.0);

        for (Double salario : salariosNuevos) {
            System.out.println(salario);
        }
    }
}
