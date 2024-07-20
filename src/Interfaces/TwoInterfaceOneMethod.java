package Interfaces;

public interface TwoInterfaceOneMethod {
    void firstInterfaceMethod();
}

interface SecondInterface{

    void secondInterfaceMethod();
}

class TwoInterfaceOneMethodClass implements TwoInterfaceOneMethod,SecondInterface{
    @Override
    public void firstInterfaceMethod() {
        System.out.println("First Interface method implementation");
    }

    @Override
    public void secondInterfaceMethod() {
        System.out.println("Second Interface method implementation");

    }

    public static void main(String[] args) {
        TwoInterfaceOneMethodClass twoInterfaceOneMethodClass = new TwoInterfaceOneMethodClass();
        twoInterfaceOneMethodClass.firstInterfaceMethod();
        twoInterfaceOneMethodClass.secondInterfaceMethod();
    }
}