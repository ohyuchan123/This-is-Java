package Grammer.Collection_Framework.Queue_Collection;

import java.util.PriorityQueue;

public class PriorityExampel {
    public static void main(String[] args) {
        // PriorityQueue 생성
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 요소 추가
        pq.add(10);
        pq.add(20);
        pq.add(15);
        pq.add(5);

        // PriorityQueue의 요소 출력
        System.out.println("PriorityQueue elements: " + pq);

        // 요소 제거 및 우선순위 확인
        System.out.println("Poll element: " + pq.poll()); // 우선순위가 가장 높은 요소(가장 작은 값) 제거
        System.out.println("PriorityQueue elements after poll: " + pq);

        // 우선순위가 가장 높은 요소 확인 (제거하지 않음)
        System.out.println("Peek element: " + pq.peek());

        // PriorityQueue의 요소 출력
        System.out.println("Final PriorityQueue elements: " + pq);
    }
}
