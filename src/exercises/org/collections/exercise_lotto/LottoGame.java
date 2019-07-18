package exercises.org.collections.exercise_lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author n2god on 18/07/2019
 * @project Exercises
 */
public class LottoGame {
    public static void main(String[] args) {
        List<Integer> numbersFromUser = new ArrayList<>();
        enterData(numbersFromUser);
        Lotto lotto = new Lotto();
        lotto.randomize();
        int match = lotto.checkResult(numbersFromUser);
        System.out.println("Liczba trafień: " + match);
    }



    private static void enterData(List<Integer> numbersFromUser) {
        System.out.println("Podaj 6 cyfr: ");

        try (Scanner scanner = new Scanner(System.in)) {
            int count = 0;
            while (count < 6) {
                System.out.println("Podaj kolejną liczbę: ");
                numbersFromUser.add(scanner.nextInt());
                scanner.nextLine();
                count++;
            }
        }
    }
}