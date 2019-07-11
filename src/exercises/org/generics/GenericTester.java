package exercises.org.generics;

/**
 * @author n2god on 11/07/2019
 * @project Exercises
 */
public class GenericTester {

    public static void main(String[] args) {

        //definiujemy kontener przechowujący liczby całkowite
        Container<Integer> integers = new Container<Integer>();

        //przypisujemy nową tablicę typu integert
        integers.setArray(new Integer[5]);

        //do 3 elementu przypisujemy 5
        integers.getArray()[3] = 5;


        //definiujemy kontener przechowujący Stringi
        Container<String> strings = new Container<String>();

        //przypisujemy tablicę typu String
        strings.setArray(new String[5]);

        //przypisujemy 1 i 2 element tablicy
        strings.getArray()[0] = "Basia";
        strings.getArray()[1] = "Srasia";

        //odczyt danych bez konieczności rzutowania
        Integer num = integers.get(3);
        String str = strings.get(1);

        //wyświetlenie
        System.out.println(num);
        System.out.println(str);

    }
}
