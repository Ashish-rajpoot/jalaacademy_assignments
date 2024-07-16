/**
 * @author : ashis
 * @Date : 7/16/2024
 * @Time : 8:15 AM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAtSpecificPosition {
//    Write a program to find the index of an array element.

    public static void getIndexOfElement(int[] arr, int element, int index) {
        // Solution : 1
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                arr[index] = element;
            }
        }
        // Solution : 2
//        arr[index] = element;

        // Print
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to get it's index");
        int element = scanner.nextInt();
        System.out.println("Enter the index to insert");
        int index = scanner.nextInt();
        scanner.close();
        getIndexOfElement(arr, element, index);
    }
}
