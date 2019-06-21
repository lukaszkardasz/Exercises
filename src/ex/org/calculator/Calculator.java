package ex.org.calculator;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double add(double a, double b, double c) {
        return (a + b) + c;
    }

    public double substract(double a, double b) {
        return a - b;
    }

    public double substract(double a, double b, double c) {
        return (a - b) - c;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else return 0;
    }
}
