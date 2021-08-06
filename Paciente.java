
package eddlistaenlazada202101;

public class Paciente {
    String nombre,apellido;
    int carnet;
    int edad;

    public Paciente(String nombre, String apellido, int carnet, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
