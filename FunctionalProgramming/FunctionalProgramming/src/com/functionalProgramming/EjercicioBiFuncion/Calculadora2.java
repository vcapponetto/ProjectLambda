package com.functionalProgramming.EjercicioBiFuncion;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Calculadora2 {
    public List<Double> calc(BiFunction<Double, Double, Double> bi,
                             List<Empleado> listaEmp, Double incrementoSalario) {

        List<Double> listaSalariosNuevos = new ArrayList<>();

        for(Empleado empleado : listaEmp) {
            listaSalariosNuevos.add(bi.apply(empleado.getSalario(), incrementoSalario));
        }
        return listaSalariosNuevos;
    }
}
