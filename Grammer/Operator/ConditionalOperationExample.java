package Grammer.Operator;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        // 삼하 연산자
        // 삼항 연산자(피연산자 ? 피연산자 : 피연산자)는 총 3개의 피연산자를 가진다. ?앞의 피연산자에는
        // boolean 변수 또는 조건식이 오므로 조건 연산자라고도 합니다.
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은" + grade +"등급입니다.");
    }
}
