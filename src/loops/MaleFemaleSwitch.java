/**
 * @author : ashis
 * @Date : 7/14/2024
 * @Time : 6:35 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package loops;

import java.util.Scanner;

public class MaleFemaleSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("Enter 'M' Male and 'F' Female");
        char input = scanner.nextLine().toLowerCase().substring(0).toCharArray()[0];

        switch (input){
            case 'm':
                System.out.println("Your are Male");
                break;
            case 'f':
                System.out.println("Your are Female");
                break;
            default:
                System.out.println("Undefined Gender");
                break;
        }
    }
}
