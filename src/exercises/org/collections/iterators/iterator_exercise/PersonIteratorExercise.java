package exercises.org.collections.iterators.iterator_exercise;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author n2god on 17/07/2019
 * @project Exercises
 */
public class PersonIteratorExercise {
    public static void main(String[] args) {

        Map<String, Person> namesMap = new TreeMap<>();

        namesMap.put("z", new Person("Jan", "Nowak", 33));
        namesMap.put("y", new Person("Paweł", "Kowalski", 53));
        namesMap.put("f", new Person("Wacek", "Pracz", 13));

        Iterator<Person> namesMapIterator = namesMap.values().iterator();
        while (namesMapIterator.hasNext()){
            System.out.println(namesMapIterator.next().toString());
        }

    }
}
