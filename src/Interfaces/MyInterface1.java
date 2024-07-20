/**
 * @author : ashis
 * @Date : 7/17/2024
 * @Time : 7:12 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Interfaces;

public interface MyInterface1{
    void method1();
}
class InterfaceOneMethod implements MyInterface1{
    @Override
    public void method1() {
        System.out.println("Method form interface");
    }

    public static void main(String[] args) {
        InterfaceOneMethod interfaceOneMethod = new InterfaceOneMethod();
        interfaceOneMethod.method1();
    }
}
