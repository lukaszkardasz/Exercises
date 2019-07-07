package exercises.org.files.files_exercises.person_files;

import java.io.Serializable;

/**
 * @author n2god on 06/07/2019
 * @project Exercises
 */
public class TableOfEmployees extends Person implements Serializable {

    private static final long serialVersionUID = 1812014377088226529L;

    private double salary;

    public TableOfEmployees(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Pracownik: " + super.toString() + " zarabia: " + getSalary();
    }
}
