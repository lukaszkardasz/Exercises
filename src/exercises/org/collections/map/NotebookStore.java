package exercises.org.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author n2god on 13/07/2019
 * @project Exercises
 */
public class NotebookStore {
    public static void main(String[] args) {
        Map<String, Notebook> notebooks = new HashMap<>();
        notebooks.put("B590", new Notebook("Lenovo", "B590"));
        notebooks.put("Inspiron0211A", new Notebook("Dell", "Inspiron0211A"));
        notebooks.put("G2A33EA", new Notebook("HP", "G2A33EA"));
        notebooks.put("XPS0091V", new Notebook("Dell", "XPS0091V"));

        System.out.println("Lapki:");
        Set<String> keys = notebooks.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

        String searchedkey = "G2A33EA";
        System.out.println("Czy znaleziono lapka o kodzie G2A33EA");
        Notebook foundNotebook = notebooks.get(searchedkey);
        System.out.println(foundNotebook);

        notebooks.remove("G2A33EA");
        System.out.println("Czy znaleziono lapka o kodzie G2A33EA");
        foundNotebook = notebooks.get(searchedkey);
        System.out.println(foundNotebook);

        System.out.println("Ilość produktów: " + notebooks.size());

    }
}
