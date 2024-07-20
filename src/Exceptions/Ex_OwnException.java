/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 9:29 AM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Exceptions;



class OwnException extends Exception{
    OwnException(String e){
        super(e);
    }
}
public class Ex_OwnException {
    public static void main(String[] args) throws OwnException {
        boolean x = false;
       if(x == false){
           throw new OwnException("This is custom own excepiton");
       }else {
           System.out.println(true);
       }
    }
}
