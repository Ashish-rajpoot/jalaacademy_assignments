/**
 * @author : ashis
 * @Date : 7/16/2024
 * @Time : 10:35 AM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package arrays;

import java.util.Arrays;

public class RemoveDuplicateElements {
    public static int[] removeDuplicateElements(int[] arr) {
        boolean isZero = isZero(arr);
        System.out.println(isZero);
        int count = 0;
        int[] index = new int[arr.length];

        if (arr.length == 1)
            return arr;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = 0;
                    count++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            index[i] = arr[i];
        }

        for (int i = 0; i < index.length - 1; i++) {
            for (int j = i + 1; j < index.length; j++) {
                if (index[i] > index[j]) {
                    int temp = index[i];
                    index[i] = index[j];
                    index[j] = temp;
                }

            }
        }


        int zeroCount = 0;
        for (int i = 0; i < index.length; i++) {
            if (index[i] == 0) {
                zeroCount++;
            }
        }
        int[] result = new int[0];
        if (isZero) {
            result = new int[index.length - zeroCount + 1];
            for (int i = zeroCount -1 , k = 0; i < index.length; i++) {
                result[k++] = index[i];
            }
        }
        if (!isZero) {
            result = new int[index.length - zeroCount];
            for (int i = zeroCount, k = 0; i < index.length; i++) {
                result[k++] = index[i];
            }

        }
        return result;
    }

    public static boolean isZero(int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 4, 5, 5, 6,0,0,0,0,0,3,3,3,3,3,3,3,3,3,3,};
        System.out.println(Arrays.toString(removeDuplicateElements(arr)));

    }
}
