package loops;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers10_100 {
    /*
     * 4. Write a program to print the odd and even numbers.
     */
    public static void main(String[] args) {
        List<Integer> evenNumebr = new ArrayList<>();
        int from = 10;
        int to = 100;
        for (int i = from; i <= to; i++) {
            if (i % 2 == 0) {
                evenNumebr.add(i);
            }
        }

        System.out.printf("even = %s \n", evenNumebr);

    }

}
