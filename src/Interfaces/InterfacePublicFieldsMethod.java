/**
 * @author : ashis
 * @Date : 7/17/2024
 * @Time : 9:04 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Interfaces;

public interface InterfacePublicFieldsMethod{
    int num = 112;
    public void method1();
}
class InterfacePublicFieldsMethodClass implements InterfacePublicFieldsMethod{
    @Override
    public void method1() {
        System.out.println("Method body");
    }

    public static void main(String[] args) {
        InterfacePublicFieldsMethodClass interfacePublicFieldsMethodClass = new InterfacePublicFieldsMethodClass();
        interfacePublicFieldsMethodClass.method1();
    }
}
