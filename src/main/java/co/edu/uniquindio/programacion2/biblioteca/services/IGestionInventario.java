package co.edu.uniquindio.programacion2.biblioteca.services;

import co.edu.uniquindio.programacion2.biblioteca.model.Libro;

public interface IGestionInventario {

    void gestionarItem();
    void gestionarItem(String revista);
    void gestionarPrestamo();
}
