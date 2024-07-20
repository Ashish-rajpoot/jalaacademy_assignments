/**
 * @author : ashis
 * @Date : 7/18/2024
 * @Time : 3:47 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Exceptions;

public class Exception_Arithemetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int i = a / b;
            System.out.println(i);
        }catch (ArithmeticException e){
            System.out.println(" 0 cannot be divisible");
          e.printStackTrace();
        }
    }
}
