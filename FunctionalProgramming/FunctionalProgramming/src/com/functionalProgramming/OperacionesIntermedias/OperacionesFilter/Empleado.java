package com.functionalProgramming.OperacionesIntermedias.OperacionesFilter;

import java.util.List;

import static java.util.Arrays.asList;

public class Empleado implements Comparable{
    private Long id;
    private String nombre;
    private double ingresos;
    private Genero genero;
    private int edad;

    public Empleado(Long id, String nombre, double ingresos, Genero genero, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.ingresos = ingresos;
        this.genero = genero;
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", ingresos=" + ingresos +
                ", genero=" + genero +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.getNombre().compareTo(((Empleado)o).getNombre());
    }

    public static enum Genero {
        FEMENINO,
        MASCULINO;
    }
    public boolean esHombre() { return this.genero == Genero.MASCULINO; }

    public boolean esMujer() { return this.genero == Genero.FEMENINO; }

    public static List<Empleado> empleados() {
        Empleado emp1 = new Empleado(1L, "Lando Norris", 538.00, Genero.MASCULINO, 26);
        Empleado emp2 = new Empleado(2L, "Miguel Rodriguez", 600.00, Genero.MASCULINO, 25);
        Empleado emp3 = new Empleado(3L, "Marta Suarez", 700.00, Genero.FEMENINO, 27);
        Empleado emp4 = new Empleado(4L, "Juana Viale", 560.00, Genero.FEMENINO, 28);
        Empleado emp5 = new Empleado(5L, "Viviana Gutierrez", 530.00, Genero.FEMENINO, 27);
        Empleado emp6 = new Empleado(6L, "Charles Leclerc", 670.00, Genero.MASCULINO, 26);
        Empleado emp7 = new Empleado(7L, "Carlos Sainz", 800.00, Genero.MASCULINO, 35);
        Empleado emp8 = new Empleado(8L, "Jenifer Lopez", 780.00, Genero.FEMENINO, 45);
        Empleado emp9 = new Empleado(9L, "Génesis Rodriguez", 566.00, Genero.FEMENINO, 40);
        Empleado emp10 = new Empleado(10L, "Romina Blachetti", 650.00, Genero.FEMENINO, 50);
        Empleado emp11 = new Empleado(11L, "Max Verstappen", 790.00, Genero.MASCULINO, 26);
        Empleado emp12 = new Empleado(12L, "Nikita Mazepin", 450.00, Genero.MASCULINO, 50);
        Empleado emp13 = new Empleado(13L, "Yuki Zunoda", 800.00, Genero.MASCULINO, 22);
        Empleado emp14 = new Empleado(14L, "Guanyu Zhou", 880.00, Genero.MASCULINO, 30);
        Empleado emp15 = new Empleado(15L, "Luis Hamilton", 900.00, Genero.MASCULINO, 35);
        Empleado emp16 = new Empleado(16L, "Fernando Alonso", 610.00, Genero.MASCULINO, 45);
        Empleado emp17 = new Empleado(17L, "Sergio Perez", 590.00, Genero.MASCULINO, 35);
        Empleado emp18 = new Empleado(18L, "George Rusell", 500.00, Genero.MASCULINO, 52);
        Empleado emp19 = new Empleado(19L, "Jodie Foster", 522.00, Genero.FEMENINO, 55);
        Empleado emp20 = new Empleado(20L, "Dalilah Tahan", 640.00, Genero.FEMENINO, 50);

        return asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10, emp11, emp12, emp13, emp14,
                emp15, emp16, emp17, emp18, emp19, emp20);
    }
}
