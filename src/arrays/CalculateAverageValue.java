/**
 * @author : ashis
 * @Date : 7/15/2024
 * @Time : 6:29 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package arrays;

import java.util.List;

public class CalculateAverageValue {
//        * 2. Write a function to calculate the average value of an array of integers

    public static int calAvgAge() {
        List<Integer> arrAge = List.of(10, 20, 30, 40, 50);
        int sum = 0;
        for (int i = 0; i < arrAge.size(); i++) {
            sum = sum + arrAge.get(i);
        }

        int avgAge = sum / arrAge.size();
        return avgAge;
    }

    public static void main(String[] args) {

    int result =  calAvgAge();
        System.out.printf("average age = %s", result);
    }
}
