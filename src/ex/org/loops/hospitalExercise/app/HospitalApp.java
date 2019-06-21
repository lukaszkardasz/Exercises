package ex.org.loops.hospitalExercise.app;

import ex.org.loops.hospitalExercise.logic.Hospital;
import ex.org.loops.hospitalExercise.model.Patient;

import java.util.Scanner;

/**
 * @author n2god on 09/06/2019
 * @project org
 */
public class HospitalApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option = -1;

        Hospital hospital = new Hospital();

        while (option != 0){
            System.out.println("Podaj opcję:  0 - wyjście z programu, 1 - dopisanie pacjenta, 2 - wyświetlenie listy zapisanych pacjentów");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 0:
                    System.out.println("wyjscie z programu");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Podaj dane nowego pacjenta: ");
                    Patient patient = new Patient();
                    System.out.println("Podaj imie: ");
                    patient.setFirstName(scanner.nextLine());
                    System.out.println("Podaj nazwisko: ");
                    patient.setLastName(scanner.nextLine());
                    System.out.println("Podaj pesel: ");
                    patient.setPesel(scanner.nextLine());
                    hospital.addPatient(patient);
                    break;
                case 2:
                    System.out.println("Wyświetl listę pacjentów: ");
                    hospital.printPatients();
                    break;
                default:
                    System.out.println("Niepoprawna opcja, spróbuj jeszcze raz");
                    break;
            }
        }
        scanner.close();
    }
}
