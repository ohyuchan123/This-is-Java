package Grammer.Collection_Framework.List_Collection;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // LinkedList 생성
        LinkedList<String> linkedList = new LinkedList<>();

        // 요소 추가
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");

        // 요소 출력
        System.out.println("LinkedList: " + linkedList);

        // 첫 번째 요소 가져오기
        String firstElement = linkedList.getFirst();
        System.out.println("첫 번째 요소: " + firstElement);

        // 마지막 요소 가져오기
        String lastElement = linkedList.getLast();
        System.out.println("마지막 요소: " + lastElement);

        // 특정 위치의 요소 가져오기
        String elementAtIndex = linkedList.get(2);
        System.out.println("인덱스 2의 요소: " + elementAtIndex);

        // 첫 번째 요소 삭제
        String removedFirstElement = linkedList.removeFirst();
        System.out.println("삭제된 첫 번째 요소: " + removedFirstElement);

        // 마지막 요소 삭제
        String removedLastElement = linkedList.removeLast();
        System.out.println("삭제된 마지막 요소: " + removedLastElement);

        // 특정 위치의 요소 삭제
        String removedElementAtIndex = linkedList.remove(1);
        System.out.println("인덱스 1에서 삭제된 요소: " + removedElementAtIndex);

        // 요소 출력
        System.out.println("Updated LinkedList: " + linkedList);

        // 요소의 존재 여부 확인
        boolean containsB = linkedList.contains("B");
        System.out.println("리스트에 B가 포함되어 있나요? " + containsB);

        // 리스트 크기 확인
        int size = linkedList.size();
        System.out.println("리스트의 크기: " + size);
    }
}
