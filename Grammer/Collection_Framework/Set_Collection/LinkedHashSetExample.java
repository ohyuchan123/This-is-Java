package Grammer.Collection_Framework.Set_Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(10); // 중복된 수 추가

        System.out.println("Size: " + linkedHashSet.size()); // 3 - 중복된건 카운트 X
        System.out.println("Elements: " + linkedHashSet); // [10, 20, 30] - 대신 자료가 들어온 순서대로 출력
    }
}
