class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char[] charArray = my_string.toCharArray();
        
        for (char c : charArray) {
            if (c > 'Z') {
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }
        }
        
        return answer;
    }
}