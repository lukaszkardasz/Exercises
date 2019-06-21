package ex.org.exceptions.calculatorExercise.calculator;

import ex.org.exceptions.calculatorExercise.exceptions.UnknownOperatorException;
import ex.org.exceptions.calculatorExercise.logic.Calculate;

/**
 * @author n2god on 21/06/2019
 * @project org
 */
public class Calculator {
    public static final String PLUS = "+";
    public static final String MINUS = "-";
    public static final String MULTIPLY = "*";
    public static final String DIVIDE = "/";


    public double calculate(double a, double b, String operator) throws UnknownOperatorException {
        double result = 0;
        Calculate calculate = new Calculate();

        switch (operator) {
            case PLUS:
                result = calculate.add(a, b);
                break;
            case MINUS:
                result = calculate.substract(a, b);
                break;
            case MULTIPLY:
                result = calculate.multiply(a, b);
                break;
            case DIVIDE:
                if (b == 0) {
                    throw new IllegalArgumentException("Nie dzielimy przez zero!");
                } else {
                    result = calculate.divide(a, b);
                    break;
                }
            default:
                throw new UnknownOperatorException("Nieznany operator arytmetyczny!");
        }


        return result;
    }


}
