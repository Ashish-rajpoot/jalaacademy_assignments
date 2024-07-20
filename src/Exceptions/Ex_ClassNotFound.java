/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 9:20 AM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Exceptions;

public class Ex_ClassNotFound {

    public static void main(String[] args) {
        try {
            Class.forName("com.exception.in");
            ClassLoader.getSystemClassLoader().loadClass("com.exception.in");
        } catch (ClassNotFoundException e) {
            System.out.println("No such class found : 'com.exception.in");
        }
    }
}
