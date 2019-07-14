package exercises.org.collections.map.map_exercise;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author n2god on 14/07/2019
 * @project Exercises
 */
public class CompanyApp {
    private static Company company = new Company();

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            Option option;

            do {
                printOptions();
                option = getOption(sc);
                sc.nextLine();

                switch (option) {
                    case ADD_EMPLOYEE:
                        addEmployee(sc);
                        break;
                    case SEARCH_EMPLOYEE:
                        findAndPrintemployee(sc);
                        break;
                    case EXIT:
                        break;
                    default:
                        System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
                }
            } while (option != Option.EXIT);
        }
    }

    private static void printOptions() {
        System.out.println("Wybierz opcję: ");
        for (Option value : Option.values()) {
            System.out.println(value.toString());
        }
    }

    private static void addEmployee(Scanner sc) {
        Employee employee = new Employee();

        try {
            System.out.println("Podaj imię pracownika: ");
            employee.setFirstName(sc.nextLine());
            System.out.println("Podaj nazwisko pracownika: ");
            employee.setLastName(sc.nextLine());
            System.out.println("Podaj pensje pracownika: ");
            BigDecimal salary = new BigDecimal(sc.nextLine());
            employee.setSalary(salary);
            company.addEmployee(employee);
        } catch (NumberFormatException e) {
            System.err.println("Niewłaściwe dane pracownika!");
        }

    }

    private static void findAndPrintemployee(Scanner sc) {
        System.out.println("Wyszukiwanie pracownika: ");
        System.out.println("Podaj imię: ");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastName = sc.nextLine();

        Employee employee = company.getEmployee(firstName, lastName);
        if (employee != null){
            System.out.println(employee);
        } else {
            System.out.println("Nie znaleziono pracownika! :(");
        }
    }




    private enum Option {
        EXIT(0, "Wyjdź z programu!"),
        ADD_EMPLOYEE(1, "Dodaj pracownika: "),
        SEARCH_EMPLOYEE(2, "Znajdź pracownika: ");


        private int value;
        private String description;

        Option(int value, String description) {
            this.value = value;
            this.description = description;
        }

        public static Option createFromInt(int option) {
            try {
                return Option.values()[option];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new IllegalArgumentException("Nie ma opcji o id: " + option);
            }
        }

        @Override
        public String toString() {
            return value + " - " + description;
        }
    }

    private static Option getOption(Scanner sc) {
        boolean optionOk = false;
        Option option = null;
        while (!optionOk) {

            try {
                option = Option.createFromInt(sc.nextInt());
                optionOk = true;
            } catch (InputMismatchException ignored) {
                System.err.println("Wprowadzono wartość, która nie jest liczbą, podaj ponownie:");
            }
        }
        return option;
    }
}
