package co.edu.uniquindio.programacion2.biblioteca.services;

import co.edu.uniquindio.programacion2.biblioteca.model.*;

public class MainBiblioteca {
    public static void main(String[] args) {

        GestionBiblioteca gestionBiblioteca = inicializarDatos();
    }

    private static GestionBiblioteca inicializarDatos() {
        GestionBiblioteca gestionBiblioteca = new GestionBiblioteca();

        Miembro miembro = new Miembro();
        Miembro miembro2 = new Miembro();
        Empleado empleado = new Empleado();
        Empleado empleado2 = new Empleado();
        Bibliotecario bibliotecario = new Bibliotecario();
        Libro libro = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();
        Libro libro4 = new Libro();
        Prestamo prestamo = new Prestamo();
        Prestamo prestamo2 = new Prestamo();

        // Datos de los miembros y su asociación
        miembro.setNombre("Stiven");
        miembro.setIdMiembro("1012");
        miembro.getListaPrestamos().add(prestamo);

        miembro2.setNombre("John");
        miembro2.setIdMiembro("8050");
        miembro2.getListaPrestamos().add(prestamo);
        miembro2.getListaPrestamos().add(prestamo2);

        // Datos de los empleados
        empleado.setNombre("David");
        empleado.setIdEmpleado("105006");

        empleado2.setNombre("Angelica");
        empleado2.setIdEmpleado("10934054");

        // Datos de los libros
        libro.setAutor("Miguel de Cervantes");
        libro.setIsbn("8430598677");
        libro.setEstado("Disponible");
        libro.setTitulo("Don Quijote de la Mancha");

        libro2.setAutor("Gabriel García Marquez");
        libro2.setIsbn("843760494X");
        libro2.setEstado("Disponible");
        libro2.setTitulo("Cien años de soledad");

        libro3.setAutor("Homero");
        libro3.setIsbn("1539427692");
        libro3.setEstado("Prestado");
        libro3.setTitulo("La Odisea");

        libro4.setAutor("Albert Camus");
        libro4.setIsbn("8420636940");
        libro4.setEstado("Prestado");
        libro4.setTitulo("El extranjero");

        // Información de los préstamos y su asociación
        prestamo.setFechaPrestamo("20 de agosto");
        prestamo.setFechaDevolucion("28 de agosto");
        prestamo.setLibro(libro3);
        prestamo.setMiembro(miembro);
        prestamo.setMiembro(miembro2);

        prestamo2.setFechaPrestamo("24 de agosto");
        prestamo2.setFechaDevolucion("31 de agosto");
        prestamo2.setLibro(libro4);
        prestamo2.setMiembro(miembro2);

        // Datos del bibliotecario y sus gestiones en la biblioteca
        bibliotecario.setNombre("Andrés");
        bibliotecario.setIdEmpleado("101237");
        bibliotecario.setLibro(libro);
        bibliotecario.setLibro(libro2);
        bibliotecario.getListaPrestamos().add(prestamo);
        bibliotecario.gestionarItem();
        bibliotecario.gestionarItem();
        bibliotecario.gestionarItem("Revista de la Semana");
        bibliotecario.gestionarPrestamo();

        // Añadimos los datos a la Biblioteca
        gestionBiblioteca.setNombreBiblioteca("Biblioteca Añañay");
        gestionBiblioteca.getListaMiembros().add(miembro);
        gestionBiblioteca.getListaMiembros().add(miembro2);
        gestionBiblioteca.getListaEmpleados().add(empleado);
        gestionBiblioteca.getListaEmpleados().add(empleado);
        gestionBiblioteca.getListaBibliotecarios().add(bibliotecario);
        gestionBiblioteca.getListaLibros().add(libro);
        gestionBiblioteca.getListaLibros().add(libro2);
        gestionBiblioteca.getListaLibros().add(libro3);
        gestionBiblioteca.getListaLibros().add(libro4);
        gestionBiblioteca.getListaPrestamos().add(prestamo);
        gestionBiblioteca.getListaPrestamos().add(prestamo2);
        
        return gestionBiblioteca;
    }
}