package exercises.org.hackerrank.rotate_array;

import java.util.Scanner;

public class Solution {
    /*Function to left rotate arr[] of size n by d*/
    void leftRotate(int arr[], int d, int n)
    {
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }

    void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }

    /* utility function to print an array */
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Driver program to Solution above functions
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int arrayLenght = scanner.nextInt();
        int rotateNumber = scanner.nextInt();
        scanner.nextLine();
        String arrayString = scanner.nextLine();
        scanner.close();
        String[] integerStrings = arrayString.split(" ");
        int[] integers = new int[integerStrings.length];
        int length = arrayLenght;
        for (int i = 0; i < length; i++) {
            integers[i] = Integer.parseInt(integerStrings[i]);
        }



        Solution rotate = new Solution();
        int rotateNumberWithoutLoops = rotateNumber % length;
        rotate.leftRotate(integers, rotateNumberWithoutLoops, length);
        rotate.printArray(integers, length);
        rotate.getClass();
    }
}
