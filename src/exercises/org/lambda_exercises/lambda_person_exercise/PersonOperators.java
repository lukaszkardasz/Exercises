package exercises.org.lambda_exercises.lambda_person_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class PersonOperators {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jan", "Kowalski", 42));
        persons.add(new Person("Kasia", "Kruczkowska", 22));
        persons.add(new Person("Piotr", "Adamiak", 15));
        persons.add(new Person("Krzysztof", "Wojtyniak", 16));
        persons.add(new Person("Agnieszka", "Zagumna", 18));
        persons.add(new Person("Basia", "Cyniczna", 28));

        consumeList(persons, p -> System.out.println(p));
        System.out.println(">>>");
        applyToList(persons, p -> {

        }



    }
    private static <T> void applyToList(List<T> list, Function<T, T> pre){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, pre.apply(list.get(i)));
        }
    }

    private staticK


}
