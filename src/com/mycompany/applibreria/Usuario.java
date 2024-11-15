package com.mycompany.applibreria;

import java.util.ArrayList;

public abstract class Usuario {
    private String run;
    private String nombreCompleto;
    private char genero;
    private Prestamo prestamo;

    public Usuario(String run, String nombreCompleto, char genero) {
        this.run = run;
        this.nombreCompleto = nombreCompleto;
        this.genero = genero;
    }

    //getters
    public String getRun() {
        return run;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public char getGenero() {
        return genero;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    //setters
    public void setRun(String run) {
        this.run = run;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    @Override
    public String toString() {
        return "{run: " + this.run + ", nombre: " + this.nombreCompleto + ", genero: " + this.genero;
    }
}