package exercises.org.arrays.exercise_Arrays;

import java.util.Objects;

/**
 * @author n2god on 11/07/2019
 * @project Exercises
 */
public class Person {

    private String firstName;
    private String lastName;
    private String Pesel;

    public Person(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        Pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return Pesel;
    }

    public void setPesel(String pesel) {
        Pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) &&
                Pesel.equals(person.Pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, Pesel) * 17;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Pesel='" + Pesel;
    }
}
