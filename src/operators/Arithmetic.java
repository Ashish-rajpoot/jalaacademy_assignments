package operators;

public class Arithmetic {

    /* Arithmetic operators are:
    +, -, *, %, /
     */

    void operator(){
        int a = 20;
        int b = 10;

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.printf("""
                addition = %s
                substraction = %s 
                multiplication = %s
                division = %s
                modulus (remainder) = %s 
                """,add,sub,mul,div,mod);
    }


    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.operator();
    }

}
