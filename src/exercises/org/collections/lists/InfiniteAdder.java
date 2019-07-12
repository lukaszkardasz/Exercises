package exercises.org.collections.lists;

import java.util.*;

/**
 * @author n2god on 12/07/2019
 * @project Exercises
 */
public class InfiniteAdder {

    public static void main(String[] args) {
        final String EXIT = "exit";
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new LinkedList<Integer>();
        String line = null;

        System.out.print("Podaj liczbę do dodania: ");
        while (!((line = scanner.nextLine()).equals(EXIT))) {
            System.out.print("Podaj kolejną liczbę (lub wpisz \"exit\"): ");
            try {
                numbers.add(Integer.parseInt(line));
            } catch(NumberFormatException e) {
                System.err.println("Nie podałeś cyfry!");
            }
        }

        sum(numbers);

        System.out.print("Wpisane liczby to: ");
        if (!numbers.isEmpty()) {
            for (Integer number : numbers) {
                System.out.print(number + ", ");
            }

            System.out.println();
            String letter = "a";
            int charValue = letter.charAt(0);

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < numbers.size(); i++) {
                sb.append((char) (charValue + i));
                sb.append(" + ");
            }
            sb.replace(sb.length() - 2, sb.length(), "= ");
            sb.append(sum(numbers));
            System.out.println(sb.toString());
        }
    }

    private static int sum(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }
}
