/**
 * @author : ashis
 * @Date : 7/16/2024
 * @Time : 4:28 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 2,4,6,8,10};
        System.out.printf("Original Array : %s \n", Arrays.toString(arr));
        int[] reversedArr = new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            reversedArr[(arr.length-1) -i] = arr[i];
        }
        System.out.printf("Reversed Array : %s", Arrays.toString(reversedArr));

    }
}
