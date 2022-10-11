package com.functionalProgramming.OperacionesIntermedias.OperacionesFilter;

public enum Genero {
    FEMENINO,
    MASCULINO;

    public boolean esHombre(Genero genero) { return genero == MASCULINO; }

    public boolean esMujer(Genero genero) { return genero == FEMENINO; }
}
