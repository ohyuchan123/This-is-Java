package Grammer.Repetition;

public class PrintForm2To10Example {
    public static void main(String[] args) {
        //while 문
        // 처음 실행 될 때 1 조건식을 평가합니다. 평가 결과가 true이면 2실행문을 실행합니다.
        // 2 실행문이 모두 실행되면 조건식으로 되돌아가서 1 조건식을 다시 평가합니다.
        // 다시 조건식이 true 라면 2->1로 진행하고. false라면 while문을 종료합니다.
        int i = 1;
        while(i<=10/*조건식*/){
            /*실행문*/
            System.out.println(i + " ");
            i++;
        }
    }
}
