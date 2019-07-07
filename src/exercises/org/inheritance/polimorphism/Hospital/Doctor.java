package exercises.org.inheritance.polimorphism.Hospital;

public class Doctor extends Person {

    private double bonus;

    public Doctor(String firstName, String lastName, double cashEarned, double bonus) {
        super(firstName, lastName, cashEarned);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getInfo() {
        return super.getInfo() + ", Premia: " + bonus;
    }
}
