package com.functionalProgramming.EjercicioComparatorYComparable;
/*
* ---->> ATENCIÓN !!!!
* Para usar el método comparable las clases cuyas instancias lo utilicen deben sobreescribir el método compareTo
* y para ello debe implementar de la interfaz Comparable
 */
public class Persona implements Comparable<Persona>{
    private int id;
    private String nombre;
    private Integer edad;

    public Persona(int id, String nombre, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(Persona p) {
       return this.getNombre().compareTo(p.getNombre());
    }
}
