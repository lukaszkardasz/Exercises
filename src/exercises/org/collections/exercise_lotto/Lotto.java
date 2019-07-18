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
        List<Integer> randomNumbers = numbers.subList(0, 6);
        randomize(randomNumbers);
        checkResult(numbers);

        enterData();


        System.out.println(randomNumbers);




    }

    private static void checkResult(List<Integer> numbers){

    }

    private static List<Integer> enterData() {
        System.out.println("Podaj 6 cyfr: ");
        List<Integer> numbersListFromUser = new ArrayList<>();
        int count = 0;
        while (count <= 6){
            try(Scanner scanner = new Scanner(System.in)){
                int fromUser = Integer.parseInt(scanner.nextLine());
                numbersListFromUser.add(fromUser);
            } catch (NumberFormatException e){
                System.err.println("Niewłaściwe dane wejściowe, spróbuj jeszcze raz!");
                continue;
            }
            count++;
        }
        return numbersListFromUser;
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
