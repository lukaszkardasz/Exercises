package exercises.org.inheritance.polimorphism.Hospital;

public class Hospital {
    final int MAX_PERSONS = 3;
    private Person[] employees = new Person[MAX_PERSONS];
    private int employesNumber = 0;

    public Person[] getEmployees() {
        return employees;
    }

    public void setEmployees(Person[] employees) {
        this.employees = employees;
    }

    public int getEmployesNumber() {
        return employesNumber;
    }

    public void setEmployesNumber(int employesNumber) {
        this.employesNumber = employesNumber;
    }

    public void add(Person person){
        if (getEmployesNumber() < MAX_PERSONS){
            getEmployees()[getEmployesNumber()] = person;
            setEmployesNumber(getEmployesNumber() + 1);
        } else{
            System.out.println("Maksymalna liczba pracowników!");
        }
    }

    public String getInfo(){
        String info = "";
        for (int i = 0; i < employesNumber; i++) {
            info = info + employees[i].getInfo() + "\n";
        }
        return info;
    }
}
