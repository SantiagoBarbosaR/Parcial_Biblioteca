/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author estudiante
 */
public class Prestamos {
    
     private List<Libros> orderedItems = new ArrayList<>();

    public void addItem(Libros item) {
        orderedItems.add(item);
    }

    public Stream<Libros> getLista() {
        return orderedItems.stream();
    }

    public void printOrder() {
        System.out.println("prestamo:");
        for (Libros item : orderedItems) {
            System.out.println("- " + item);
        }
        System.out.println("->" + getLista());
    }
    
}
