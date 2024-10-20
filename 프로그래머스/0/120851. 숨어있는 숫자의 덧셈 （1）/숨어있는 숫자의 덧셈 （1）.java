class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        char[] charArray = my_string.toCharArray();
        
        for (char c : charArray) {
            if (c >= '0' && c <= '9') {
                answer += c - '0';
            }
        }
        
        return answer;
    }
}