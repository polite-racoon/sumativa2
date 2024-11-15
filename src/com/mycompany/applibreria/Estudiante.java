package com.mycompany.applibreria;

public class Estudiante extends Usuario {
    public String carrera;

    public Estudiante(String RUN, String nombreCompleto, char genero, String carrera) {
        super(RUN, nombreCompleto, genero);
        this.carrera = carrera;
    }
}