/**
 * @author : ashis
 * @Date : 7/15/2024
 * @Time : 7:48 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package arrays;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;

public class ContainsSpecificValue {
//    Write a function to test if array contains a specific value
    public static AtomicBoolean isContaineValue(int a){
        int[] arr = {2,22,3,23,25,31,45,89};
        AtomicBoolean isA = new AtomicBoolean(false);
        IntStream.range(0,arr.length).forEach(value -> {
            if(arr[value]==a){
                isA.set(true);
            }
        });
        return isA;
    }

    public static void main(String[] args) {
        System.out.println(isContaineValue(450));
    }
}
