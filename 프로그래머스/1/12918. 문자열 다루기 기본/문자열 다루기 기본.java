class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        // 길이 먼저 확인하기
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        
        //  charAt으로 확인
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 'A') {
                System.out.println(s.charAt(i));
                return false;
            }
            
        }
        
        
        return answer;
    }
}