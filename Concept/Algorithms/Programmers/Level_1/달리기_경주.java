package Concept.Algorithms.Programmers.Level_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution_1{
    public String[] solution(String[] players, String[] callings){
        String[] answer = players;

        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<players.length; i++) map.put(players[i], i);

        for(int i=0; i<callings.length; i++) {
            // 이름 불린 선수의 원래 등수
            int rank = map.get(callings[i]);
            // 순위가 바뀔 선수의 이름
            String name = answer[rank-1];
            // 선수 등수 변경
            answer[rank-1] = answer[rank];
            answer[rank] = name;
            map.put(answer[rank-1], rank-1);
            map.put(answer[rank], rank);
        }

        return answer;
    }
}

public class 달리기_경주 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] calling = {"kai", "kai", "mine", "mine"};
        Solution_1 solution = new Solution_1();

        String[] answer = solution.solution(players,calling);
        System.out.println(Arrays.toString(answer));
    }
}
