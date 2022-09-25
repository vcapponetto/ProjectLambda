package com.functionalProgramming.EjercicioConsumer;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

import static java.util.Arrays.asList;

public class Principal {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = asList(
                new Estudiante("Teresita", 9),
                new Estudiante("Juan", 7),
                new Estudiante("Pedro",10),
                new Estudiante("María",10),
                new Estudiante("Marcos",6),
                new Estudiante("Mauricio",7),
                new Estudiante("Francisco",5),
                new Estudiante("Martina",6),
                new Estudiante("José",8),
                new Estudiante("Laura",7),
                new Estudiante("Jaime",4),
                new Estudiante("Valentina",6),
                new Estudiante("Josefina",9),
                new Estudiante("Micaela",5),
                new Estudiante("Benjamin",3),
                new Estudiante("Mateo",5)
        );

        OperacionEstudiante op = new OperacionEstudiante();
        Consumer<Estudiante> cons1 = e -> System.out.println(e.getNombre()+", Calificación: "+ e.getCalificacion());
        Consumer<Estudiante> cons2 = e -> e.setCalificacion(e.getCalificacion()*1.15);
/*
        System.out.println("Estudiantes con su calificación: ");
        op.aceptaTodos(estudiantes, cons1);
        op.aceptaTodos(estudiantes, cons2);
        System.out.println("\nEstudiantes con su calificación actualizada: ");
        op.aceptaTodos(estudiantes, cons1);
*/
        System.out.println("\n*******************DE OTRA MANERA LO MISMO**************************");

        //Otro método default de la interfaz CONSUMER es AndThen que combina dos acciones
        //hacemos lo mismo que arriba pero con AndThen
        System.out.println("Estudiantes con su calificación: ");
        op.aceptaTodos(estudiantes, cons1);

        System.out.println("\nEstudiantes con su calificación actualizada: ");
        Consumer<Estudiante> cons3 = cons2.andThen(cons1);
        op.aceptaTodos(estudiantes, cons3);


        }
}
