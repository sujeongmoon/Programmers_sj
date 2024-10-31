import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] sSplit = s.split(" ", -1);  // -1을 추가하여 마지막 단어 뒤의 공백도 포함
        
        for (int j = 0; j < sSplit.length; j++) {
            for (int i = 0; i < sSplit[j].length(); i++) {
                if (i % 2 == 0) {  // 짝수면
                    answer.append(Character.toUpperCase(sSplit[j].charAt(i)));
                } else {  // 홀수면
                    answer.append(Character.toLowerCase(sSplit[j].charAt(i)));
                }
            }
            if (j != sSplit.length - 1) {
                answer.append(' ');
            }
        }
        
        return answer.toString();
    }
}
