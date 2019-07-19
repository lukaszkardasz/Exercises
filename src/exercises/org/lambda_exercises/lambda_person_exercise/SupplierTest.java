package exercises.org.lambda_exercises.lambda_person_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * @author n2god on 19/07/2019
 * @project Exercises
 */
public class SupplierTest {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        Random r = new Random();

        generate(ints, 50, () -> r.nextInt(1000));

        for (int n : ints) {
            System.out.println(n);
        }
    }

    private static<T> void generate(List<T> list, int num, Supplier<T> sup) {
        for (int i = 0; i < num; i++) {
            list.add(sup.get());
        }
    }
}