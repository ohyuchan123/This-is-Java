package Grammer.Condition;

public class IfNestedExample {
    public static void main(String[] args) {
        // 중첩 If
        int score = 95;
        if (score >= 90) {
            if (score >= 95) {
                System.out.println("A+");
            } else {
                System.out.println("A0");
            }
        }
    }
}
