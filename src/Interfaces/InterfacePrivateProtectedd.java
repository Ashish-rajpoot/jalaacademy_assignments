/**
 * @author : ashis
 * @Date : 7/17/2024
 * @Time : 7:17 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Interfaces;


public interface InterfacePrivateProtectedd{
    public int val1 = 10;
    final int val2 = 20;
    static final int val3 = 30;
}
class InterfacePrivateProtected implements InterfacePrivateProtectedd {

    public static void main(String[] args) {
        InterfacePrivateProtected interfacePrivateProtected = new InterfacePrivateProtected();
        int val11 = interfacePrivateProtected.val1;
        System.out.println(val11);
    }
}
