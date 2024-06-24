package Concept.Algorithms.Programmers.newbie;

class Solution_overwrite{
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuffer str = new StringBuffer();
        str.append(my_string);

        // s부터 overwrite_string의 길이만큼을 overwrite_string으로 대체
        for (int i = 0; i < overwrite_string.length(); i++) {
            if (s + i < str.length()) {
                str.setCharAt(s + i, overwrite_string.charAt(i));
            } else {
                str.append(overwrite_string.charAt(i));
            }
        }

        return str.toString();
    }
}

public class overwrite_string {
    public static void main(String[] args) {
        Solution_overwrite so = new Solution_overwrite();
        String solution = so.solution("He11oWor1d","lloWorl",2);
    }
}
