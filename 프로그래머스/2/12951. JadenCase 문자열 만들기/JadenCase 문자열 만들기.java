import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        s = s.toLowerCase();
        
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            
            if (i == 0) {
                answer.append(c.toUpperCase());
            } else if (s.charAt(i - 1) == ' ') {
                answer.append(c.toUpperCase());
            } else {
                answer.append(c);
            }
        }
    
        return answer.toString();
    }
}