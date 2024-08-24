package co.edu.uniquindio.programacion2.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class Miembro {

    // Atributos de la clase Miembro
    private String nombre;
    private String idMiembro;
    private List<Prestamo> listaPrestamos = new ArrayList<>();

    // Constructor con todos sus atributos
    public Miembro(String nombre, String idMiembro) {
        this.nombre = nombre;
        this.idMiembro = idMiembro;
    }

    // Constructor vacío
    public Miembro(){

    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdMiembro() {
        return idMiembro;
    }

    public void setIdMiembro(String idMiembro) {
        this.idMiembro = idMiembro;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    // Método toString
    @Override
    public String toString() {
        return "Miembro{" +
                "nombre='" + nombre + '\'' +
                ", idMiembro='" + idMiembro + '\'' +
                '}';
    }
}
