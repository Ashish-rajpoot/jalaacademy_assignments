/**
 * @author : ashis
 * @Date : 7/17/2024
 * @Time : 1:13 AM
 * @Project Name : JalaAcademy_Java_Assignment
 * * 1. A, B and C are classes
 *  * 2. A is a super class. B is a subclass of A. C is a subclass of B.
 *  * 3. Create three methods in each class, 2 methods are specific to each class and third
 *  * method (override method) should be in all three Classes A, B and C
 *  * 4. Create a class with main method. Create an object for each class A, B and C in main
 *  * method and call every method of each class using its own object/instance.
 *  * 5. Call an overridden method with super class reference to B and C class’s objects
 *  * 6. Runtime Polymorphism with Data Members/Instance variables, Repeat the above
 *  * process only for data member
 *
 */
package Inheritance;


class A {
    int n = 11;
    void methodA1(){
        System.out.println("Method A1 from Class A");
    }
    void methodA2(){
        System.out.println("Method A2 from Class A");
    }
    void methodA3(){
        System.out.println("Method A3 from Class A");
    }
}

class B extends A{
    int n = 12;
    void methodB1(){
        System.out.println("Method B1 from Class B");
    }
    void methodB2(){
        System.out.println("Method B2 from Class B");
    }
    @Override
    void methodA3(){
        System.out.println("Method A3 from Class B");
    }
}

class C extends B {
    int n = 13;
    void methodC1(){
        System.out.println("Method C1 from Class C");
    }
    void methodC2(){
        System.out.println("Method C2 from Class C");
    }
    @Override
    void methodA3(){
        System.out.println("Method A3 from Class C");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        A a = new A();
        a.methodA1();
        a.methodA2();
        a.methodA3();

        B b = new B();
        b.methodB1();
        b.methodB2();
        b.methodA3();

        C c = new C();
        c.methodC1();
        c.methodC2();
        c.methodA3();

        A orm ;
        orm = new B();
        orm.methodA3();
        orm = new C();
        orm.methodA3();

        A rtp;
        rtp = new A();
        System.out.println(rtp.n);
        rtp = new B();
        System.out.println(rtp.n);
        rtp = new C();
        System.out.println(rtp.n);
    }
}
