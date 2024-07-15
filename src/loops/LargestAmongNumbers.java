/**
 * @author : ashis
 * @Date : 7/14/2024
 * @Time : 6:26 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package loops;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LargestAmongNumbers {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(12,13,14,15,16,23,20,100,232);
            int highest = integerList.get(0);

        for (int i = 1 ; i < integerList.size(); i++) {
            int indexValue = integerList.get(i);
            if(highest < indexValue){
                highest = indexValue;
            }
        }
        System.out.printf("highest value through (for loop) = %s \n",highest);

        int max = integerList.stream().max(Comparator.comparingInt(Integer::intValue)).get();
        System.out.printf("highest value through (stream API) = %s \n",max);
    }
}
