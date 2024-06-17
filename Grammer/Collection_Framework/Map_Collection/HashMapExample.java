package Grammer.Collection_Framework.Map_Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("love", "사랑");
        hashMap.put("apple", "사과");
        hashMap.put("baby", "아기");

        hashMap.get("apple"); // "사과"

        // hashmap의 key값들을 set 집합으로 반환하고 순회
        for(String key : hashMap.keySet()) {
            System.out.println(key + " => " + hashMap.get(key));
        }
        /*
        love => 사랑
        apple => 사과
        baby => 아기
        */
    }
}
