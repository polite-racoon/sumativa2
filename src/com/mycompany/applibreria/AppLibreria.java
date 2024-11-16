package com.mycompany.applibreria;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AppLibreria {
    static void crearUsuario(String run, String nombreCompleto, char genero, String carrera, ArrayList<Usuario> usuarios) {
        try {
            Estudiante estudiante = new Estudiante(run, nombreCompleto, genero, carrera);
            usuarios.add(estudiante);
            System.out.println("Estudiante agregado correctamente");
        } catch (IllegalArgumentException e) {
            System.out.println("RUN incorrecto");
        }
    }

    static void crearUsuario(String run, String nombreCompleto, char genero, String profesion, boolean magister, boolean doctor, ArrayList<Usuario> usuarios) {
        try {
            Docente docente = new Docente(run, nombreCompleto, genero, profesion, magister, doctor);
            usuarios.add(docente);
            System.out.println("Docente agregado correctamente");
        } catch (IllegalArgumentException e) {
            System.out.println("RUN incorrecto");
        }
    }

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dtf.format(now));

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

        //prueba
//        crearUsuario("13.753.879-2", "Carlos", 'M', "Ingeniería Informatica", usuarios);
//        crearUsuario("19.753.879-2", "Pablo", 'M', "Ingeniería Informatica", usuarios);
//        crearUsuario("15093841-4", "Helen", 'F', "Arquitecto", false, false, usuarios);
//        for (Usuario usuario : usuarios) {
//            System.out.println(usuario.toString());
//        }


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
                    /*
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

                     */
            }
        } while (menuBiblioteca != 5);
    }
}