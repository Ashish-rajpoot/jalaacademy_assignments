/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 1:55 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package JavaIO;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IO_WriteUsingBufferedOutputStream {
    public static void main(String[] args) {
        String data = "Data inseted using the Buffer Output Stream";
        try (FileOutputStream fos = new FileOutputStream("src/JavaIO/BufferOutputStream.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            byte[] dataBytes = data.getBytes();
            bos.write(dataBytes);
            bos.close();
            fos.close();
            System.out.println("Data addedd successfully");
        } catch (IOException e) {
            System.out.println("Error occur while writing the file");
        }
    }
}
