package exercises.org.collections.map.map_exercise;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author n2god on 13/07/2019
 * @project Exercises
 */
public class Employee {

    private String firstName;
    private String lastName;
    private BigDecimal salary;

    public Employee(String firstName, String lastName, BigDecimal salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
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

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getFirstName(), employee.getFirstName()) &&
                Objects.equals(getLastName(), employee.getLastName()) &&
                Objects.equals(getSalary(), employee.getSalary());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getSalary());
    }

    @Override
    public String toString() {
        return "Employee[" +
                "firstName='" + firstName +
                ", lastName='" + lastName +
                ", salary=" + salary +
                ']';
    }
}
