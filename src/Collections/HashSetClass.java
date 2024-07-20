/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 4:20 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Collections;

import java.util.*;

public class HashSetClass {
    public static void main(String[] args) {

        //a. adding elements to the ArrayList using add method using add() method
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("apple");
        stringHashSet.add("ball");
        stringHashSet.add("cat");
        stringHashSet.add("dog");
        stringHashSet.add("elephant");
        stringHashSet.add("fish");
        stringHashSet.add("goat");
        stringHashSet.add("helicopter");
        stringHashSet.add("ink");
        stringHashSet.add("jet");

        //does not allow duplicate elements, Set contains unique elements only.
        stringHashSet.add("jet");
        //HashSet doesn't maintain the insertion order
        System.out.println("StringList : " + stringHashSet);

        //b. Iterating through the HashSet by using Iterator object
        Iterator<String> iterator = stringHashSet.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
        }
        //c. Create a clone/copy of HashSet using clone() method
        System.out.println("cloned hashset : " + stringHashSet.clone());

        //c. Removing a specific element using remove() method
        System.out.println("Befor removing stringHashset : " + stringHashSet);
        System.out.println( stringHashSet.remove("dog"));
        System.out.println("After removing 'dog' form stringHashset : " + stringHashSet);

        //f. Checking if the set is empty using isEmpty() method
        System.out.println(stringHashSet.isEmpty());

        //h. Finding the size of the HashSet using size() method
        System.out.println(stringHashSet.size());

        //d. Checking if element is present in the HashSet using contains() method
        System.out.println("stringHashset : " + stringHashSet);
        System.out.println(stringHashSet.contains("dog"));

        //j. Removing all elements of the HashSet using clear() method
        System.out.println(stringHashSet.removeAll(stringHashSet));

    }
}
