/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 2:13 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package JavaIO;

import java.io.FileWriter;
import java.io.IOException;

public class IO_WriteUsingFileWriter {
    public static void main(String[] args) {
        String txt = "Write data using the File Writer";
        try(FileWriter fileWriter = new FileWriter("src/JavaIO/filewriter.txt")){
            fileWriter.write(txt);
            fileWriter.close();
            System.out.println("inserted...");
        }catch (IOException e){
            System.out.println("Error Occured...");
        }
    }
}
