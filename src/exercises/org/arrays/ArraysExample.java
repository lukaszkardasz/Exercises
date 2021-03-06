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

        System.out.println("PersonsGenerator: ");
        printArray(names);
        System.out.println();
        System.out.println();

        System.out.println("Numbers: ");
        printArray(numbers);
        System.out.println();
        System.out.println();

        //sortowanie
        System.out.println("Arrays.sort(names): ");
        Arrays.sort(numbers);
        printArray(numbers);
        System.out.println();

        Arrays.sort(names);
        printArray(names);
        System.out.println();
        System.out.println();

        //kopiowanie
        System.out.println("Numbers2, Arrays.copyOf():");
        Integer[] numbers2 = Arrays.copyOf(numbers, numbers.length);
        printArray(numbers2);
        String[] strings2 = Arrays.copyOf(names, names.length);
        printArray(strings2);
        System.out.println();
        System.out.println();

        //equals
        System.out.println("Arrays.equals(numbers, numbers2): ");
        System.out.println(Arrays.equals(numbers, numbers2));
        System.out.println();

        //fill
        System.out.println("Arrays.fill():");
        Arrays.fill(names, "Wacek");
        printArray(names);
    }

    private static <T> void printArray(T[] arr){
        for (T t : arr) {
            System.out.print(t + ", ");
        }
    }
}
