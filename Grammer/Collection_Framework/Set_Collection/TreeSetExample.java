package Grammer.Collection_Framework.Set_Collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(7);
        treeSet.add(4);
        treeSet.add(9);
        treeSet.add(1);
        treeSet.add(5);

        System.out.println(treeSet.toString()); // [1, 4, 5, 7, 9] - 자료가 알아서 정렬됨
    }
}
