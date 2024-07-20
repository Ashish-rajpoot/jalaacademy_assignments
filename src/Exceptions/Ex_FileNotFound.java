/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 12:06 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex_FileNotFound {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/invalid/file/location")));
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
