/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 2:16 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package JavaIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IO_WriteUsingOutputStream {
    public static void main(String[] args) {
        String txt = "Adding data using Output Stream";
        try(OutputStream os = new FileOutputStream("src/JavaIO/outputstream.txt")){
            os.write(txt.getBytes());
            os.close();
            System.out.println("Inserted...");
        }catch (IOException e){
            System.out.println("Error Occurred");
        }
    }
}
