/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 2:48 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {
    /**
     * 1.Create an ArrayList of type String with 10 string elements. Add 10 string elements to
     * ArrayList and perform the below operations
     * - a. Add an element to the ArrayList
     * - b. Iterate through the ArrayList by using Iterator object
     * - c. Add an element at a specific index
     * - d. Remove an element from the ArrayList, Remove at an index
     * - e. Update the element at a specific index
     * - f. Check the element is present at a particular index
     * - g. Get an element at a particular index
     * - h. Find out the size of the ArrayList
     * - i. Check the given element is present in the ArrayList
     * - j. Remove all elements of the ArrayList
     */

//     * - a. Add an element to the ArrayList
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("ball");
        stringList.add("cat");
        stringList.add("dog");
        stringList.add("elephant");
        stringList.add("fish");
        stringList.add("goat");
        stringList.add("helicopter");
        stringList.add("ink");
        stringList.add("jet");
//     * - b. Iterate through the ArrayList by using Iterator object
        Iterator iterator = stringList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//     * - c. Add an element at a specific index
        stringList.add(3,"index 3");
        System.out.println(stringList);

//     * - d. Remove an element from the ArrayList, Remove at an index
        stringList.remove(0);
        System.out.println(stringList);

//     * - e. Update the element at a specific index
        stringList.set(2,"update at i = 2");
        System.out.println(stringList);

//     * - f. Check the element is present at a particular index
        System.out.println(stringList.get(1)=="apple");
        System.out.println(stringList.indexOf("apple"));

//     * - g. Get an element at a particular index
        System.out.println(stringList);
        System.out.println(stringList.indexOf(1));

//     * - h. Find out the size of the ArrayList
        System.out.println(stringList.size());

//     * - i. Check the given element is present in the ArrayList
        System.out.println(stringList.contains("apple"));

//     * - j. Remove all elements of the ArrayList
        System.out.println(stringList.removeAll(stringList));
        System.out.println(stringList);
    }
}
