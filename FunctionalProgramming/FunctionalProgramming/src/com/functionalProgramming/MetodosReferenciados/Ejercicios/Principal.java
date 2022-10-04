package com.functionalProgramming.MetodosReferenciados.Ejercicios;

import com.functionalProgramming.MetodosReferenciados.Modelos.Persona;
import com.functionalProgramming.MetodosReferenciados.Utilerias.ProveedorComparaciones;

import java.util.Collections;
import java.util.List;
import static java.util.Arrays.asList;

public class Principal {
    public static void main(String[] args) {

        List<Persona> personas = asList(
                new Persona("María", 23, "maría@gmail.com"),
                new Persona("José", 35, "jose@gmail.com"),
                new Persona("Laura", 22, "laura@gmail.com"),
                new Persona("Tatiana", 25, "tatiana@gmail.com"),
                new Persona("Salvador", 34, "Salvador@gmail.com"),
                new Persona("Marcela", 45, "marcela@gmail.com"),
                new Persona("Renata", 40, "renata@gmail.com")
        );
        System.out.println("Personas desordenadas: ");
        personas.forEach(persona -> System.out.println(persona));
        System.out.println("");

        Collections.sort(personas, (persona1, persona2) -> persona1.getEdad().compareTo(persona2.getEdad()));
        System.out.println("Personas ordenadas por su edad:");
        personas.forEach(persona -> System.out.println(persona));
        System.out.println("");

        //con MÉTODO REFERENCIADO, simplemente se reemplaza la implementación por la referencia a un método existente en la clase persona
        //(persona1, persona2) -> Persona.compararPorEdad(persona1, persona2) = Persona::compararPorEdad y con :: el compilador
        //infiere los argumentos - ESE ES UN MÉTODO REFERENCIADO
        //Esta expresión Collections.sort(personas, (persona1, persona2) -> Persona.compararPorEdad(persona1, persona2))
        //se reemplaza por:
        Collections.sort(personas, Persona::compararPorEdad);

        System.out.println("Personas ordenadas por su edad con METODO REFERENCIADO:");
        personas.forEach(persona -> System.out.println(persona));
        System.out.println("");

        /*
        * Métodos referenciados
        * Cuando la expresión lambda hace referencia a un mét.existente
        * se pueden usar 4 méts.refs.
        * 1- Mét. Ref. a un mét. estático (el del ejemplo de arriba)
        * 2- Mét. Ref. a un mét. de instancia de un objeto particular
        * 3- Mét. Ref. a un mét. de instancia de un objeto arbitrario de un tipo particular
        * 4- Mét. Ref. a un Constructor
        * */

        // 2- Mét. Ref. a un mét. de instancia de un objeto particular
        ProveedorComparaciones comparador = new ProveedorComparaciones();

        Collections.sort(personas, comparador::compararPorNombre);
        System.out.println("Personas ordenada por nombre:");
        // personas.forEach(persona -> System.out.println(persona));
        // se puede colocar como:
        personas.forEach(System.out::println);
        System.out.println("");

        // 3- Mét. Ref. a un mét. de instancia de un objeto arbitrario de un tipo particular
        // Cunado no sabemos cpomo se llamará la instancia, se usa el tipo de dato en este caso Persona y
        // se invoca el mét.
        // Cuando no sabemos el nombre de la instancia se reemplaza
        // (per1, per2) -> per1.compararPorEdad2(per2) por   Persona::compararPorEdad2:
        Collections.sort(personas, Persona::compararPorEdad2);
        System.out.println("Personas ordenada por edad Referenciando instancia de un objeto:");
        personas.forEach(System.out::println);
        System.out.println("");

        //

    }
}
