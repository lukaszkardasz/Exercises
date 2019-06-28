package ex.org.interfaces_exercise.inteface_calculator.app;

import ex.org.interfaces_exercise.inteface_calculator.io.InputData;
import ex.org.interfaces_exercise.inteface_calculator.logic.Shape;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class CalculatorApp {

    public static void main(String[] args) {
        InputData enterData = new InputData();
        Shape shape = null;

        boolean readComplete = false;


        while (!readComplete) {
            try {
                printOptions();
                shape = enterData.createShape();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Niepoprawny format danych!");
            } catch (NoSuchElementException e) {
                System.out.println("Wybrany identyfikator kształtu jest niepoprawny, spróbuj ponownie");
            }
        }

        System.out.println(shape);

        enterData.closeScanner();


    }

    private static void printOptions() {
        System.out.println("Wybierz figurę dla której chcesz policzyć pole i obwód: ");
        System.out.println(Shape.CIRCLE + " dla koła");
        System.out.println(Shape.RECTANGLE + " dla prostokąta");
        System.out.println(Shape.TRIANGLE + " dla trójkąta");
    }
}
