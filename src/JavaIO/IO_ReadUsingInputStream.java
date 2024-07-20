/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 2:39 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package JavaIO;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class IO_ReadUsingInputStream {
    public static void main(String[] args) {
        try (InputStream is = new FileInputStream("src/JavaIO/outputstream.txt")) {
            int i;
            String data = "";
            while ((i = is.read()) != -1) {
                data += String.valueOf((char) i);
            }
            System.out.println(data);
            is.close();
            System.out.println("# data end");
        } catch (IOException e) {
            System.out.println("Error while reading the data");
        }
    }
}
