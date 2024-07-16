/**
 * @author : ashis
 * @Date : 7/16/2024
 * @Time : 8:15 AM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindIndex {
//    Write a program to find the index of an array element.

    public static void getIndexOfElement(int[] arr, int element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                System.out.printf("Index of %s is = %s",element,i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to get it's index");
        int element = scanner.nextInt();
        scanner.close();
        getIndexOfElement(arr, element);
    }
}
