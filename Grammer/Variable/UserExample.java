package Grammer.Variable;

public class UserExample {
    public static void main(String[] args) {
        // 변수는 출력문이나 연산식에 사용되어 변수값을 활용한다.
        // 이번 예제는 문자열과 결합 후 출력하거나 연산식을 활용하는 예제이다.
        int hour = 3;
        int minute = 5;

        System.out.println(hour + "시간" + minute + "분");

        int totalMinute = (hour * 60) + minute;
        System.out.println("총 " + totalMinute + "분");
    }
}
