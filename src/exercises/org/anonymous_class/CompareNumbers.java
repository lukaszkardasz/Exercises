package exercises.org.anonymous_class;

import java.util.Arrays;

/**
 * @author n2god on 01/07/2019
 * @project Exercises
 */
public class CompareNumbers {
    public static void main(String[] args) {
        BiggestNumber bn = new BiggestNumber() {
            @Override
            public int takeBiggest(int[] numbers) {
                if (numbers == null){
                    throw new NullPointerException("argument table cannot be null");
                }
                int arrayLenght = numbers.length;
                if (arrayLenght == 0){
                    throw new IllegalArgumentException("array has to have at least one number");
                }
                Arrays.sort(numbers,0, arrayLenght);
                return numbers[arrayLenght -1];
            }
        };

        int[] numbers = {5,10,-8,-23,1009,2938,153,54};
        System.out.println("Najwieksza liczba to: " + bn.takeBiggest(numbers));

    }
}
