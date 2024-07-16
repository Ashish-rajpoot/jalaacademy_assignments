/**
 * @author : ashis
 * @Date : 7/15/2024
 * @Time : 7:37 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package arrays;

public class ContainsSpecificElements {
//    Write a method to verify if the array contains two specified elements(12,23)

    public static void containesElement(int a , int b){
        int[] arr = {2,3,4,5,6,7,8,9,10,11,12,13,14};
        boolean isA = false;
        boolean isB = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==a){
                isA = true;
            }else if(arr[i]==b){
                isB = true;
            }

        }

            System.out.printf(isA?"Value %s is present \n":"Value %s is not present \n",a);
            System.out.printf(isB?"Value %s is present \n":"Value %s is not present \n",b);

    }
    public static void main(String[] args) {
        containesElement(4,111);
    }
}
