package com.functionalProgramming.EjercicioBiPredicate;

import java.util.List;
import java.util.function.BiPredicate;

import static java.util.Arrays.asList;

/**
 * Se requiere obtener un reporte con todos los empleados que cumplan con alguno de estos dos conjuntos de criterios:
 * 1) 25 años en adelante que estén en ventas o
 * 2) 25 años en adelante y que estén en mostrador
 */
public class Principal {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = asList(
                new Empleado("Jorge", 46, 250.5, "Ventas"),
                new Empleado("Mirta", 52, 5100.5, "Gerencia"),
                new Empleado("Vicente", 42, 5000.5, "Gerencia"),
                new Empleado("Valentina", 40, 3000.5, "RRHH"),
                new Empleado("Juana", 25, 250.5, "Ventas"),
                new Empleado("Ramón", 35, 250.5, "Ventas"),
                new Empleado("Roberto", 28, 250.5, "Ventas"),
                new Empleado("Juliana", 23, 250.5, "Ventas"),
                new Empleado("María", 27, 200.5, "Mostrador"),
                new Empleado("Jasmin", 22, 200.5, "Mostrador"),
                new Empleado("Luciana", 30, 200.5, "Mostrador"),
                new Empleado("Jesús", 28, 200.5, "Mostrador"));

        Evaluador evaluador = new Evaluador();
        BiPredicate<Integer, String> primerCriterio =
                (edad, departamento)-> (edad>25) && (departamento.equals("Ventas"));
        BiPredicate<Integer, String> segundoCriterio =
                (edad, departamento)-> (edad>25) && (departamento.equals("Mostrador"));

        BiPredicate<Integer, String> criterio = primerCriterio.or(segundoCriterio);

        System.out.println("Empleados de mostrador o ventas mayores a 25 años");

        List<Empleado> listaEmpEvaluados = evaluador.evaluar(listaEmpleados, criterio);
        for (Empleado emp: listaEmpEvaluados) {
            System.out.println("Nombre: "+ emp.getNombre() + " " +
                    "Edad: "+emp.getEdad()  + " " +
                    "Departamento: "+emp.getDepartamento());
        }

    }

}
