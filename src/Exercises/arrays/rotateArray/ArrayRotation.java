package Exercises.arrays.rotateArray;

import java.io.*;

import java.util.*;


/**
 * @author n2god on 10/06/2019
 * @project Exercises
 */
public class ArrayRotation {


    // Complete the rotLeft function below.
    static int[] rotLeft(int[] integers, int rotateNumber) {
        int[] rotatedArray = new int[integers.length];



        return rotatedArray;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int rotateNumber = scanner.nextInt();
        scanner.nextLine();
        String arrayString = scanner.nextLine();
        scanner.close();
        String[] integerStrings = arrayString.split(" ");
        int[] integers = new int[integerStrings.length];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.parseInt(integerStrings[i]);
        }
    }
}
