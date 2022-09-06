package ar.edu.ort.ejercicio8;

public abstract class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Empleado(int dni, String nombre, String apellido, int anioIngreso) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }
}
