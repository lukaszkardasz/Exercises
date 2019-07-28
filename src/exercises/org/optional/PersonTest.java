package exercises.org.optional;

import java.util.Optional;

public class PersonTest {
    public static void main(String[] args) {
        PersonDatabase db = new PersonDatabase();
        db.add(new Person(1, "Jan", "Kowalski"));
        db.add(new Person(2, "Karol", "Zawadzki"));
        db.add(new Person(3, "Bartosz", "Abacki"));
        db.add(new Person(4, "Ania", "Walczak"));

        Optional<Person> personOpt1 = db.findById(2); // Karol Zawadzki
        Optional<Person> personOpt2 = db.findById(55); // null

        /*personOpt1.ifPresent(person -> System.out.println(person.getLastName()));
        personOpt2.ifPresent(person -> System.out.println(person.getLastName()));

        personOpt2.ifPresentOrElse(
                p -> System.out.println(p.getLastName()),
                () -> System.out.println("Brak obiektu o wskazanym id!")
        );*/

        db.findById(2).ifPresent(PersonTest::printLastName);
        Optional<Person> optPerson = db.findById(55); //null

        optPerson.ifPresent(PersonTest::printLastName);
        //lub
        optPerson.ifPresentOrElse(
                PersonTest::printLastName,
                () -> System.out.println("Brak obiektu o wskazanym id")
                );
    }

    private static void printLastName(Person person) {
        System.out.println(person.getLastName());;
    }
}
