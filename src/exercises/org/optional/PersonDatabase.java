package exercises.org.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonDatabase {
    private List<Person> people = new ArrayList<>();

    public void add(Person person) {
        if (person == null) {
            throw new NullPointerException("Cannot add null to list");
        }

        /* można napisać tak: if (findById(person.getId()).isPresent()) {
            throw new IllegalArgumentException("Person with this id already exist");
        }
        mozna zapisać tak:
        */
        findById(person.getId())
                .ifPresent(p -> new IllegalArgumentException("Osoba o podanym id już istnieje!"));
        people.add(person);
    }

    public Optional<Person> findById(int id) {
        for (Person person : people) {
            if (person.getId() == id) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public String findLastNameById(int id) {
        /* przed mapowaniem for (Person person : people) {
            if (person.getId() == id) {
                return person.getLastName();
            }
        }
        return "Anonim";*/

        //mapujemy jeden optional na drugi, żeby jeszcze raz nie przeszukiwać listy chcąc znaleść nazwisko jak mamy już id
        return findById(id) //Optional<Person>
                .map(Person::getLastName) //Optional<String>
                .orElse("Anonim"); //
        /*
        lub zwyczajnie: if(optionalLastName.isPresent())
        return optionalLastName.get();
        else
        return "Anonim";
        */
    }
}
