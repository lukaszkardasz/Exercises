package exercises.org.arrays;

import java.util.Arrays;

/**
 * @author n2god on 11/07/2019
 * @project Exercises
 */
public class ArraysExample {

    public static void main(String[] args) {
        String[] names = {"Basia", "Kasia", "Wojtek", "Agnieszka", "Kacper"};
        Integer[] numbers = {4, 7, 2, 1, 14, 23, 10, 5};

        System.out.println("Names: ");
        printArray(names);
        System.out.println();

        System.out.println("Numbers: ");
        printArray(numbers);
        System.out.println();

        //sortowanie
        Arrays.sort(numbers);
        printArray(numbers);
        System.out.println();

        Arrays.sort(names);
        printArray(names);
        System.out.println();




    }

    private static <T> void printArray(T[] arr){
        for (T t : arr) {
            System.out.print(t + ", ");
        }
    }
}
