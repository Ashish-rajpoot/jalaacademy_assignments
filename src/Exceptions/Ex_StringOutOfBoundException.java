/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 1:24 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Exceptions;

public class Ex_StringOutOfBoundException {
    public static void main(String[] args) {
        String name = "alex";
        try {
            for (int i = 0; i < name.length()+1; i++) {
                System.out.println(name.charAt(i));
            }

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Your are accessing the string greater then it's length");
        }
    }
}
