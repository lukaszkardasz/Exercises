package ex.org.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author n2god on 20/06/2019
 * @project org
 */
public class ExceptionsExerciseOneEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int number = 0;
        boolean error = true;

        do {
            try {
                number = scanner.nextInt();
                error = false;
                System.out.println("Wczytano poprawną liczbę");
            } catch (InputMismatchException e) {
                System.err.println("Podano niewłaściwą wartość, spróbuj jeszcze raz.");
                scanner.nextLine();
            }
        } while (error);
        System.out.println("Podałeś: " + number);
        scanner.close();
    }

}
