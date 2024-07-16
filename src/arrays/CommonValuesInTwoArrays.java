/**
 * @author : ashis
 * @Date : 7/15/2024
 * @Time : 7:15 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package arrays;

public class CommonValuesInTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {60, 70, 80, 90, 50};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    System.out.println(arr2[i]);
                }
            }

        }
    }

}
