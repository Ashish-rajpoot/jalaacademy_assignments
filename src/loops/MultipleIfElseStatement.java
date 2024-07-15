/**
 * @author : ashis
 * @Date : 7/14/2024
 * @Time : 6:49 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package loops;

import java.util.Scanner;

public class MultipleIfElseStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int result = scanner.nextInt();
        int input = result % 24;
        System.out.println(input);
       if(input < 12 ){
           System.out.printf("Good Morning");
       }else if(input < 17) {
           System.out.printf("Good AfterNoon");
       }else if(input < 20){
           System.out.printf("Good Evening");
       } else if (input < 24) {
           System.out.printf("Good night");
       }else {
           System.out.printf("Good Morning");
       }
    }
}
