class Solution {
    public int solution(int n) {
        int answer = 0;
        
        /* case1) 그냥 나머지 0인거 바로 계산, i는 2
        for (int i = 2; i <= n; i++){
            if (i%2 ==0){
                answer += i;
            }
        }
        */
        
        
        //case2) n을 반으로 나누고 1부터 n/2까지 다 더한 다음 *2하는 것도 가능.
        
        for (int i = 1; i <= n/2; i++){
            answer += i;
        }
        answer *= 2;
        return answer;
    }
}