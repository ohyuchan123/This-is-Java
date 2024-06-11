package Grammer.Repetition;

import java.util.Scanner;

public class DowhileExample {
    // do-while 문은 조건식에 의해 반복 실행한다는 점에서 while문과 동일합니다.
    // while문은 시작할 때부터 조건식을 평가하여 블록 내부를 실행할지 결정하지만 do-while은 실행 결과에 따라 계속할지 결정하는 경우입니다.
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 q를 입력하세요");

        Scanner scanner = new Scanner(System.in);
        String inputString;

        do{
            System.out.println(">");
            inputString = scanner.nextLine();
            System.out.println(inputString);
        }while(!inputString.equals("q"));

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
