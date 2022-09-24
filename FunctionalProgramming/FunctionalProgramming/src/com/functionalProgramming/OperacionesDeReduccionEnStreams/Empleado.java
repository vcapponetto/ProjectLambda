package com.functionalProgramming.OperacionesDeReduccionEnStreams;

import java.util.List;
import static java.util.Arrays.asList;

public class Empleado {
    private int id;
    private String nombre;
    private int edad;
    private Genero genero;
    private Double salario;
    private String departamento;

    public Empleado(int id, String nombre, int edad, Genero genero, Double salario, String departamento) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.salario = salario;
        this.departamento = departamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public static enum Genero {
        FEMENINO, MASCULINO;
    }

    public boolean esHombre() {
        return this.genero == Genero.MASCULINO;
    }

    public  boolean esMujer() {
        return this.genero == Genero.FEMENINO;
    }

    public static List<Empleado> empleados() {
        return  asList(
                new Empleado(1,"Jorge", 46, Genero.MASCULINO, 250.5, "Ventas"),
                new Empleado(2, "Mirta", 52, Genero.FEMENINO, 510.5, "Gerencia"),
                new Empleado(3,"Vicente", 42, Genero.MASCULINO, 500.5, "Gerencia"),
                new Empleado(4, "Valentina", 40, Genero.FEMENINO, 300.5, "RRHH"),
                new Empleado(5,"Juana", 25, Genero.FEMENINO, 250.5, "Ventas"),
                new Empleado(6,"María", 27, Genero.FEMENINO, 200.5, "Mostrador"),
                new Empleado(7,"Jorge", 28, Genero.MASCULINO, 200.5, "Mostrador"));
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
