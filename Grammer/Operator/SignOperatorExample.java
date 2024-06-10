package Grammer.Operator;

public class SignOperatorExample {
    public static void main(String[] args) {
        //부호/증감 연산자
        // + : 피연산자의 부호 유지
        // - : 피연산자의 부호 변경

        /* 주의 할점
            byte b = 100;
            byte reuslt = -b; 컴파일 에러

            + 연산자는 잘 사용되지 않고 - 연산자는 변수값의 부호를 변경할 떄 사용됩니다.
             주의할 점은 부호 변경 후의 타입입니다.

             정수 타입 연산의 결과는 int 타입입니다. 부호를 변경하는 것도 연산이므로
             다음과 같이 int 타입 변수에 대입해야 합니다.
             👇
         */

        int x = -100;
        x = -x;
        System.out.println("x : "+x);

        int b = 100;
        int y = -b;
        System.out.println("y : "+y);

        /* 실행 결과
            x : 100
            y : -100
         */
    }
}
