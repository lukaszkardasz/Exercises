package exercises.org.lambda_exercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author n2god on 19/07/2019
 * @project Exercises
 */
public class ExerciseWithAllFunctionalInterfaces {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();

        generateRandom(list, 10, () -> r.nextInt(1000));
        showLIst(list, p -> System.out.print(p + " "));
        filterByPredicate(list, p -> p % 2 == 0);
        System.out.println();
        System.out.println("Teraz bez parzystych");
        showLIst(list, p -> System.out.print(p + " "));
    }

    private static <T> void generateRandom(List<T> list, int num, Supplier<T> sup) {
        for (int i = 0; i < num; i++) {
            list.add(sup.get());
        }
    }

    private static <T> void showLIst(List<T> list, Consumer<T> con) {
        for (T t : list) {
            con.accept(t);
        }
    }

    private static <T> void filterByPredicate(List<T> list, Predicate<T> pre) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()){
            T next = it.next();
            if (pre.test(next)) {
                it.remove();
            }
        }
    }
}


