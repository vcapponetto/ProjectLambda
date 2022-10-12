package com.functionalProgramming.OperacionesIntermedias.OperacionesFilter;

import java.util.List;
import java.util.function.Predicate;

public class OperacionesFilter {
    public static void main(String[] args) {
        //TODO Ejemplos de Filter
        List<Empleado> empleados = Empleado.empleados();

        System.out.println("Personal Masculino: ");
        empleados.stream()
                .filter(new Predicate<Empleado>() {
                    @Override
                    public boolean test(Empleado emp){
                        return emp.esHombre();
                    }
                })
                .forEach(emp ->System.out.println(emp.getNombre()+" "+emp.getGenero().name()));

        System.out.println("\nPersonal Femenino: ");
        empleados.stream()
                .filter(Empleado::esMujer)
                .forEach(emp -> System.out.println(emp.getNombre()+" "+emp.getGenero().name()));

        System.out.println("\nPersonal mayor a 25 años: ");
        empleados.stream()
                .filter(emp -> emp.getEdad() > 25)
                .forEach(emp -> System.out.println(emp.getNombre()+" "+emp.getEdad()));

        System.out.println("\nPersonal Masculino cuyo nombre empieza con M: ");
        empleados.stream()
                .filter(Empleado::esHombre)
                .filter(emp -> emp.getNombre().startsWith("M"))
                .forEach(empleado -> System.out.println(empleado.getNombre()+" "+empleado.getGenero().name()));

        //TODO filter con instrucciones complejas
        System.out.println("\nPersonal Masculino cuyo sueldo es superior a 550: ");
        empleados.stream()
                .filter(emp -> emp.esHombre() && emp.getIngresos() >550)
                .forEach(empleado -> System.out.println(empleado.getNombre()+" "+empleado.getIngresos()));

        //TODO con predicates más complejos en el filter
        System.out.println("\nPersonal Femenino mayor a 30 años con ingresos superiones a 600:");
        Predicate<Empleado> empFemenino = empleado -> empleado.esMujer();
        Predicate<Empleado> empMayor30 = empleado -> empleado.getEdad() > 30;
        Predicate<Empleado> empIngrMayor600 = empleado -> empleado.getIngresos() > 600;
        Predicate<Empleado> fem30600 = empFemenino.and(empMayor30).and(empIngrMayor600);

        empleados.stream()
                .filter(fem30600)
                .forEach(empleado -> System.out.println(empleado.getNombre()+" edad: "+empleado.getEdad()+
                        " Ingresos: "+empleado.getIngresos()));

        System.out.println("\nTotal de empleados: "+ empleados.stream().filter(fem30600).count());
    }

}
