package exercises.org.arrays.exercise_compare;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author n2god on 11/07/2019
 * @project Exercises
 */
public class NumbersTester {

    public static void main(String[] args) {

        Integer[] numbers = { 1, 5, 10, 19, 102, 43, 25, 36, 31, 99,
                9, 77, 7, 66, 6, 55, 44, 33, 1098, 1111 };

        System.out.println("Nieposortowana: ");
        System.out.println(Arrays.toString(numbers));

        System.out.println("Sortowanie rosnące: ");
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return - (i1.compareTo(i2));
            }
        });
        System.out.println(Arrays.toString(numbers));

        System.out.println("Sortowanie malejące: ");
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));




    }
}
