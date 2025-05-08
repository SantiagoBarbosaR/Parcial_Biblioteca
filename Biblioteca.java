/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author estudiante
 */
public class Biblioteca {
    
    /**
     * @param args the command line arguments
     */
    private static List<Categoria> categoria = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        cargarMenus();
        // TODO code application logic herewhile (true) {
        while (true){
            System.out.println("**Biblioteca**");
            System.out.println("1. Ver libros");
            System.out.println("2.solicitar Prestamo");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> mostrarMenus();
                case 2 -> realizarPedido();
                case 3 -> System.out.println("GRACIAS");
                default -> System.out.println("opcion no valida");
            }

        }
    }
    private static void cargarMenus() {
        Categoria desayuno = new Categoria("miedo");
        desayuno.addItem(new Libros("it", "miedo"));
        desayuno.addItem(new Libros("it 2", "miedo"));

        Categoria almuerzo = new Categoria("accion");
        almuerzo.addItem(new Libros("señor de los anillos", "accion"));
        almuerzo.addItem(new Libros("harry potter", "accion"));

        Categoria cena = new Categoria("drama");
        cena.addItem(new Libros("after", "accion"));
        cena.addItem(new Libros("3 metros sobre el cielo", "accion"));

        Categoria.addItem(miedo);
        Categoria.addItem(accion);
        Categoria.addItem(drama);
    }
    private static void mostrarMenus() {
        for (Libros menu : Categoria) {
            System.out.println(menu);
        }
    private static void realizarPedido() {
        mostrarMenus();
        Order order = new Order();
        System.out.println("Ingrese el número del menú (1-" + menus.size() + "):");
        int menuIndex = scanner.nextInt() - 1;

        if (menuIndex < 0 || menuIndex >= menus.size()) {
            System.out.println("Menú inválido.");
            return;
        }

        Menu selectedMenu = menus.get(menuIndex);

        while (true) {
            System.out.println(selectedMenu);
            System.out.println("Seleccione el número del ítem a agregar o 0 para terminar:");
            int itemIndex = scanner.nextInt();
            if (itemIndex == 0) {
                break;
            }
            if (itemIndex < 1 || itemIndex > selectedMenu.getItems().size()) {
                System.out.println("Ítem inválido.");
                continue;
            }
            order.addItem(selectedMenu.getItems().get(itemIndex - 1));
        }

        order.printOrder();
    }
}
    

