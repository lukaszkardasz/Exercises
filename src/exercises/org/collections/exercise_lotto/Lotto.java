package exercises.org.collections.exercise_lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author n2god on 18/07/2019
 * @project Exercises
 */
public class Lotto {
    public static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {

        generate(numbers);
        System.out.println(numbers);



    }

    private static void generate(List<Integer> numbers) {
        Random random = new Random();
        int low = 1;
        int high = 49;

        for (int i = 1; i < 49; i++) {
            int result = random.nextInt(high - low) + low;
            numbers.add(result);
        }
    }
}
