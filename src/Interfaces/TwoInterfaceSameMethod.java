package Interfaces;

public interface TwoInterfaceSameMethod {
    void method();

}

interface SecondInterfacee {
    void method();
}

class TwoInterfaceSameMethodClass implements TwoInterfaceSameMethod, SecondInterfacee {

    @Override
    public void method() {
        System.out.println("Same method in both interface");
    }

    public static void main(String[] args) {
        TwoInterfaceSameMethod twoInterfaceSameMethod = new TwoInterfaceSameMethodClass();
        twoInterfaceSameMethod.method();
    }
}