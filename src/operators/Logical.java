package operators;

public class Logical {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        /*
        Using & operator
         */
        System.out.println(a & b);
        System.out.println(b & a);
        System.out.println(a & a);
        System.out.println(b & b);

 /*
        Using | operator
         */
        System.out.println(a | b);
        System.out.println(b | a);
        System.out.println(a | a);
        System.out.println(b | b);

 /*
        Using ! with & and | operator
         */
        System.out.println(!a & b);
        System.out.println(a | !b);

    }
}
