/**
 * @author : ashis
 * @Date : 7/16/2024
 * @Time : 8:34 AM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinDifference {
//     * 16. Write a function to get the difference of largest and smallest value
public static void getDiffMinMax(int[] arr) {
    int max = arr[0];
    int min = arr[0];

    for (int i = 0; i < arr.length; i++) {
        if(min > arr[i])
            min = arr[i];
        if(max < arr[i])
            max = arr[i];
    }
    int differenceOfMaxMin = max - min;
    System.out.printf("Difference of Max value %s and min Value %s is = %s",max,min,differenceOfMaxMin);
}

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(arr));
        getDiffMinMax(arr);
    }
}
