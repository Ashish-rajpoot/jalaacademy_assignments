/**
 * @author : ashis
 * @Date : 7/18/2024
 * @Time : 1:52 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Constructors;

public class Child_01 extends Parent_01{
    String clg;
    String city;

    Child_01(){
        super();
        System.out.println("Child details");
    }
    Child_01(int rollno){
        super(rollno);
    }

    Child_01(String name,String branch,String clg, String city){
        super(name,branch);
        this.clg = clg;
        this.city = city;
        System.out.println("Collage : " + this.clg);
        System.out.println("City : " + this.city);
    }


    public static void main(String[] args) {
        Child_01 child01 = new Child_01();
        Child_01 child011 = new Child_01(20001);
        Child_01 child012 = new Child_01("rahul","grugram","sku","delhi");
    }
}
