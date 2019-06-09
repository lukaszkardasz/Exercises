package Exercises.loops.loopsExercise1;

import java.util.Scanner;

/**
 * @author n2god on 09/06/2019
 * @project Exercises
 */
public class loops1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile liczb chcesz wprowadzić?");
        int numbers = scanner.nextInt();
        int sum = 0;
        System.out.println("Podaj liczby do zsumowania: ");
        while (numbers-- > 0){
            System.out.println("Podaj kolejna liczbe: ");
            sum += scanner.nextInt();
        }
        scanner.close();
        System.out.println(sum);
    }

}
