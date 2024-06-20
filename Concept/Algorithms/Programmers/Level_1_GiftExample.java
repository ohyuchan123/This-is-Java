package Concept.Algorithms.Programmers;

import java.util.HashMap;
import java.util.Map;

class Solution{
    public int solution(String[] friends, String[] gifts) {
        // 친구별로 선물 주고 받은 횟수를 기록할 맵
        Map<String, Integer> giveMap = new HashMap<>();
        Map<String, Integer> receiveMap = new HashMap<>();

        // 선물 주고 받은 횟수 계산
        for (String friend : friends) {
            giveMap.put(friend, 0);
            receiveMap.put(friend, 0);
        }

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            String firstFriend = parts[0];
            String secondFriend = parts[1];

            // 선물 주기
            giveMap.put(firstFriend, giveMap.get(firstFriend) + 1);

            // 선물 받기
            receiveMap.put(secondFriend, receiveMap.get(secondFriend) + 1);
        }

        // 선물 지수 계산
        int maxGifts = Integer.MIN_VALUE;
        for (String friend : friends) {
            int giveCount = giveMap.get(friend);
            int receiveCount = receiveMap.get(friend);
            int giftIndex = giveCount - receiveCount;

            if (giftIndex > maxGifts) {
                maxGifts = giftIndex;
            }
        }

        return maxGifts;
    }

}

public class Level_1_GiftExample {
    public static void main(String[] args) {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};

        Solution solution = new Solution();
        int result = solution.solution(friends, gifts);
        System.out.println(result);
    }
}
