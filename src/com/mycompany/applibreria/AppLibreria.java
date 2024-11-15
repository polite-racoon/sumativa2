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

        //usuarios base
        final ArrayList<Usuario> usuarios = new ArrayList<Usuario>(
                Arrays.asList(
                      new Estudiante("12341234-1", "Pepito TV", 'M', "Teatro"),
                      new Estudiante("5678567-8", "Cirilo Morrochuca", 'M', "Medicina"),
                      new Docente("4321432-1", "Pepe Machuca", 'M', "Calculator Prompt Engineer", true, false)
                )
        );

        for (Usuario usuario : usuarios) {
            System.out.println(usuario.toString());
        }

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
//        Prestamo prestamo = Prestamo.ingresarPrestamo(1, "1-2", libros, usuarios);
        // AGREGAMOS EL PRÉTAMO AL ARREGLO DE PRÉSTAMOS
        /*
        prestamos.add(prestamo);
        // IMPRIMIMOS EL ESTADO ACTUAL DEL PRÉSTAMO
        System.out.println(prestamo.toString());
        // GENERAMOS UNA DEVOLUCION
        Prestamo.ingresarDevolucion(1, "1-2", prestamos);
        System.out.println("-----------------------------------------------------------");
        // IMPRIMIMOS EL ESTADO ACTUAL DEL PRÉSTAMO
        System.out.println(prestamo.toString());

         */
    }
}