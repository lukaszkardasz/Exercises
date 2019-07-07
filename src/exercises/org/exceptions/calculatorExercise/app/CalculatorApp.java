package exercises.org.exceptions.calculatorExercise.app;

import exercises.org.exceptions.calculatorExercise.exceptions.UnknownOperatorException;
import exercises.org.exceptions.calculatorExercise.calculator.Calculator;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author n2god on 21/06/2019
 * @project org
 */
public class CalculatorApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.FRANCE);

        boolean readComplete = false;


        double a = 0;
        double b = 0;
        String operator = null;
        while (!readComplete) {
            try {
                System.out.println("Podaj pierwszą liczbę: ");
                a = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Podaj drugą liczbę: ");
                b = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Podaj operator + - * /");
                operator = scanner.nextLine();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.err.println("Wprowadzono niepoprawne dane, zacznij jeszcze raz");
                scanner.nextLine(); // pozwala na wprowadzenie danych jeszcze raz!!!!!!!!!!!!!!!!!!!
            }

        }
        Calculator calc = new Calculator();
        boolean calculateComplete = false;
        double result = 0;
        try {
            result = calc.calculate(a, b, operator);
            calculateComplete = true;

        } catch (ArithmeticException | UnknownOperatorException e) {
            System.err.println(e.getMessage());
        }

        if (calculateComplete){
            System.out.println(a + operator+ b + "=" + result);
        } else {
            System.out.println("Nie można było obliczyć wyrażenia: " + a + operator+ b);
        }
        scanner.close();
    }
}
