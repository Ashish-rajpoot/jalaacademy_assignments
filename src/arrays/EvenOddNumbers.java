/**
 * @author : ashis
 * @Date : 7/16/2024
 * @Time : 8:12 AM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package arrays;

public class EvenOddNumbers {
//    Write a method to find number of even number and odd numbers in an array
    public static void getEvenOrOdd(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0){
                System.out.printf("%s is even \n",arr[i]);
            }else {
                System.out.printf("%s is odd \n",arr[i]);
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,4,6};
        getEvenOrOdd(arr);
    }
}
