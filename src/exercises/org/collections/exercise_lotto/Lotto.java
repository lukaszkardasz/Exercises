package exercises.org.collections.exercise_lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author n2god on 18/07/2019
 * @project Exercises
 */
public class Lotto {
    private static List<Integer> numbers = new ArrayList<>();
    private static final int NO_OF_NUMBERS = 49;
    private static final int MAX_NUMBERS = 6;

    public static List<Integer> getNumbers() {
        return numbers;
    }

    public static void setNumbers(List<Integer> numbers) {
        Lotto.numbers = numbers;
    }

    Lotto(){
        generate();
    }

    private static void generate() {
        for (int i = 1; i < NO_OF_NUMBERS; i++) {
            numbers.add(i);
        }
    }

    void randomize() {
        Collections.shuffle(numbers);
    }

    int checkResult(List<Integer> numbersFromUser) {
        List<Integer> lottoResult = numbers.subList(0,MAX_NUMBERS);
        System.out.print("Wylosowane liczby to: ");
        for (Integer number : lottoResult) {
            System.out.print(number + " ");
        }
        System.out.println();

        int match = 0;
        for (int i = 0; i < MAX_NUMBERS; i++) {
            if (numbersFromUser.contains(numbers.get(i))){
                match++;
            }
        }
        return match;
    }
}
