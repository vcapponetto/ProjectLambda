package com.functionalProgramming.EjercicioFunction;

public class Comensal {
    String nombre;
    double montoPedido;
    int mesa;

    public Comensal(String nombre, double monto, int mesa) {
        this.nombre = nombre;
        this.montoPedido = monto;
        this.mesa = mesa;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getMontoPedido() {
        return this.montoPedido;
    }

    public int getMesa() {
        return this.mesa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMontoPedido(double montoPedido) {
        this.montoPedido = montoPedido;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    @Override
    public String toString() {
        return "Comensal{" +
                "nombre='" + nombre + '\'' +
                ", montoPedido=" + montoPedido +
                ", mesa=" + mesa +
                '}';
    }
}
