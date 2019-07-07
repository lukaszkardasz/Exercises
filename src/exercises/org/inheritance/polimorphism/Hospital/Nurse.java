package exercises.org.inheritance.polimorphism.Hospital;

public class Nurse extends Person {

    private double overtime;

    public Nurse(String firstName, String lastName, double cashEarned, double overtime) {
        super(firstName, lastName, cashEarned);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public String getInfo() {
        return super.getInfo() + ", Nadgodziny: " + overtime;
    }
}
