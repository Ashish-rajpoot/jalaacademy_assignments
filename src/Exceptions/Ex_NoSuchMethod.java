/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 1:10 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Exceptions;

import java.lang.reflect.Method;

public class Ex_NoSuchMethod {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("Exceptions.Ex_NoSuchMethod");
            Method m = c.getDeclaredMethod("myMethod");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");;
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found");;
        }
    }
}
