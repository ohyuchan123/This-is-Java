package Grammer.Operator;

public class CompareOperatorExample {
    public static void main(String[] args) {
        // 비교 연산자
        int num1 = 10;
        int num2 = 10;

        boolean result1 = (num1 == num2); // 두 피연산자가 값이 같은지 검사
        boolean result2 = (num1 != num2); // 두 피연산자의 값이 다른지 검사
        boolean result3 = (num1 <= num2); // 피연산자 num1이 작거나 같은지 검사

        System.out.println("result1 : "+result1);
        System.out.println("result2 : "+result2);
        System.out.println("result3 : "+result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2); // 65 < 66 피연산자 char1이 작은지 검사
        System.out.println("result4 : "+result4);

        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4);
        System.out.println("result5 : "+result5);

        float num5 = 0.1f;
        double num6 = 0.1;
        boolean result6 = (num5 == num6);
        boolean result7 = (num5 == (float)num6);
        System.out.println("resutl6 : "+result6);
        System.out.println("resutl7 : "+result7);

        // 문자열을 비교할 때는 동등(==, !=) 연산자 대신 equals()와 !equals()를 사용합니다.
        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = (str1.equals(str2));
        boolean result9 = (!str1.equals(str2));
        System.out.println("result8 : "+result8);
        System.out.println("result9 : "+result9);
    }
}
