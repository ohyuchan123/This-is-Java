package Grammer.Collection_Framework.Map_Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(10000000, "one");
        hashMap.put(20000000, "two");
        hashMap.put(30000000, "tree");
        hashMap.put(40000000, "four");
        hashMap.put(50000000, "five");

        for(Integer key : hashMap.keySet()) {
            System.out.println(key + " => " + hashMap.get(key)); // HashMap 정렬 안됨
        }

// ----------------------------------------------

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(10000000, "one");
        linkedHashMap.put(20000000, "two");
        linkedHashMap.put(30000000, "tree");
        linkedHashMap.put(40000000, "four");
        linkedHashMap.put(50000000, "five");

        for(Integer key : linkedHashMap.keySet()) {
            System.out.println(key + " => " + linkedHashMap.get(key)); // LinkedHashMap 정렬됨
        }
    }
}
