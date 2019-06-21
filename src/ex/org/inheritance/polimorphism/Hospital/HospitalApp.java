package ex.org.inheritance.polimorphism.Hospital;

public class HospitalApp {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.add(new Doctor("Wladek", "Kura", 3093.77, 300.0));
        hospital.add (new Nurse("Adda", "Karenina", 2200.04, 3));
        hospital.add (new Nurse("Anna", "Kwach", 2500.04, 7));
        System.out.println("Pracownicy szpitala: ");
        System.out.println(hospital.getInfo());
    }



}
