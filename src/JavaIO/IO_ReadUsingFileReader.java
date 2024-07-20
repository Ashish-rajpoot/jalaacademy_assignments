/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 2:38 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package JavaIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IO_ReadUsingFileReader {
    public static void main(String[] args) {
        try (FileReader fis = new FileReader("src/JavaIO/filewriter.txt")) {
            int i;
            String data = "";
            while ((i = fis.read()) != -1) {
                data += String.valueOf((char) i);
            }
            System.out.println(data);
            fis.close();
            System.out.println("# data end");
        } catch (IOException e) {
            System.out.println("Error while reading the data");
        }
    }
}
