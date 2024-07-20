/**
 * @author : ashis
 * @Date : 7/20/2024
 * @Time : 3:26 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Collections;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapClass {
    /**
     * 2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
     * - a. Insert a Key value mapping into the map
     * - b. Fetch the value of a Key
     * - c. Create a clone/copy of HashMap
     * - d. Check if the given Key is in the Map
     * - e. Check if the value is in the Map
     * - f. Check if the map is empty
     * - g. Print the size of the Map to the console
     * - h. Print all the Keys of the map to the console
     * - j. Remove a specific Key-value pair
     * - k. Copy all the elements of the Map to another Map
     */
    public static void main(String[] args) {
        HashMap<Integer, String> shm = new HashMap<>();
//                *-a.Insert a Key value mapping into the map
        shm.put(1001, "alex");
        shm.put(1002, "john");
        shm.put(1003, "catty");
        shm.put(1004, "june");
        shm.put(1005, "dolly");
        shm.put(1006, "noob");
        shm.put(1007, "elly");
        shm.put(1008, "sally");
        shm.put(1009, "om");
        shm.put(1010, "casul");
        System.out.println(shm);
//                * -b.Fetch the value of a Key
        System.out.println("value of : " + shm.get(1006));
//                * -c.Create a clone/copy of HashMap
        System.out.println("Cloned : " + shm.clone());
//                * -d.Check if the given Key is in the Map
        System.out.println("is key contain : " + shm.containsKey(1011));
//                * -e.Check if the value is in the Map
        System.out.println("does 'noob' value contain : " + shm.containsValue("noob"));
//                *-f.Check if the map is empty
        System.out.println("is hashmap is empty : " + shm.isEmpty());
//                *-g.Print the size of the Map to the console
        System.out.println("size of hashmap : " + shm.size());
//                *-h.Print all the Keys of the map to the console
        System.out.println("size of hashmap : " + shm.keySet());

//                * -j.Remove a specific Key - value pair
        System.out.println("remove the value of key 1001 : " + shm.remove(1001));
        System.out.println("after removing hashmap : " + shm);
//                * -k.Copy all the elements of the Map to another Map
        HashMap<Integer,String> newHashMap = new HashMap<>();
        newHashMap.putAll(shm);
        System.out.println("newHashMap element : " + newHashMap);
    }
}
