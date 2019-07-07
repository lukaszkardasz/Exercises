package exercises.org.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author n2god on 20/06/2019
 * @project org
 */
public class ExceptionsExerciseMultiEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[2];
        boolean error = true;

        do {
            try {
                System.out.println("Podaj pierwszą liczbę: ");
                numbers[0] = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Podaj drugą liczbę: ");
                numbers[1] = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Którą wartość wyświetlić? 1 czy 2?");
                System.out.println("Liczba: " + numbers[scanner.nextInt() - 1]);
                error = false;
            } catch (InputMismatchException e) {
                System.err.println("Nie podałeś poprawnej liczby, spróbuj jeszcze raz.");
            } catch (ArrayIndexOutOfBoundsException e){
                System.err.println("Niewłaściwy wybór, podaj 1 lub 2");
            } finally{
                scanner.nextLine();
            }
        } while (error);
        scanner.close();
    }

}
