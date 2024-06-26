package Concept.Algorithms.Programmers.Level_1;

import java.util.Arrays;
import java.util.List;

public class 크기가_작은_부분_문자열 {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        String strings = "";

        int length = t.length() - p.length() + 1;
        long pNum = Long.parseLong(p);
        int answer = 0;

        for (int i = 0; i < length; i++) {
            String temp = t.substring(i, i + p.length());

            if (Long.parseLong(temp) <= pNum) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
