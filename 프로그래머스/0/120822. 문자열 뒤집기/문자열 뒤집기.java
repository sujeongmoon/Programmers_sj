class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        StringBuilder builder = new StringBuilder(my_string);
        builder.reverse();
        answer = builder.toString();
        
        return answer;
    }
}