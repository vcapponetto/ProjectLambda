package com.functionalProgramming.EjercicioPredicate;

import java.util.List;

import static java.util.Arrays.asList;

public class Principal {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = asList(
                new Empleado("Jorge", 46, 250.5, "Ventas"),
                new Empleado("Mirta", 52, 5100.5, "Gerencia"),
                new Empleado("Vicente", 42, 5000.5, "Gerencia"),
                new Empleado("Valentina", 40, 3000.5, "RRHH"),
                new Empleado("Juana", 25, 250.5, "Ventas"),
                new Empleado("María", 27, 200.5, "Mostrador"),
                new Empleado("Jesús", 28, 200.5, "Mostrador"));


        Evaluador evaluador = new Evaluador();
        System.out.println("Empleados con salarios > 4000");
        List<Empleado> empSalariosAltos = evaluador.evaluar(listaEmpleados, (empleado -> empleado.getSalario() > 4000));

        for (Empleado emp : empSalariosAltos) {
            System.out.println(emp.getNombre());
        }

        System.out.println("\nEmpleados cuyo nombre empieza con J");
        List<Empleado> empIniciaConJ = evaluador.evaluar(listaEmpleados, (empleado -> empleado.getNombre().startsWith("J")));
        for (Empleado emp : empIniciaConJ) {
            System.out.println(emp.getNombre());
        }

        System.out.println("\nEmpleados jóvenes");
        List<Empleado> empJovenes = evaluador.evaluar(listaEmpleados, (empleado -> empleado.getEdad() <= 30));
        for (Empleado emp : empJovenes) {
            System.out.println(emp.getNombre());
        }

        System.out.println("\nSalarios actualizados en los Jóvenes");
        Funciones func = new Funciones();
        Double nuevoSalario = 0.0;
        for (Empleado emp : empJovenes) {
            nuevoSalario = func.incrementoSalario(emp, 10.0,
                    (salario, incremento) -> (salario + (salario *(incremento/100))));
            emp.setSalario(nuevoSalario);

            System.out.println("Nombre: " + emp.getNombre() + " ,Nuevo Salario: " + emp.getSalario());
        }

        System.out.println("\nEmpleados mayores");
        List<Empleado> empleadosMayores = evaluador.evaluarAlContrario(listaEmpleados, (empleado -> empleado.getEdad() <= 30));
        for (Empleado emp : empleadosMayores) {
            System.out.println(emp.getNombre());
        }


    }

}
