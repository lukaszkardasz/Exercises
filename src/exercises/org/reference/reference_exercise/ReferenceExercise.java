package exercises.org.reference.reference_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReferenceExercise {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Karol", "Wojtek", "Alicja", "Bartek", "Romek");

        Collections.sort(names, (String s1, String s2) -> s1.compareToIgnoreCase(s2));
        //names.sort(String::compareToIgnoreCase);
        names.forEach(System.out::println);
    }
}
