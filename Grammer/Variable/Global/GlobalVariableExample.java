package Grammer.Variable.Global;

public class GlobalVariableExample {
    private int count = 0; // 전역 변수 count

    public void increment() {
        count++; // 전역 변수 count 사용
    }

    public void displayCount() {
        System.out.println("Count: " + count); // 전역 변수 count 사용
    }

    public static void main(String[] args) {
        GlobalVariableExample example = new GlobalVariableExample();
        example.increment();
        example.displayCount(); // 출력: Count: 1
    }
}
