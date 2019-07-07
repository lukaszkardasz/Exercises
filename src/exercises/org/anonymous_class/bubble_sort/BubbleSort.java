package exercises.org.anonymous_class.bubble_sort;

import java.util.Arrays;

/**
 * @author n2god on 01/07/2019
 * @project Exercises
 */
public class BubbleSort {
    public static void main(String[] args) {

        Sortable s = new Sortable() {
            @Override
            public int[] sort(int[] numbers) {
                int temp = 0;
                for (int i = 0; i < numbers.length; i++) {
                    System.out.println("*");
                    for (int j = 1; j < numbers.length - i; j++) {
                        System.out.println(numbers[j - 1] + ">" + numbers[j] + " " + (numbers[j - 1] > numbers[j]));
                        if (numbers[j-1] < numbers[j]) { //change > to < to change asc to desc
                            temp = numbers[j];
                            numbers[j] = numbers[j - 1];
                            numbers[j - 1] = temp;
                        }
                    }
                }
                return numbers;
            }
        };
        int[] numbers = {12, -233, 4, -1, 99, 17, 5, 2565, 1110};
        System.out.println("Posortowane liczby: " + Arrays.toString(s.sort(numbers)));
    }
}
