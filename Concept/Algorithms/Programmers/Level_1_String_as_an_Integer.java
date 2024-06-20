package Concept.Algorithms.Programmers;

class Solution_1{
    public int solution(String s) {
        // String과 같은 객체 타입은 강제 타입 변환으로 변경이 불가능하다.
        // 그렇기 때문에 이와 같이 Integer.parseInt()와 같은 메소드로 변경해야 합니다.
        int answer = Integer.parseInt(s);
        return answer;
    }
}

public class Level_1_String_as_an_Integer {
    public static void main(String[] args) {
        Solution_1 solution1 = new Solution_1();
        System.out.println(solution1.solution("1234"));
    }
}
