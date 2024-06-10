package Grammer.Operator;

public class InfinityAndNanCheckExample {
    public static void main(String[] args) {
        // 나눗셈 연산 후 NaN(Not a Number) 과 Infinity(무한대)
        // 나눗셈(/) 또는 나머지(%) 연산에서 좌측 피연산자가 정수이고 우측 피연산자가 0일 경우 예외(ArithmeticException)가
        // 발생합니다. 무한대의 값을 정수로 표현 할 수 없기 때문입니다.

        // 하지만 좌측 피연산자가 실수이거나 우측 피연산자가 0.0 또는 0.0f 이면 예외가 발생하지 않고 연산의 결과는
        // Infinity(무한대) 또는 NaN(Not a Number)이 된다.
        int x = 5;
        double y = 0.0;
        double z = x/y;
//        double z = x%y;

        // 잘못된 코드
        System.out.println(z + 2);

        // 알맞은 코드
        if(Double.isInfinite(z) || Double.isNaN(z)){
            System.out.println("값 산출 불가");
        }else{
            System.out.println(z + 2);
        }
    }
}
