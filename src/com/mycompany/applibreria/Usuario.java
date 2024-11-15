package com.mycompany.applibreria;

import java.util.ArrayList;

public abstract class Usuario {
    private String RUN;
    private String nombreCompleto;
    private char genero;
    private Prestamo prestamo;

    public static final ArrayList<Usuario> usuarios = new ArrayList();

    public Usuario(String RUN, String nombreCompleto, char genero) {
        this.RUN = RUN;
        this.nombreCompleto = nombreCompleto;
        this.genero = genero;
    }

    //getters
    public String getRUN() {
        return RUN;
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
    public void setRUN(String RUN) {
        this.RUN = RUN;
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

    //static methods
    public static void crearUsuario(String RUN, String nombreCompleto, char genero, String carrera) {
        Estudiante estudiante =  new Estudiante(RUN, nombreCompleto, genero, carrera);
        usuarios.add(estudiante);
    }

    public static void crearUsuario(String RUN, String nombreCompleto, char genero, String profesion, boolean magister, boolean doctor) {
        Docente docente = new Docente(RUN, nombreCompleto, genero, profesion, magister, doctor);
        usuarios.add(docente);
    }

}