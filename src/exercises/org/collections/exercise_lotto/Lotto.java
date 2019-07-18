package exercises.org.collections.exercise_lotto;

import java.util.*;

/**
 * @author n2god on 18/07/2019
 * @project Exercises
 */
public class Lotto {
    public static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {

        generate(numbers);
        numbers = numbers.subList(0, 6);
        randomize(numbers);
        System.out.println(numbers);
        List<Integer> listFromUser = enterData();
        checkResult(listFromUser);

    }

    private static void checkResult(List<Integer> numbersFromUser) {
        int match = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbersFromUser.contains(numbers.get(i))){
                match++;
            }
        }
        System.out.println("Trafień: " + match);
    }

    private static List<Integer> enterData() {
        System.out.println("Podaj 6 cyfr: ");
        List<Integer> numbersListFromUser = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            int count = 0;
            while (count < 6) {
                System.out.println("Podaj kolejną liczbę: ");
                numbersListFromUser.add(scanner.nextInt());
                scanner.nextLine();
                count++;
            }
            return numbersListFromUser;
        }
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

    private static void randomize(List<Integer> randomNumbers) {
        Collections.shuffle(randomNumbers);
    }
}
