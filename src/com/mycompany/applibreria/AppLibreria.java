package com.mycompany.applibreria;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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

        ArrayList<Usuario> usuarios = new ArrayList<>();
        // Array para poder generar y borrar usuarios dentro de la memoria

        Scanner scanner = new Scanner(System.in);
        int menuBiblioteca;
        int menuUsuario;
        int menuLibro;
        int menuPrestamo;
        int menuDevolucion;

        do {
            System.out.println("Menu");
            System.out.println("1. Menu Usuario");
            System.out.println("2. Menu Libro");
            System.out.println("3. Menu Prestamo");
            System.out.println("4. Menu Devolucion");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");

            menuBiblioteca = scanner.nextInt();

            switch (menuBiblioteca) {
                //Opciones usuario
                case 1:
                    do {
                        System.out.println("1. Crear Usuario: ");
                        System.out.println("2. Mostrar Usuarios: ");
                        System.out.println("3. Eliminar Usuario: ");
                        System.out.println("4. Salir: ");
                        System.out.print("Elige una opcion: ");

                        menuUsuario = scanner.nextInt();
                        switch (menuUsuario) {
                            case 1:
                                System.out.print("Ingrese el nombre del usuario: ");
                                String nombreCompleto = scanner.nextLine();
                                System.out.print("Ingrese el run usuario: ");
                                String run = scanner.nextLine();
                                System.out.print("Ingrese M o F segun su genero: ");
                                char genero = scanner.next().charAt(0);
                                System.out.print("Ingrese la carrera del usuario: ");
                                String carrera = scanner.nextLine();

                            case 2:
                                System.out.println("Lista de usuarios:");
                                for (int i = 0; i < usuarios.size(); i++) {
                                    System.out.println((i + 1) + ". " + usuarios.get(i));
                                }
                                break;

                            case 3:
                                System.out.println("Lista de usuarios:");
                                for (int i = 0; i < usuarios.size(); i++) {
                                    System.out.println((i + 1) + ". " + usuarios.get(i).getNombreCompleto());
                                }
                                System.out.print("Selecciona el número del usuario a eliminar: ");
                                int indice = scanner.nextInt();
                                if (indice > 0 && indice <= usuarios.size()) {
                                    usuarios.remove(indice - 1);
                                    System.out.println("Usuario eliminado con éxito.");
                                } else {
                                    System.out.println("Índice no válido.");
                                }
                                break;

                        }
                    } while (menuUsuario != 4);
                //Crear Libros
                case 2:
                    do {
                        System.out.println("1. Crear Libro: ");
                        System.out.println("2. Mostrar Libros: ");
                        System.out.println("3. Eliminar Libro: ");
                        System.out.println("4. Salir: ");
                        System.out.print("Elige una opcion: ");

                        menuLibro = scanner.nextInt();
                        switch (menuLibro) {
                            case 1:
                        }

                    }
                case 3:
                    do {

                    }
                case 4:
                    do {

                    }
            }
        } while (menuBiblioteca != 5);
    }
}