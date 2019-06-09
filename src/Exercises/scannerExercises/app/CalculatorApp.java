package Exercises.scannerExercises.app;

import Exercises.scannerExercises.calculator.Calculator;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author n2god on 09/06/2019
 * @project Exercises
 */
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.FRANCE);
        System.out.println("Podaj pierwszą liczbę: ");
        double a = scanner.nextDouble();
        scanner.nextLine(); // /n
        System.out.println("Podaj operator + - * /: ");
        String operator = scanner.nextLine();
        System.out.println("Podaj druga liczbę: ");
        double b = scanner.nextDouble();
        scanner.close();
        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, operator);
        System.out.println(a + operator+ b + "=" + result);
    }

}
