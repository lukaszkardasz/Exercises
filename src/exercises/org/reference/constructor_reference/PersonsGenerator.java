package exercises.org.reference.constructor_reference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class PersonsGenerator {
    public static void main(String[] args) {


        //List<Person> persons = generate(10, Person::new);
        //or
        //Supplier<Person> personConstructor = Person::new;
        //List<Person> persons = generate(10, personConstructor);
        //or
        Supplier<Person> personConstructor = () -> new Person();
        List<Person> persons = generate(10, personConstructor);

        persons.forEach(System.out::println);
    }

    public static<T> List<T> generate(int num, Supplier<T> sup){
        List<T> result = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            result.add(sup.get());
        }
        return result;
    }
}
