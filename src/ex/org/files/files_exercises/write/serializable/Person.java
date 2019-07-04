package ex.org.files.files_exercises.write.serializable;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1111111111111111111L;

    private String firstName;
    private String lastName;
    transient private String pesel = "983323411"; //nie serializujemy tego

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

    public Person(){
    }

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

}
