package operators;

public class Equal_NotEqual {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String aString = "10";
        String bString = "20";

        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(aString.equals(bString));
        System.out.println(!aString.equals(bString));
    }
}
