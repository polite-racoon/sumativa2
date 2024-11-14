package com.mycompany.applibreria;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class AppLibreria {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dtf.format(now));


       /* Docente docente1 = new Docente("4-4");
        Docente docente2 = new Docente("9-9");

        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        usuarios.add(docente1);
        usuarios.add(docente2);
        */

        // GENERAMOS DATOS DE USUARIOS BASE
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>(
                Arrays.asList(
                        new Docente("1-1"),
                        new Docente("1-2"),
                        new Docente("1-3"),
                        new Estudiante("2-1"),
                        new Estudiante("2-2"),
                        new Estudiante("2-3")
                )
        );
        // GENERAMOS DATOS DE LIBROS BASE
        ArrayList<Libro> libros = new ArrayList<Libro>(
                Arrays.asList(
                        new Libro(1),
                        new Libro(2),
                        new Libro(3),
                        new Libro(4),
                        new Libro(5)
                )
        );
        // UN LISTA DE DEVOLUCIONES
        ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
        // GENERAMOS UN PRÉSTAMO
        Prestamo prestamo = Prestamo.ingresarPrestamo(1, "1-2", libros, usuarios);
        // AGREGAMOS EL PRÉTAMO AL ARREGLO DE PRÉSTAMOS
        prestamos.add(prestamo);
        // IMPRIMIMOS EL ESTADO ACTUAL DEL PRÉSTAMO
        System.out.println(prestamo.toString());
        // GENERAMOS UNA DEVOLUCION
        Prestamo.ingresarDevolucion(1, "1-2", prestamos);
        System.out.println("-----------------------------------------------------------");
        // IMPRIMIMOS EL ESTADO ACTUAL DEL PRÉSTAMO
        System.out.println(prestamo.toString());
    }
}