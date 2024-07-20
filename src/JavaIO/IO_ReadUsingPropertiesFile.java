/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 2:41 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class IO_ReadUsingPropertiesFile {
    public static void main(String[] args) {
        try(FileInputStream fos = new FileInputStream("src/JavaIO/PropertiesFile.txt")){
            Properties properties = new Properties();
            properties.load(fos);
            System.out.println(properties.getProperty("name"));
            System.out.println(properties.getProperty("class"));
            System.out.println(properties.getProperty("rollNo"));

            fos.close();
            System.out.println("#Data end...");
        }catch (IOException e){
            System.out.println("Error while reading data...");
        }
    }
}
