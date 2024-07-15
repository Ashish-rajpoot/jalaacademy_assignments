package operators;

import java.util.Scanner;

public class LargerSmallerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first digit");
        int a = scanner.nextInt();
        System.out.println("Enter second digit");
        int b = scanner.nextInt();


        if(a > b){
            System.out.printf("%s is grater then %s",a , b);
        }else {
            System.out.printf("%s is smaller then %s",a , b);
        }

    }
}
