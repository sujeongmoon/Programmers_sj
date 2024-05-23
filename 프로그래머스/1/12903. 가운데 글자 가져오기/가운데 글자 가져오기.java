class Solution {
    public String solution(String s) {
        String answer = "";
        
        
        // char Array를 만들어서 넣기? 일단 다 넣고, 짝수라면 두 글자 넣고, 홀수라면 한 글자 넣도록.
        
        
        char[] sCharArray = s.toCharArray();
        int index = sCharArray.length / 2;
        
        if (sCharArray.length % 2 == 0) {            
            answer = Character.toString(sCharArray[index-1]) + Character.toString(sCharArray[index]);
        } else {
            answer = Character.toString(sCharArray[index]);
        }
        
        return answer;
    }
}