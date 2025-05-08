/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author estudiante
 */
public class Categoria {
    
    private String name;
    private List<Libros> items;

    public Categoria(String name) {
        this.name = name;
        this.items = items;
    }

    public void addItem(Libros item) {
        items.add(item);
    }

    public List<Libros> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name + ":\n");
        for (int i = 0; i < items.size(); i++) {
            sb.append((i + 1)).append(". ").append(items.get(i)).append("\n");
        }
        return sb.toString();
    }
    
}
