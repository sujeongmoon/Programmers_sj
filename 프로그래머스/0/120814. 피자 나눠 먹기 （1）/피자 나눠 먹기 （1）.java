class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 피자는 일곱 조각. n명이서 나눠먹어야됨. 
        // 7의 배수 중에서 n보다 최소한으로 크도록
        
        if (n % 7 == 0) {
            answer = n / 7;
        } else {
            answer = n / 7 + 1;
        }
        
        return answer;
    }
}