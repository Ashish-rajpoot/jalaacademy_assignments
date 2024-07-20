/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 12:26 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Exceptions;

public class Ex_MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            String age = "seventeen";
            int c = Integer.valueOf(age)/0;

        }catch (ArithmeticException e){
            System.out.println("Cannot be divisible by zero");
        }catch (NumberFormatException e){
            System.out.println("Cannot be cast to integer");
        }finally {
            System.out.println("Finally block");
        }
    }
}
