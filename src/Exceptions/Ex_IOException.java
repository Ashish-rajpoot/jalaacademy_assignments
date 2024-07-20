/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 12:19 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex_IOException {
    public static void main(String[] args) {
        File file = new File("code.txt");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            fileInputStream.read();
            fileInputStream.close();
        }catch (IOException e){
            System.out.println("Error while reading the file");
            e.printStackTrace();
        }
    }
}
