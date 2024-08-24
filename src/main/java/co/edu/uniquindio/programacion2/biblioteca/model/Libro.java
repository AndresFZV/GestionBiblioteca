package co.edu.uniquindio.programacion2.biblioteca.model;

public class Libro {

    // Atributos de la clase Libro
    private String titulo;
    private String autor;
    private String isbn;
    private String estado;

    // Constructor con todos sus atributos
    public Libro(String titulo, String autor, String isbn, String estado){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estado = estado;
    }

    // Constructor vacío
    public Libro(){

    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método toString

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", estado=" + estado +
                '}';
    }
}
