package com.functionalProgramming.OperacionesReduccionMutable;

import com.functionalProgramming.OperacionesDeReduccionEnStreams.Empleado;
import java.util.Map;
import java.util.stream.Collectors;

public class OperacionesReduccionMutable2 {
    public static void main(String[] args) {
        // TODO Ejemplo con toMap con 2 args tipo functions
        Map<Integer, String> idNombreMapa =
                Empleado.empleados().stream()
                .collect(Collectors.toMap(Empleado::getId, Empleado::getNombre));
        System.out.println(idNombreMapa);

        // TODO Ejemplo con toMap con 3 args dos tipo function, y uno BinaryOperator
        System.out.println("\n");
        Map<Empleado.Genero, String> generoNombreMapa =
                Empleado.empleados().stream()
                .collect(Collectors.toMap(Empleado::getGenero, Empleado::getNombre,
                        (nom1, nom2) -> String.join(",", nom1, nom2)));
        System.out.println("Mapa por Genero: "+ generoNombreMapa);

        System.out.println("\n");
        Map<String, String> departamentoNombreMapa =
                Empleado.empleados().stream()
                        .collect(Collectors.toMap(Empleado::getDepartamento, Empleado::getNombre,
                                (nom1, nom2) -> String.join(",", nom1, nom2)));
        System.out.println("Mapa por Departamento: " + departamentoNombreMapa);

    }
}
