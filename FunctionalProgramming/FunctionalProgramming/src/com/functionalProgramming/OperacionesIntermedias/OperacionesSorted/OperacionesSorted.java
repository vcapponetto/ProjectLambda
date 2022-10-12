package com.functionalProgramming.OperacionesIntermedias.OperacionesSorted;

import com.functionalProgramming.OperacionesIntermedias.OperacionesFilter.Empleado;

import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.asList;

/*
* Para utilizar la función SORTED la clase del tipo involucrado tiene que implementar la interfaz
* COMPARABLE, y sobrescribir el método compareTo, de lo contrario no se puede usar el método SORTED
* las clases como String, Int, Long y Doble lo tienen por ello funciona el mét. sorted.
* */

public class OperacionesSorted {
    public static void main(String[] args) {
        System.out.println("Nombres ordenados: ");
        asList("Alfredo", "María", "Daniel", "Brenda")
                .stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nNúmeros ordenados: ");
        asList(1,2,7,8,9,1,5,2,1,5,3,5)
                .stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nPersonal ordenado por Nombre: ");
        List<Empleado> empleados = Empleado.empleados();
        empleados.stream()
                .sorted()
                .forEach(emp -> System.out.println(emp.getNombre()));

        System.out.println("\nPersonal ordenado por edad:");
        empleados.stream()
                .sorted(new Comparator<Empleado>() {
                    @Override
                    public int compare(Empleado emp1, Empleado emp2) {
                        return emp1.getEdad() - emp2.getEdad();
                    }
                })
                .forEach(emp -> System.out.println(emp.getNombre()+" "+emp.getEdad()));

        //TODO Con lambdas
        System.out.println("\nPersonal ordenado por salario: ");
        empleados.stream()
                .filter(emp -> emp.getEdad() > 30)
                .sorted((emp1, emp2) -> (int)(emp1.getIngresos() - emp2.getIngresos()))
                .forEach(emp -> System.out.println(emp.getNombre()+" ,Ingreso: "+emp.getIngresos()));
    }
}
