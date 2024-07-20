/**
 * @author : ashis
 * @Date : 7/18/2024
 * @Time : 12:32 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package ThisSuperAssignment;

class Parent {
    Parent() {
        System.out.println("Default method of Parent");
    }

    void parentMethod() {
        System.out.println("Method of Parent Class");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Default method of Class");
    }

    void childMethod() {
        System.out.println("Method of child Class");
    }
}

public class CallUsingSuper {

    public static void main(String[] args) {
        Child child = new Child();
//        child.childMethod();

    }
}
