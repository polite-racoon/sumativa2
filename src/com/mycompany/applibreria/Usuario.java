package com.mycompany.applibreria;

import java.util.ArrayList;

public abstract class Usuario {
    private String run;
    private String nombreCompleto;
    private char genero;
    private Prestamo prestamo;

    public Usuario(String run, String nombreCompleto, char genero) {
        if (!validarRun(run)) {
            throw new IllegalArgumentException("RUT inválido: " + run);
        }
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
        return "{run: " + this.run + ", nombre: " + this.nombreCompleto + ", genero: " + this.genero + "}";
    }

    public boolean validarRun(String run) {
        run = run.replace(".", "").replace("-", "");

        String numero = run.substring(0, run.length() - 1);
        char dvIngresado = run.charAt(run.length() - 1);

        char[] digitos = numero.toCharArray();
        int[] secuencia = {2,3,4,5,6,7};

        int suma = 0;
        int j = 0;
        for (int i = digitos.length - 1; i >= 0; i--) {
            suma += Character.getNumericValue(digitos[i]) * secuencia[j];
            j = (j + 1) % secuencia.length;
        }

        int resto = suma % 11;
        int dvCalculado = 11 - resto;

        char dvEsperado;
        if (dvCalculado == 10) {
            dvEsperado = 'K';
        } else if (dvCalculado == 11) {
            dvEsperado = '0';
        } else {
            dvEsperado = (char) (dvCalculado + '0');
        }

        return dvIngresado == dvEsperado;
    }
}