/**
 * @author : ashis
 * @Date : 7/15/2024
 * @Time : 11:39 AM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package loops;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        8. Write a program to find Armstrong number or not.

        int number = 153;
        int sum = number;
        while (number > 0){
            int modulus = number % 10;
            int remainder = number / 10;
            number = remainder;

            sum = sum - (modulus * modulus * modulus);
        }
        if(sum == 0){
            System.out.println("ArmStrong Number");
        }
        else {
            System.out.println("No Armstrong Number");
        }
    }
}
