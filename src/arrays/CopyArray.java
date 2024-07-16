/**
 * @author : ashis
 * @Date : 7/15/2024
 * @Time : 8:17 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CopyArray {
//    Write a function to copy an array to another array
    public static int[] copy(int[] arr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the digit to store in Array");
        List<Integer> integerList = new ArrayList<>();
        while (true){
        String input = scanner.nextLine().toLowerCase();
            if(input.equalsIgnoreCase("exit")){
                break;
            }
            try {
                int inputInt = Integer.parseInt(input);
                integerList.add(inputInt);
            }catch (NumberFormatException e){
                System.out.println("Only number are allowed or type 'exit' to close");
            }
        }

        List<Integer> copiedList = List.copyOf(integerList);
        System.out.println(copiedList);

        int[] copiesArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copiesArr[i] = arr[i];
        }
        return copiesArr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(copy(arr)));
    }
}
