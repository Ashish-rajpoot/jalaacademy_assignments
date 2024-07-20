/**
 * @author : ashis
 * @Date : 7/18/2024
 * @Time : 2:12 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Constructors;

public class PublicPrivateProtectedDefault {
    int rollNo;
    String name;
    String clg;
    String city;

    {System.out.println("Student Deatils");}

    PublicPrivateProtectedDefault(){
        this(11);
    }

    public PublicPrivateProtectedDefault(int rollNo){
        this("shran");
        this.rollNo = rollNo;
        System.out.println("rollNo : " + rollNo);
    }

    private PublicPrivateProtectedDefault(String name){
        this("sku","grugram");
        this.name = name;
        System.out.println("name : "+ name);
    }

    protected PublicPrivateProtectedDefault(String clg,String city){
        this.clg = clg;
        this.city = city;
        System.out.println("Collage : " + clg);
        System.out.println("City : " + city);
    }

    public static void main(String[] args) {
        PublicPrivateProtectedDefault publicPrivateProtectedDefault = new PublicPrivateProtectedDefault();
    }
}
