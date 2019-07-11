package exercises.org.arrays.exercise_Arrays;

import java.util.Arrays;

/**
 * @author n2god on 11/07/2019
 * @project Exercises
 */
public class PersonDatabase {
    final int INITIAL_CAPACITY = 1;
    Person[] persons = new Person[INITIAL_CAPACITY];
    int emptyPlace;


    public void add(Person p) {
        if (emptyPlace == persons.length) {
            persons = Arrays.copyOf(persons, persons.length * 2);
        }
        persons[emptyPlace] = p;
        emptyPlace++;
    }

    public void remove(Person p) {
        if (p == null)
            return;

        final int NOT_FOUND = -1;
        int found = NOT_FOUND;
        int i = 0;
        while (i < persons.length && found == NOT_FOUND) {
            if (p.equals(persons[i])) {
                found = i;
            } else {
                i++;
            }
        }

        if (found != NOT_FOUND) {
            System.arraycopy(persons, found + 1, persons, found, persons.length - found - 1);
            emptyPlace--;
        }
    }

    public Person get(int index) throws ArrayIndexOutOfBoundsException {
        //zwrócenie obiektu zapisanego pod indeksem index lub rzucenie wyjątku jeśli wykracza poza index
        if (index <= emptyPlace || index < 0){
            return persons[index];
        } else throw new ArrayIndexOutOfBoundsException("Poza zakresem!");
    }

    public int size() {
        //ilość zapisanych osób
        return emptyPlace;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonsDatabase size: " + size());
        sb.append("\n");
        for (int i = 0; i < emptyPlace; i++) {
            sb.append(persons[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
