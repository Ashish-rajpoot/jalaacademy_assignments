/**
 * @author : ashis
 * @Date : 7/16/2024
 * @Time : 4:34 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package arrays;

public class SecondLargestNumber {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9};
        int largest = arr[0];
        int secondLargetst = largest;
        for (int i = 1; i < arr.length; i++) {
            if(largest < arr[i]) {
                secondLargetst = largest;
                largest = arr[i];
            }
        }
        System.out.printf("Second Larget number is : %s ",secondLargetst);
    }
}
