class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 홀수라면 n 이하의 홀수를 리턴, 짝수라면 n 이하의 짝수를 리턴
        
        if (n % 2 == 1) { //홀수
            for (int i = 1; i <= n; i+=2) {
                answer += i;
            }
        } else {
            for (int i = 0; i <= n; i += 2 ) {
                answer += i*i;
            }
            
            
        }
        
        return answer;
    }
}