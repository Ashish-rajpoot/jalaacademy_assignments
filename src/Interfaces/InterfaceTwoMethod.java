package Interfaces;

public interface InterfaceTwoMethod {
    void method1();
    void method2();
}

class TwoMethod implements  InterfaceTwoMethod{

    public static void main(String[] args) {
    TwoMethod twoMethod = new TwoMethod();
    twoMethod.method1();
    twoMethod.method2();
    }

    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");

    }
}
