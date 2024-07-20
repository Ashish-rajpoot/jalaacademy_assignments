/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 2:10 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package JavaIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IO_WriteUsingBufferWriter {
    public static void main(String[] args) {
        String txt = "Insert data by using the buffer writer";
        try(FileWriter fw = new FileWriter("src/JavaIO/bufferWriter.txt");
            BufferedWriter bw = new BufferedWriter(fw)){
            bw.write(txt);
            bw.close();
            fw.close();
            System.out.println("Inserted...");
        }catch (IOException e){
            System.out.println("Error occur while adding the data");
        }
    }
}
