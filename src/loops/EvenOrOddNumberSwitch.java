/**
 * @author : ashis
 * @Date : 7/14/2024
 * @Time : 6:19 PM
 * @Project Name : JalaAcademy_Java_Assignment
 * Program to check whether a number is EVEN or ODD using switch
 */
package loops;

import java.util.Scanner;

public class EvenOrOddNumberSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide a to check EVEN or ODD");
        int a = scanner.nextInt();

        switch (a%2){
            case 0:
                System.out.printf("Even");
                break;
            case 1:
                System.out.printf("Odd");
                break;
            default:
                System.out.printf("Cannot guess");
                break;
        }
    }
}
