package Grammer.Repetition;

public class PrintForm1To10Example {
    public static void main(String[] args) {
        // for문이 처음 실행될 때 1 초기화식이 가장 먼저 실행됩니다. 그럼 다음 2조건식을 평가해서 true이면
        // 3 실행문을 실행시키고, false 이면 for문을 종료하고 블록을 건너뜁니다.

        // 2조건식이 true가 되어 3 실행문을 모두 실행하면 4 증감식이 실행됩니다.

        for(int i=1 /*1*/; i<=10 /*2*/;i++ /*4*/){
            /*조건식이 true일 경우 3(실행문) 실행*/
            System.out.println(i + " ");
        }
    }
}
