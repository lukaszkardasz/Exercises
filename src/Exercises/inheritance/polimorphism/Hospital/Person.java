package Exercises.inheritance.polimorphism.Hospital;

public class Person {

    private String firstName;
    private String lastName;
    private double cashEarned;

    public Person(String firstName, String lastName, double cashEarned) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cashEarned = cashEarned;
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

    public double getCashEarned() {
        return cashEarned;
    }

    public void setCashEarned(double cashEarned) {
        this.cashEarned = cashEarned;
    }


    public String getInfo() {
        return getFirstName() + " " + getLastName() + " " + getCashEarned();
    }
}
