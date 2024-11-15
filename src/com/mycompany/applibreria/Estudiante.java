package com.mycompany.applibreria;

public class Estudiante extends Usuario {
    public String carrera;

    public Estudiante(String run, String nombreCompleto, char genero, String carrera) {
        super(run, nombreCompleto, genero);
        this.carrera = carrera;
    }
}