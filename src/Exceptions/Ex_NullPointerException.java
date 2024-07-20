/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 1:19 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Exceptions;

public class Ex_NullPointerException {

    static void method(String name){
        System.out.println(name.length());
    }
    public static void main(String[] args) {
        String name = null;
        try {
            method(name);
        }catch (NullPointerException e){
            System.out.println("Name is null,Please provide the name to calculate it's length");
        }
    }
}
