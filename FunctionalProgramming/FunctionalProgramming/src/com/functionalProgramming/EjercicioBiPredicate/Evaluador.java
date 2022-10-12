package com.functionalProgramming.EjercicioBiPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class Evaluador {
   public List<Empleado> evaluar(List<Empleado> listaEmp, BiPredicate<Integer, String> eval) {
       List<Empleado> listaNuevaEmp = new ArrayList<>();
       for (Empleado emp : listaEmp) {
           if (eval.test(emp.getEdad(), emp.getDepartamento())) {
                listaNuevaEmp.add(emp);
           }
       }
       return listaNuevaEmp;
   }
}
