/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 2:19 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package JavaIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class IO_WriteUsingPropertiesFile {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("src/JavaIO/PropertiesFile.txt")){
            Properties properties = new Properties();
            properties.put("name","alex");
            properties.put("class","12");
            properties.put("rollNo","10001");

            properties.store(fos,"Adding student data through Properties file");
            fos.close();
            System.out.println("Data Inserted...");
        }catch (IOException e){
            System.out.println("Error while inserting the data...");
        }
    }
}
