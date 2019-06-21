package ex.org.rot.rotate_array;


import java.util.*;


/**
 * @author n2god on 10/06/2019
 * @project org
 */
public class ArrayRotation {



    public static void main(String[] args){
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


        int[] rotatedArray = rotLeft(integers, rotateNumber);
        printArray(rotatedArray);

    }

    private static void printArray(int[] rotatedArray) {
        for (int i = 0; i < rotatedArray.length; i++) {
            System.out.print(rotatedArray[i] + " ");
        }
    }

    private static int[] rotLeft(int[] integers, int rotateNumber) {
        int[] rotatedArray = new int[integers.length];
        int rotations = rotateNumber % integers.length;
        int lenght = rotatedArray.length;
        rotatedArray = integers;
        leftRotate(rotatedArray, lenght, rotations);
        return rotatedArray;
    }

    private static void leftRotate(int[] rotateArray, int lenght, int rotations){
        for (int i = 0; i < lenght; i++)
            leftRotatebyOne(rotateArray, rotations);
    }

    private static void leftRotatebyOne(int[] rotateArray, int rotations) {
        int i;
        int temp;
        temp = rotateArray[0];
        for (i = 0; i < rotations - 1; i++) {
            rotateArray[i] = temp;
        }
    }

}
