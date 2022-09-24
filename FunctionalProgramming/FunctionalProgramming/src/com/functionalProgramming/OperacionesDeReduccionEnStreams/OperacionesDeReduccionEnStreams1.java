package com.functionalProgramming.OperacionesDeReduccionEnStreams;

/*
* El objetivo de las operaciones Terminales de REducción es hacer algo con el string de datos para devolver
* un sólo valor, las standard son suma, resta, promedio, multiplicación etc
* */

import com.functionalProgramming.OperacionesIntermedias.OperacionesFilter.Empleado;
import java.util.List;
import java.util.stream.IntStream;

public class OperacionesDeReduccionEnStreams1 {
    public static void main(String[] args) {
        int[] numeros = {4, 6, 10, 12, 15, 55, 7, 8, 9, 10, 2, 5, 8, 9, 10, 45, 6, 9, 33, 66, 85, 97, 81, 24, 99};

        //TODO --suma con metodología tradicional
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma es: " + suma);

        //TODO --promedio con metodología tradicional
        double promedio = suma / numeros.length;
        System.out.println("El promedio es: "+ promedio);

        //TODO --cantidad de elementos
        System.out.println("La cantidad de elementos es:"+ numeros.length);

        //TODO --Obtener el máximo con metodología tradicional
        int maximo = numeros[0];
        for (int numero : numeros){
            if (numero > maximo){
                maximo = numero;
            }
        }
        System.out.println("El máximo es: "+ maximo);

        //TODO --Obtener el mínimo con metodología tradicional
        int mínimo = numeros[0];
        for (int numero : numeros){
            if (numero < mínimo){
                mínimo = numero;
            }
        }
        System.out.println("El mínimo es: "+ mínimo);

        System.out.println("\n*** Operaciones de Reducción con empleados ***");
        List<Empleado> empleados = Empleado.empleados();
        double sumaSalarios = 0.0;
        for (Empleado empleado : empleados) {
            sumaSalarios += empleado.getIngresos();
        }
        //TODO --sumatoria del salario de los empleados
        System.out.println("\nLa suma de los Salarios es: "+ sumaSalarios);
        //TODO --Cantidad de empleados de manera tradicional
        System.out.println("La cantidad de empleados es: "+ empleados.size());

        //TODO --Obtener el empleado con salario máximo
        Empleado empMaximo = empleados.get(0);
        for (Empleado empleado : empleados) {
            if (empleado.getIngresos() > empMaximo.getIngresos()){
                empMaximo = empleado;
            }
        }
        System.out.println("El empleado con mayor ingreso es: "+ empMaximo);

        //TODO --Obtener el empleado con salario mínimo
        Empleado empMinimo = empleados.get(0);
        for (Empleado empleado : empleados) {
            if (empleado.getIngresos() < empMinimo.getIngresos()){
                empMinimo = empleado;
            }
        }
        System.out.println("El empleado con menor ingreso es: "+ empMinimo);
        System.out.println("\n **** CON PROGRAMACION FUNCIONAL ****");

        //TODO --Operaciones de reducción números
        System.out.println("\n** Operaciones de REDUCCIÓN con Números **");

        //TODO Lambda--la sumatoria de los números de la lista
        System.out.println("La suma de los elementos es: "+
                IntStream.of(numeros).sum());

        //TODO Lambda--El promedio de los números de la lista
        System.out.println("El promedio es: "+
                IntStream.of(numeros).average().getAsDouble());

        //TODO Lambda--El valor máximo y mínimo
        System.out.println("El valor máximo es: "+
                IntStream.of(numeros).max().getAsInt());

        System.out.println("El valor mínimo es: "+
                IntStream.of(numeros).min().getAsInt());

        //TODO Lambda--Contar elementos
        System.out.println("La cantidad de elementos es: "+
                IntStream.of(numeros).count());

        System.out.println("\n**** Operaciones de reducción con empleados ****");
        //TODO Lambda--Sumatoria de los salarios
        System.out.println("\nSuma de los salarios: "+
                empleados.stream()
                        .mapToDouble(Empleado::getIngresos)
                        .sum());

        //TODO Lambda--Empleado con mayor salario
        Empleado empMax = empleados
                .stream()
                .max((emp1, emp2) -> ((int)(emp1.getIngresos() - emp2.getIngresos()))).get();
        System.out.println("El empleado con mayor salario es: "+ empMax.getNombre()+
                " ,salario: "+ empMax.getIngresos());






    }
}
