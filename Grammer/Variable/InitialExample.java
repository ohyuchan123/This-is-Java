package Grammer.Variable;

public class InitialExample {
    public static void main(String[] args) {
        // 변수 선언
        int value;

        // 연산 결과를 변수 result의 초기값으로 대입
        //int result = value + 10; //-> 오류가 발생하는 이유는 value를 초기화 하지 않았기 때문

        //이러면 다음과 같이오류가 발생하지 않는다.
        value = 10;
        int result = value + 10;

        //변수 result 값을 읽고 콘솔에 출력
        System.out.println(result);
    }
}
