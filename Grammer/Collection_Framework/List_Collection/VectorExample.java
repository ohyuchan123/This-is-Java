package Grammer.Collection_Framework.List_Collection;

import Concept.Design_patterns.builder.Board.Board;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Vector 컬렉션 생성
        List<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(20);

        System.out.println(vector.get(0));; // 10
    }
}
