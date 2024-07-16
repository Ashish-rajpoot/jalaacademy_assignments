/**
 * @author : ashis
 * @Date : 7/16/2024
 * @Time : 3:34 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package arrays;

import java.util.Arrays;

public class RemoveElementFromArray {
    public static int[] removeGivenElements(int[] arr,int j) {
        int[] index = new int[arr.length-1];

        if (arr.length == 1)
            return arr;

        for (int i = 0, k = 0; i < arr.length; i++) {
            if(i == j){
                continue;
            }
            index[k++] = arr[i];
        }
        System.out.println(Arrays.toString(index));
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 3, 4, 5, 5, 6, 0};
        System.out.println(Arrays.toString(removeGivenElements(arr,1)));
        ;
    }
}
