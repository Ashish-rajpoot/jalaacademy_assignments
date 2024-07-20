/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 12:09 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Exceptions;

public class Ex_FinallyBlock {
    public static void main(String[] args) {
        try {
            int c = 10 /0;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("Final block always execute");
        }
    }
}
