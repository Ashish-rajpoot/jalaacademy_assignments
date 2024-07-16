/**
 * @author : ashis
 * @Date : 7/15/2024
 * @Time : 8:29 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateValues {
    public static void duplicatesValues(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j] ){
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,4,6};
        duplicatesValues(arr);
    }
}
