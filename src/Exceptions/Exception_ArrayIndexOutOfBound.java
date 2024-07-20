/**
 * @author : ashis
 * @Date : 7/18/2024
 * @Time : 4:51 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Exceptions;

public class Exception_ArrayIndexOutOfBound {
    public static void main(String[] args) {
       try {
           int n = 6;
           int[] arr = {1,2,3,4};
           for (int i = 0; i < n; i++) {
               System.out.println(arr[i]);
           }
       }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
           System.out.println("Array size is smaller then the for loop we are trying to loop");
       }
    }
}
