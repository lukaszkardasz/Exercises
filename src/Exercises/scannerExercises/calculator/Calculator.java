package Exercises.scannerExercises.calculator;

/**
 * @author n2god on 09/06/2019
 * @project Exercises
 */
public class Calculator {

    public double calculate (double a, double b, String operator){
        double result = 0;
        Exercises.calculator.Calculator calculator = new Exercises.calculator.Calculator();
        switch (operator) {
            case "+":
                result = calculator.add(a,b);
                break;
            case "-":
                result = calculator.substract(a,b);
                break;
            case "*":
                result = calculator.multiply(a,b);
                break;
            case "/":
                if (b != 0){
                    result = calculator.divide(a,b);
                } else System.out.println("Sorka, nie dzielimy przez 0!");
                System.exit(1);
                break;
            default:
                System.out.println("Nie podales poprawnego operatora :(");
                System.exit(1);
                break;
        }
        return result;
    }


}
