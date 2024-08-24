package co.edu.uniquindio.programacion2.biblioteca.model;

import java.util.ArrayList;
import java.util.List;

public class GestionBiblioteca {

    // Atributos y listas
    private String nombreBiblioteca;
    private List<Miembro> listaMiembros = new ArrayList<>();
    private List<Empleado> listaEmpleados = new ArrayList<>();
    private List<Prestamo> listaPrestamos = new ArrayList<>();
    private List<Bibliotecario> listaBibliotecarios = new ArrayList<>();
    private List<Libro> listaLibros = new ArrayList<>();

    // Constructor con todos sus atributos
    public GestionBiblioteca(String nombreBiblioteca, List<Miembro> listaMiembros, List<Empleado> listaEmpleados,
                             List<Prestamo> listaPrestamos, List<Bibliotecario> listaBibliotecarios,
                             List<Libro> listaLibros) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.listaMiembros = listaMiembros;
        this.listaEmpleados = listaEmpleados;
        this.listaPrestamos = listaPrestamos;
        this.listaBibliotecarios = listaBibliotecarios;
        this.listaLibros = listaLibros;
    }

    // Constructor vacío
    public GestionBiblioteca(){

    }

    // Getters y Setters
    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    public List<Miembro> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros(List<Miembro> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public List<Bibliotecario> getListaBibliotecarios() {
        return listaBibliotecarios;
    }

    public void setListaBibliotecarios(List<Bibliotecario> listaBibliotecarios) {
        this.listaBibliotecarios = listaBibliotecarios;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    // Método toString
    @Override
    public String toString() {
        return "GestionBiblioteca{" +
                "nombreBiblioteca='" + nombreBiblioteca + '\'' +
                ", listaMiembros=" + listaMiembros +
                ", listaEmpleados=" + listaEmpleados +
                ", listaPrestamos=" + listaPrestamos +
                ", listaBibliotecarios=" + listaBibliotecarios +
                ", listaLibros=" + listaLibros +
                '}';
    }
}
