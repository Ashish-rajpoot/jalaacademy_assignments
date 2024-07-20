/**
 * @author : ashis
 * @Date : 7/16/2024
 * @Time : 9:34 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Strings;

public class StringClass {
    public static void main(String[] args) {
        // 1. Different ways creating a string
        String s1 = "Welcome to jala academy";

        String s2 = new String("String2");
        // 2. Concatenating two strings using + operator
        System.out.println(s1+ " "+ s2);

        // 3. Finding the length of the string
        System.out.printf("s1 length : %s \n", s1.length());

        // 4. Extract a string using Substring
        System.out.printf("Extrating from index 0 to 7 : %s\n",s1.substring(0,7));

        // 5. Searching in strings using indexOf()
        System.out.printf("indexOf 'jala' : %s\n", s1.indexOf("jala"));
        System.out.printf("indexOf 'l' from 5th index : %s\n", s1.indexOf("l",5));
        System.out.printf("indexOf 'l' from 0th index: %s\n", s1.indexOf("l",0));

        // 6. Matching a String Against a Regular Expression With matches()
        boolean isMatch = s1.matches("(.*)academy(.*)");
        System.out.println(isMatch);

        /* 7. Comparing strings using the methods equals(), equalsIgnoreCase(),
        startsWith(), endsWith() and compareTo()
        */
        System.out.println();
        System.out.println();
        String st1 = "Compare String";
        String st2 = "Compare String";
        System.out.println("st1.equals(st2) : " + st1.equals(st2));
        System.out.println("st1.equalsIgnoreCase(st2) : " + st1.equalsIgnoreCase(st2));
        System.out.println("st1 == st2 : " + (st1==st2));
        System.out.println("st1.startsWith('c') : " + st1.startsWith("c"));
        System.out.println("st1.startsWith('C') : " + st1.startsWith("C"));
        System.out.println("st1.endsWith('ing') : " + st1.endsWith("ing"));
        System.out.println("st1.compareTo(st2) : " + st1.compareTo(st2));


        // 9. Trimming strings with trim()
        String triming = "   Triming is Important   ";
        System.out.println(triming.trim());


        // 10. Replacing characters in strings with replace()
        System.out.println("Original String : " + s1);
        System.out.println("Replaced String : " + s1.replace("jala","jalaAcademy"));

        // 11. Splitting strings with split()
        String [] array = s1.split(" ");
        for(String s : array){
            System.out.println(s);
        }

        // 12. Converting Numbers to Strings with valueOf()
        int num = 10;
        System.out.println(String.valueOf(num));
        System.out.println(String.valueOf(num) instanceof String);


        // 13. Converting integer objects to Strings
        int num2 = 15;
        String num2Str = Integer.toString(num2);
        System.out.println(num2Str);

        // 14. Converting to uppercase and lowercase
        String text = " How Old Are You?";
        System.out.println(text.trim().toUpperCase());
        System.out.println(text.trim().toLowerCase());

    }
}
