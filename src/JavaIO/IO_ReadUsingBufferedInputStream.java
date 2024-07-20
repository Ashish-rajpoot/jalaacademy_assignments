/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 1:28 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package JavaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class IO_ReadUsingBufferedInputStream {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/JavaIO/BufferOutputStream.txt");
             BufferedInputStream br = new BufferedInputStream(fis)) {
            int i;
            String data = "";
            while ((i = br.read()) != -1) {
                data += String.valueOf((char) i);
            }
            System.out.println(data);
            br.close();
            fis.close();
            System.out.println("# data end");
        } catch (IOException e) {
            System.out.println("Error while reading the data");
        }
    }
}
