/**
 * @author : ashis
 * @Date : 7/18/2024
 * @Time : 1:26 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Constructors;

public class Parent_01 {

    int rollNo;
    String name;
    String branch;

    public Parent_01() {
        System.out.println("Parent Details");
    }

    public Parent_01(int rollNo){
        this.rollNo = rollNo;
    }

    public Parent_01(String name, String branch) {
        this.name = name;
        this.branch = branch;
        System.out.println("Name : " + this.name);
        System.out.println("Branch : " + this.branch);
    }

//    @Override
//    public String toString() {
//        return "Parent_01{" +
//                "rollNo=" + rollNo +
//                ", name='" + name + '\'' +
//                ", branch='" + branch + '\'' +
//                '}';
//    }

    public static void main(String[] args) {
        Parent_01 parent01 = new Parent_01();
        Parent_01 parent011 = new Parent_01(100001);
        Parent_01 parent012 = new Parent_01("alex","Mahoba");

        System.out.println(parent01);
        System.out.println(parent011);
        System.out.println(parent012);

    }
}
