package exercises.org.reference.constructor_reference;

import java.util.List;
import java.util.function.Supplier;

public class PersonsGenerator {
    public static void main(String[] args) {
        List<Person> persons = generate(10, Person:new);
    }

    public static<T> List<T> generate(int num, Supplier<T> sup){

    }

}
