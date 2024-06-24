package Concept.Algorithms.Study.Greed;

public class MaxExample {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4, 2};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println("첫 번째로 큰 값: " + (first == Integer.MIN_VALUE ? "없음" : first));
        System.out.println("두 번째로 큰 값: " + (second == Integer.MIN_VALUE ? "없음" : second));
    }
}
