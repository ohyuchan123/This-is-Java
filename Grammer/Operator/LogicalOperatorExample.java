package Grammer.Operator;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        // 논리 연산자
        int charCode = 'A';
        //int charCode = 'a';

        // & or && 피연산자 모두가 true 일 경우에만 연산 결과가 true
        if((65<=charCode) & (charCode<=90)){
            System.out.println("대문자이군요");
        }

        if((97<charCode) && (charCode<=122)){
            System.out.println("소문자이군요");
        }

        int value = 6;
        //int value = 7;

        // | or || 피연산자 중 하나만 true이면 연산 결과는 true
        if( (value%2==0) | (value%3==0) ){
            System.out.println("2또는 3의 배수이군요");
        }

        boolean result = (value%2==0) | (value%3==0);
        if(!result){
            System.out.println("2 또는 3의 배수가 아니군요");
        }
    }
}
