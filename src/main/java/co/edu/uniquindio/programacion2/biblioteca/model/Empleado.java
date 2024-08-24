package co.edu.uniquindio.programacion2.biblioteca.model;

public  class Empleado {

    // Atributos de la clase Empleado
    private String nombre;
    private String idEmpleado;

    // Constructor con todos sus atributos
    public Empleado(String nombre, String idEmpleado){
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
    }

    // Constructor vacío
    public Empleado(){

    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    // Método toString
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", idEmpleado='" + idEmpleado + '\'' +
                '}';
    }
}
