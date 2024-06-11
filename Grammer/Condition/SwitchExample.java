package Grammer.Condition;

public class SwitchExample {
    public static void main(String[] args) {
        // switch 문
        // 괄호 안의 변수값에 따라 해당 case로 가서 실행문을 실행시킵니다.
        int num = (int)(Math.random()*6) + 1 ;

        switch (num){
            case 1:
                System.out.println("1번이 나왔습니다.");
                break; //Switch 문 종료
            case 2:
                System.out.println("2번이 나왔습니다.");
                break; //Switch 문 종료
            case 3:
                System.out.println("3번이 나왔습니다.");
                break; //Switch 문 종료
            case 4:
                System.out.println("4번이 나왔습니다.");
                break; //Switch 문 종료
            case 5:
                System.out.println("5번이 나왔습니다.");
                break; //Switch 문 종료
            case 6:
                System.out.println("6번이 나왔습니다.");
                break; //Switch 문 종료
        }
    }
}
