package loops;

import java.util.ArrayList;
import java.util.List;

public class EvenAndOddNumbers {
/*
 * 4. Write a program to print the odd and even numbers.
 */
    public static void main(String[] args) {
        List<Integer> evenNumebr = new ArrayList<>();
        List<Integer> oddNumebr = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            if(i % 2 == 0){
                evenNumebr.add(i);
            }else {
                oddNumebr.add(i);
            }
        }

                System.out.printf("even = %s \n",evenNumebr);
                System.out.printf("odd = %s \n",oddNumebr);

    }

}
