/**
 * @author : ashis
 * @Date : 7/18/2024
 * @Time : 2:27 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Overloading;

public class MethodOverloading {
    /*
     *  * 01. Write two methods with the same name but different number of parameters of same type
     * and call the methods from main method
     *
     * 02. Write two methods with the same name but different number of parameters of different
     * data type and call the methods from main method
     *
     * 03. Write two methods with the same name and same number of parameters of same type
     * and call from main method
     *
     * 04. Write two methods with the same name and same number of parameters of different
     * type and call from main method
     *
     * 05. Write two methods with the same name, number of parameters and data type but
     * different return Type
     */

    void method1(int a){
        System.out.println(a + 10);
    }
    void method1(int a ,int b){
        System.out.println(a + b);
    }

    void method2(int a ){
        System.out.println( a);
    }

    void  method2 ( int age , String name){
        System.out.printf("age of %s is %d",name,age);
    }

    void method4(String name , boolean isOk){
        System.out.printf("name is %s and city is %s",name,isOk);
    }
    void method4(String clg , String branch){
        System.out.printf("collage %s and branch %s",clg,branch);
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.method1(1);
        methodOverloading.method1(1,2);
        methodOverloading.method2(11);
        methodOverloading.method2(12,"alex");
        methodOverloading.method4("java",true);
        methodOverloading.method4("sku","delhi");
    }
}
