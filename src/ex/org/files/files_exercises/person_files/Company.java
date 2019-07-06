package ex.org.files.files_exercises.person_files;

import java.io.Serializable;

/**
 * @author n2god on 06/07/2019
 * @project Exercises
 */
public class Company implements Serializable {

    private static final long serialVersionUID = -3425273230264572679L;
    public static final int EMPLOYEES = 3;

    private Employee[] employees = new Employee[EMPLOYEES];

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void add(Employee employee, int index){
        employees[index] = employee;
    }
}
