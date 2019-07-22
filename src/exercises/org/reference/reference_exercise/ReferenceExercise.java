package exercises.org.reference.reference_exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReferenceExercise {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Kowalski");
        names.add("Abacki");
        names.add("Wójnicki");
        names.add("Bednarek");
        names.add("Krzywousty");

        Collections.sort(names, ReferenceExercise::sortAscending);
        names.forEach(System.out::println);
    }

    private static int sortAscending(String s1, String s2){
        return s1.compareToIgnoreCase(s2);
    }
}
