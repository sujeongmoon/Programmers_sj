class Solution {
    boolean solution(String s) {
        boolean answer = true;

        s = s.toLowerCase(); // 소문자 변환
        
        int countP = 0;
        int countY = 0;
        char charS;
        
        for (int i = 0; i < s.length(); i++){
            charS = s.charAt(i);
            if (charS == 'p') {
                countP++;
            } else if (charS == 'y') {
                countY++;
            }
        }
        
        if (countP != countY) {
            answer = false;
        }

        return answer;
    }
}