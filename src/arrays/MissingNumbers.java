/**
 * @author : ashis
 * @Date : 7/16/2024
 * @Time : 8:34 AM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package arrays;

import java.util.Arrays;

public class MissingNumbers {
    //     * 16. Write a function to find the missing number of sorted array of 1 to 100
    public static void getDiffMinMax(int[] arr) {
       int found = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    found = arr[j];
                }
            }
            if(found != i){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println(Arrays.toString(arr));
        getDiffMinMax(arr);
    }
}
