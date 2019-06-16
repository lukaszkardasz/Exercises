package Exercises.StringBuilder;

import java.util.Scanner;

public class StringBuilderExercise {




    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe napisów: ");
        final int numberOfStrings = scanner.nextInt();
        scanner.nextLine();

        String[] table = new String[numberOfStrings];

        System.out.println("Podaj napisy: ");
        for (int i = 0; i < numberOfStrings; i++) {
            table[i] = scanner.nextLine();
        }
        scanner.close();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < table.length; i++) {
            int length = table[i].length();
            builder.append(table[i].charAt(length-1));
        }
        String result = builder.toString();

        System.out.println(result);

    }
}
