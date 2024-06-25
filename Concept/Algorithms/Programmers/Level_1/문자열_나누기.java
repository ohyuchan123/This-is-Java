package Concept.Algorithms.Programmers.Level_1;

import java.util.*;

public class 문자열_나누기 {
    public static void main(String[] args) {
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        String[] list = s.split("");
        System.out.println(Arrays.toString(list));

        List<String> charList = new ArrayList<>(Arrays.asList(list));

        while (!charList.isEmpty()) {
            String firstChar = charList.get(0);
            int cnt1 = 0, cnt2=0;
            int i;
            for (i = 0; i < charList.size(); i++) {
                if (firstChar.equals(charList.get(i))) {
                    cnt1++;
                } else cnt2++;
                if(cnt1 == cnt2) break;
            }
            count++;

            for (int j = 0; j <= i; j++) charList.remove(0);
        }
        System.out.println(count);
    }
}
