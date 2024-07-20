/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 2:24 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package JavaIO;

import java.io.*;

public class IO_ReadUsingBufferRead {
    public static void main(String[] args) {
        try (FileReader fis = new FileReader("src/JavaIO/bufferWriter.txt");
             BufferedReader br = new BufferedReader(fis)) {
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
