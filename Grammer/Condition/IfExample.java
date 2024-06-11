package Grammer.Condition;

import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class IfExample {
    public static void main(String[] args) {
        // if 문 조건식 결과 따라 중괄호 {} 블록을 실행할지 여부 결정할 때 사용합니다.
        int score = 93;

        if(score > 90){
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        if(score < 90){
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }
    }
}
