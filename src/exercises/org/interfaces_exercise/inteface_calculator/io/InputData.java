package exercises.org.interfaces_exercise.inteface_calculator.io;

import exercises.org.interfaces_exercise.inteface_calculator.logic.Circle;
import exercises.org.interfaces_exercise.inteface_calculator.logic.Rectangle;
import exercises.org.interfaces_exercise.inteface_calculator.logic.Shape;
import exercises.org.interfaces_exercise.inteface_calculator.logic.Triangle;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputData {

    private Scanner scanner = new Scanner(System.in);

    public InputData(){
        scanner.useLocale(Locale.US);
    }

    public Circle readCircleData() throws InputMismatchException{
        System.out.println("Podaj informacje o kole: ");
        System.out.println("Podaj promień: ");
        double r = 0;
        try {
            r = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw e;
        }
        return new Circle(r);
    }

    public Rectangle readRectangleData() throws InputMismatchException{
        System.out.println("Podaj informacje o prostokącie: ");
        System.out.println("Podaj długość boku a: ");
        double a = 0;
        double b = 0;
        try {
            a = scanner.nextDouble();
            scanner.nextLine();
            b = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw e;
        }
        return new Rectangle(a, b);
    }

    public Triangle readTriangleData() throws InputMismatchException {
        System.out.println("Podaj informacje o trójkącie.");
        System.out.println("Podaj długość boku A: ");
        double a = 0;
        double b = 0;
        double c = 0;
        try {
            System.out.println("Podaj długość boku A: ");
            a = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Podaj długość boku B: ");
            b = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Podaj długość boku C: ");
            c = scanner.nextDouble();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw e;
        }

        return new Triangle(a, b, c);
    }

    public Shape createShape() throws NoSuchElementException, InputMismatchException{

        try {
            int shapeType = scanner.nextInt();
            scanner.nextLine();

            switch (shapeType){
                case Shape.CIRCLE:{
                    return readCircleData();
                }
                case Shape.RECTANGLE:{
                    return readRectangleData();
                }
                case Shape.TRIANGLE:{
                    return readTriangleData();
                } default:
                    throw new NoSuchElementException();
            }
        } catch (NoSuchElementException e) {
            scanner.nextLine();
            throw e;
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
