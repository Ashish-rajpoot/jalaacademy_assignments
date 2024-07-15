package basics;

public class CreatingClassObjectMethod {

    public int number;
    public static String name;

    public void method1() {

    }

    public String method2() {
        return "";
    }

    public int method3() {
        return 0;
    }

    public static void main(String[] args) {
        CreatingClassObjectMethod creatingClassObjectMethod = new CreatingClassObjectMethod();
        creatingClassObjectMethod.method1();
        creatingClassObjectMethod.method2();
        creatingClassObjectMethod.method3();
    }
}
