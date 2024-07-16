/**
 * @author : ashis
 * @Date : 7/15/2024
 * @Time : 12:59 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddIntegerValues {
    //     * 1. Write a function to add integer values of an array
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number to add to the array followed by comma and type exit to close  ");
//        List<Integer> integerList = new ArrayList<>();
//        while (true) {
//            String input = scanner.nextLine();
//            if (input.equalsIgnoreCase("exit")) {
//                break;
//            }
//            try {
//                int integer  = Integer.parseInt(input);
//                integerList.add(integer);
//            } catch (NumberFormatException e) {
//                System.out.println("enter int value or type 'exit' to close");
//            }
//        }
//        System.out.println(integerList);
//        scanner.close();




        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];


        }
        System.out.println(sum);
    }




}
