package Grammer.Variable.Local;

public class LocalVariableExample {
    public void calculateSum() {
        int num1 = 10; // 지역 변수 num1
        int num2 = 20; // 지역 변수 num2
        int sum = num1 + num2; // 지역 변수 sum
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        LocalVariableExample example = new LocalVariableExample();
        example.calculateSum();
    }
}
