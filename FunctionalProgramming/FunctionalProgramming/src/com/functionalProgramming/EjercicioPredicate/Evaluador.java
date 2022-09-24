package com.functionalProgramming.EjercicioPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Evaluador {
    // devuelve la lista de empleados que pasan la evaluación
    public List<Empleado> evaluar(List<Empleado> listEmp, Predicate<Empleado> eval) {
        List<Empleado> listaDeEvaluados = new ArrayList<>();

        for (Empleado empleado : listEmp) {
            if (eval.test(empleado)) {
                listaDeEvaluados.add(empleado);
            }
        }
        return listaDeEvaluados;
    }

    public List<Empleado> evaluarAlContrario(List<Empleado> listEmp, Predicate<Empleado> eval) {
        List<Empleado> listaDeEvaluados = new ArrayList<>();

        for (Empleado empleado : listEmp) {
            if (eval.negate().test(empleado)) {
                listaDeEvaluados.add(empleado);
            }
        }
        return listaDeEvaluados;
    }
}
