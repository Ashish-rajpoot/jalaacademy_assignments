package Interfaces;

public interface InheritedInterface {
    void printMessage();
    void displayNumber(int number);
}

class ImplementingClass implements InheritedInterface {

    @Override
    public void printMessage() {
        System.out.println("Hello from InheritedInterface!");
    }

    @Override
    public void displayNumber(int number) {
        System.out.println("The number is: " + number);
    }

    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.printMessage();
        obj.displayNumber(42);
    }
}
