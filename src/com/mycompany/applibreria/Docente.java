package com.mycompany.applibreria;

public class Docente extends Usuario {
    private String profesion;
    private boolean magister;
    private boolean doctor;

    public Docente(String RUN, String nombreCompleto, char genero, String profesion, boolean magister, boolean doctor) {
        super(RUN, nombreCompleto, genero);
        this.profesion = profesion;
        this.magister = magister;
        this.doctor = doctor;
    }
}