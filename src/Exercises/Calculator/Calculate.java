package Exercises.Calculator;

public class Calculate {
    public static void main(String[] args) {
        double a = 5;
        double b = 2;

        Calculator calc = new Calculator();

        System.out.println("A + B =" + calc.add(a, b));
        System.out.println("A - B =" + calc.substract(a, b));
        System.out.println("A * B =" + calc.multiply(a, b));
        System.out.println("A / B =" + calc.divide(a, b));
    }

}
