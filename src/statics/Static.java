/**
 * @author : ashis
 * @Date : 7/16/2024
 * @Time : 9:00 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package statics;

public class Static {

    static int staticVariable1 = 1;
    static int staticVariable2 = 2;

    int instanceVariable1 = 3;
    int instanceVariable2 = 4;

    static void staticMethod1(){
        Static statics = new Static();
        System.out.println("Calling instance variable inside static method 1 " +statics.instanceVariable1);;
        statics.instanceMethod1();
        System.out.println("This is static method 1");
    }
    static void staticMethod2(){
        Static statics = new Static();
        System.out.println("Calling instance variable inside static method 2 " +statics.instanceVariable2);;
        statics.instanceMethod2();
        System.out.println("This is static method 2");
    }
    void instanceMethod1(){
        System.out.println("This is Non static method 1");
    }
    void instanceMethod2(){
        System.out.println("This is Non static method 2");
    }

    public static void main(String[] args) {
        Static statics = new Static();
        // calling static and instance variables
        System.out.println("Static Variable 1 value = " +staticVariable1);
        System.out.println("Static Variable 2 value = " +staticVariable2);
        System.out.println("instance Variable 1 value = " +statics.instanceVariable1);
        System.out.println("instance Variable 2 value = " +statics.instanceVariable2);

        // calling static and instance methods
        staticMethod1();
        staticMethod2();
        statics.instanceMethod1();
        statics.instanceMethod2();
    }
}
