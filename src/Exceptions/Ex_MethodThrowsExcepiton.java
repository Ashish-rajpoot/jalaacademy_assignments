/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 12:24 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Exceptions;

public class Ex_MethodThrowsExcepiton {

    static Exception throwException(){
        throw new RuntimeException("Method throws exception");
    }

    public static void main(String[] args) {
        throwException();
    }
}
