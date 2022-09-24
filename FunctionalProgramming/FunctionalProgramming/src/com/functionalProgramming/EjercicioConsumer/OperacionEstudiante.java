package com.functionalProgramming.EjercicioConsumer;

import java.util.List;
import java.util.function.Consumer;

public class OperacionEstudiante {
    public void aceptaTodos(List<Estudiante> estudiantes, Consumer<Estudiante> cons) {

        for (Estudiante estudiante: estudiantes) {
            cons.accept(estudiante);
        }
    }
}
