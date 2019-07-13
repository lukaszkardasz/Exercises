package exercises.org.collections.set;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author n2god on 13/07/2019
 * @project Exercises
 */
public class NamesSet {

    public static final String NAMES = "C:\\java\\Exercises\\src\\exercises\\org\\collections\\set\\namespl.txt";

    public static void main(String[] args) {
        TreeSet<String> namesSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return -s1.compareToIgnoreCase(s2);
            }
        });

        try (BufferedReader reader = new BufferedReader(new FileReader(NAMES))) {
            String nextLine;
            while ((nextLine = reader.readLine()) != null) {
                namesSet.add(nextLine);
            }

        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku!");
        } catch (IOException e) {
            System.err.println("Błąd wej-wyj");
        }

        System.out.println("Ilość imion: " + namesSet.size());
        System.out.println("First: " + namesSet.first());
        System.out.println("Last: " + namesSet.last());
    }
}
