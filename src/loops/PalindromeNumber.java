/**
 * @author : ashis
 * @Date : 7/14/2024
 * @Time : 9:45 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package loops;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number to check is it palindrom");
        int num = scanner.nextInt();

        String numString = String.valueOf(num);
        boolean isPalindrom = false;
        for (int i = 0; i < numString.length() / 2; i++) {
            if ((numString.charAt(i) == numString.charAt(numString.length() - i - 1))) {
                isPalindrom = true;
            } else {
                isPalindrom = false;

                break;
            }
        }

        if (isPalindrom)
            System.out.println("This is a Palindrom");
        else
            System.out.println("Not a palindrom");
    }
}
