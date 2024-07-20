/**
 * @author : ashis
 * @Date : 7/17/2024
 * @Time : 7:09 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Interfaces;

public interface MyInterface {
    default void defaultMethod() {
        System.out.println("This is the default method in the interface.");
    }
}

class InterfaceDefaultMethod implements MyInterface {

    public static void main(String[] args) {
        InterfaceDefaultMethod obj = new InterfaceDefaultMethod();
        obj.defaultMethod(); // Call the default method from the interface
    }
}
