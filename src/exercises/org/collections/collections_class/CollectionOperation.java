package exercises.org.collections.collections_class;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author n2god on 18/07/2019
 * @project Exercises
 */
public class CollectionOperation {
    public static void main(String[] args) {
        String sentence = "Strona testowa służy dwóm celom: stanowi wizualne potwierdzenie "
                + "działania drukarki i może również zawierać informacje pomocne podczas "
                + "rozwiązywania problemów, takie jak szczegóły dotyczące sterownika drukarki.";
        List<String> words = Arrays.asList(sentence.split(" "));
        System.out.println("Lista oryginalna podzielona spacjami: ");
        printCollection(words);
        System.out.println();

        //wymieszanie słów
        Collections.shuffle(words);
        System.out.println("Lista shuffle: ");
        printCollection(words);

        //sortowanie
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Lista posortowana: ");
        printCollection(words);

        //wyszukiwanie binarne
        int position = Collections.binarySearch(words, "drukarki");
        System.out.println("Słowo \"drukarki\" jest w liście na " + position + " miejscu");

        //ilość wystąpień
        String word = "drukarki";
        int freq = Collections.frequency(words, word);
        System.out.println("Ilość wystąpień słowa " + word + ": " + freq);

        //najmniejszy element listy
        System.out.println("Najmniejszy element listy to: " + Collections.min(words));



    }

    private static void printCollection(Collection<String> collection) {
        for (String s : collection) {
            System.out.print(s + "; ");
        }
        System.out.println();
    }
}
