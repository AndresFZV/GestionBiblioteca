package co.edu.uniquindio.programacion2.biblioteca.model;

import co.edu.uniquindio.programacion2.biblioteca.services.IGestionInventario;

import java.util.ArrayList;
import java.util.List;

public class Bibliotecario extends Empleado implements IGestionInventario {

    private Libro libro;
    private List<Prestamo> listaPrestamos = new ArrayList<>();

    // private Prestamo prestamo;

    // Constructor con todos sus atributos y herencia
    public Bibliotecario(String nombre, String idEmpleado, Libro libro) {
        super(nombre, idEmpleado);
        this.libro = libro;
        //this.prestamo = prestamo;
    }

    // Constructor vacío
    public Bibliotecario() {
    }

    // Getters y Setters
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

   // public Prestamo getPrestamo() {
     //   return prestamo;
    //}

    //public void setPrestamo(Prestamo prestamo) {
      //  this.prestamo = prestamo;
    //}

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    // Método toString
    @Override
    public String toString() {
        return "Bibliotecario{" +
                "libro=" + libro +
                "lista prestamos=" + listaPrestamos.size() +
              //  ", prestamo=" + prestamo +
                '}';
    }

    // Implementamos los métodos de la Interface
    @Override
    public void gestionarItem(){
        if(libro != null){
            System.out.println(getNombre() + " está gestionando el libro: " + libro);
        } else {
            System.out.println(getNombre() + " no tiene un libro asignado para gestionar.");
        }
    }

    @Override
    public void gestionarItem(String revista){
        System.out.println(getNombre() + " está gestionando " + revista);
    }

    @Override
    public void gestionarPrestamo(){
        if (listaPrestamos != null && !listaPrestamos.isEmpty()) {
            System.out.println(getNombre() + " está gestionando los siguientes préstamos:");
            for (Prestamo prestamo : listaPrestamos) {
                System.out.println(prestamo);
            }
        } else {
            System.out.println(getNombre() + " no tiene préstamos para gestionar.");
        }
    }
}
