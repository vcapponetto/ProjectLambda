package com.functionalProgramming.EjercicioComparatorYComparable;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static java.util.Arrays.asList;


public class ComparatorYComparableTest {
    public static void main(String[] args) {

        //--Se puede usar el método sort de Collections con un String
        //--porque la clase String Sobreescribe el método CompareTo de la interfaz Comparable
        List<String> nombres = asList("Marta", "Susana", "Cecilia","Ana");
        System.out.println("La lista de nombres desordenados: ");
        System.out.println(nombres);

        Collections.sort(nombres);
        System.out.println("\nLa lista de nombres ordenados: ");
        System.out.println(nombres);

        //--Para poder usar el mét. compareTo de Comparable en una Collections
        //--la clase tiene que sobrescribir el método e implementar de interfaz Comparable
        List<Persona> personas = asList(
                new Persona(3,"Laura", 24),
                new Persona(2,"Paola", 28),
                new Persona(4,"Miguel", 34),
                new Persona(1,"Javier", 44),
                new Persona(5,"Amalia", 25));

        System.out.println("\nLa lista de personas desordenadas: ");
        System.out.println(personas);

        System.out.println("\nLa lista de personas ordenadas: ");
        Collections.sort(personas);
        System.out.println(personas);

        //--OPCIONES PARA ORDENAR POR OTRO PARÁMETRO:
        //(1)
        //--Para ordenar además por otro parámetro el método sort tiene otra implementación
        //--donde se le puede pasar un objeto comparator
        System.out.println("\n(1)-La lista de personas desordenadas: ");
        System.out.println(personas);

        System.out.println("\n(1)-La lista de personas ordenadas por ID con comparator: ");
        Collections.sort(personas, new OrdenarPersonaPorId());
        System.out.println(personas);

        //(2)
        //--Con una CLASE ANÓNIMA en lugar de la instancia de la clase OrdernarPersonaPorId
        //--Se puede llamar al sort de la siguiente manera:
        System.out.println("\n(2)-La lista de personas ordenadas por ID con comparator CLASE ANÓNIMA: ");
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare (Persona p1, Persona p2) {
                return p1.getId() - p2.getId();
            }
        });
        System.out.println(personas);

        //(3)
        //--Con Lambdas ya que Comparator es una interfaz funcional
        //--Se puede llamar al sort de la siguiente manera:
        System.out.println("\n(3)-La lista de personas ordenadas por ID con lambdas: ");
        Collections.sort(personas, (p1, p2) -> p1.getId() - p2.getId());
        System.out.println(personas);


    }
}
