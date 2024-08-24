package co.edu.uniquindio.programacion2.biblioteca.model;

public class Prestamo {

    // Atributos de la clase Prestamo
    private String fechaPrestamo;
    private String fechaDevolucion;
    private Miembro miembro;
    private Libro libro;

    // Constructor con todos sus atributos
    public Prestamo(String fechaPrestamo, String fechaDevolucion, Miembro miembro, Libro libro) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.miembro = miembro;
        this.libro = libro;
    }

    // Constructor vacío
    public Prestamo(){

    }

    // Getters y Setters
    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Miembro getMiembro() {
        return miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    // Método toString
    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaPrestamo='" + fechaPrestamo + '\'' +
                ", fechaDevolucion='" + fechaDevolucion + '\'' +
                ", libroISBN='" + (libro != null ? libro.getIsbn() : "null") + '\'' +
                ", miembroId='" + (miembro != null ? miembro.getIdMiembro() : "null") + '\'' +
                '}';
    }

}
