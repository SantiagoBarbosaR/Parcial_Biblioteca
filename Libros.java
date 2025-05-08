/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author estudiante
 */
public class Libros {
    String nombre;
    String estado;

    public Libros(String nombre, String estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return estado;
    }
    
    @Override
    public String toString() {
        return nombre + " - " + estado;
    }
}
