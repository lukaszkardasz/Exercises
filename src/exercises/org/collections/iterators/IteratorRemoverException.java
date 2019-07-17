package exercises.org.collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author n2god on 17/07/2019
 * @project Exercises
 */
public class IteratorRemoverException {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
            names.add("Kasia");
            names.add("Basia");
            names.add("Franek");
            names.add("Kajtek");
            names.add("Wojtek");
            names.add("Maniek");


        //nie korzystamy z iteratora
        System.out.println(">>>> Pętla 1");
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);
            if(name.equals("Basia")){
                names.remove(name);
                i--;
            }
        }

        Iterator<String> namesIterator = names.iterator();
/*        System.out.println(">>>> Pętla 2");
        while (namesIterator.hasNext()) {
            String name = namesIterator.next();
            System.out.println(name);
            if (name.equals("Kasia")) {
                names.remove(name);
                // błąd - iterujemy po kolekcji za pomocą iteratora, a usuwamy
                // obiekt metodą remove() bezpośrednio z kolekcji
            }
        }

        System.out.println(">>>> Pętla 3");
        for (String name : names) {
            System.out.println(name);
            if (name.equals("Maniek")){
                // błąd - iterujemy po kolekcji za pomocą niejawnego iteratora
                // petli for-each, a usuwamy
                // obiekt metodą remove() bezpośrednio z kolekcji
                names.remove(name);
            }
        }*/

        System.out.println(">>>> Pętla 4 - poprawna");
        while (namesIterator.hasNext()){
            String name = namesIterator.next();
            System.out.println(name);
            if (name.equals("Kajtek")){
                namesIterator.remove();
            }
        }
        System.out.println("Po usunięciu: ");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
