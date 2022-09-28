package com.functionalProgramming.EjercicioPredicate;

import java.util.function.BiFunction;

public class Funciones {
    public Double incrementoSalario(Empleado emp, Double incremento, BiFunction<Double, Double, Double> bi) {
        return bi.apply(emp.getSalario(), incremento);
    }
}
