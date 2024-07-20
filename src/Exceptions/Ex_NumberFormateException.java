/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 1:21 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Exceptions;

public class Ex_NumberFormateException {
    public static void main(String[] args) {
        String age = "seventeen";
        try {
            int intAge = Integer.parseInt(age);
        }catch (NumberFormatException e){
            System.out.println("Please provide the age in integer");
        }
    }
}
