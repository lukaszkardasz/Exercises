package exercises.org.inheritance;

class Company extends Employee{


    public static void main(String[] args) {


        Company employee1 = new Company();
        employee1.name = "Jan";
        employee1.surname = "Kowalski";
        employee1.birthYear = 1985;
        employee1.seniority = 5;
        employee1.employeeInfo = "Imie: " + employee1.name + ", Nazwisko: " + employee1.surname + ", rok urodzenia: "
                + employee1.birthYear + ",  Staz pracy: " + employee1.seniority + " lat";

        Company employee2 = new Company();
        employee2.name = "Zenek";
        employee2.surname = "Ptak";
        employee2.birthYear = 1981;
        employee2.seniority = 3;
        employee2.employeeInfo = "Imie: " + employee2.name + ", Nazwisko: " + employee2.surname + ", rok urodzenia: "
                + employee2.birthYear + ",  Staz pracy: " + employee2.seniority + " lat";

        Company employee3 = new Company();
        employee3.name = "Wiesiek";
        employee3.surname = "Glut";
        employee3.birthYear = 1971;
        employee3.seniority = 25;
        employee3.employeeInfo = "Imie: " + employee3.name + ", Nazwisko: " + employee3.surname + ", rok urodzenia: "
                + employee3.birthYear + ",  Staz pracy: " + employee3.seniority + " lat";

        System.out.println("Pracownicy firm:");
        System.out.println(employee1.employeeInfo);
        System.out.println(employee2.employeeInfo);
        System.out.println(employee3.employeeInfo);

    }
}
