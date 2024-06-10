package Grammer.Operator;

public class ArthemicOperatorExample {
    public static void main(String[] args) {
        // 산술 연산자
        /*
            - 피연산자가 정수 타입(byte, short, char, int)이면 연산의 결과는 int 타입이다.
            - 피연산자가 정수 타입이고, 그 중 하나가 long 타입이면 연산의 결과는 Long 타입이다.
            - 피연산자 중 하나가 실수 타입이면 연산의 결과는 실수 타입이다.
         */
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2; //모든 피연산자는 int 타입으로 자동 변환 후 연산
        System.out.println("result1 : "+result1);

        long result2 = v1 + v2 - v4; //모든 피연산자는 long 타입으로 자동 변환 후 연산
        System.out.println("result2 : "+result2);

        double result3 = (double) v1/v2; //double 타입으로 강제 변환 후 연산
        System.out.println("result3 : "+result3);

        int result4 = v1 % v2;
        System.out.println("result4 : "+result4);

    }
}
