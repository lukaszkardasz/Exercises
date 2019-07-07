package exercises.org.files.files_exercises.person_files;

import java.io.*;
import java.util.Scanner;

/**
 * @author n2god on 06/07/2019
 * @project Exercises
 */
public class CompanyApp {

    public static final String FILE_STORE = "C:\\java\\Exercises\\src\\exercises\\org\\files\\files_exercises\\person_files\\Persons.txt";
    public static final int ENTER_FROM_USER = 1;
    public static final int ENTER_FROM_FILE = 2;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Company company = new Company();
        System.out.println("Podaj " + ENTER_FROM_USER + " jeśli chcesz wpisać dane (imie, nazwisko, pensja): ");
        System.out.println("Podaj " + ENTER_FROM_FILE + " jeśli chcesz wczytać dane z pliku (imie, nazwisko, pensja): ");

        int option = scanner.nextInt();

        if (option == ENTER_FROM_USER) {
            writeDataFromUser(company);
        } else if (option == ENTER_FROM_FILE) {
            writeDataFromFile(company);
        } else {
            throw new IllegalStateException("Nie ma takiej opcji!");
        }
        scanner.close();
    }

    private static void writeDataFromUser(Company company) {

        try (Scanner sc = new Scanner(System.in);
             ObjectOutputStream objectStream = new ObjectOutputStream(new FileOutputStream(FILE_STORE))) {
            for (int i = 0; i < Company.MAX_NUMBER_WORKERS; i++) {
                System.out.println("Podaj imię: ");
                String firstName = sc.nextLine();

                System.out.println("Podaj nazwisko: ");
                String lastName = sc.nextLine();

                System.out.println("Podaj stawkę: ");
                double salary = sc.nextDouble();
                sc.nextLine();

                company.add(new TableOfEmployees(firstName, lastName, salary), i);
            }

            objectStream.writeObject(company);
            System.out.println("Zapisano obiekt to pliku");
        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku: " + FILE_STORE);
            e.printStackTrace();
        }
    }

    private static void writeDataFromFile(Company company) {

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILE_STORE))) {

            company = (Company)input.readObject();

            for (int i = 0; i < Company.MAX_NUMBER_WORKERS; i++) {
                System.out.println(company.getTableEmployers()[i]);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Nie udało się odczytać pliku: " + FILE_STORE);
            e.printStackTrace();
        }
    }
}
