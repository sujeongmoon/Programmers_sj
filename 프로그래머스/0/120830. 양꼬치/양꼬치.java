class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        // 양꼬치 10인분마다 음료수 하나 서비스. 양꼬치 n인분과 음료수 k개를 먹었다.
        
        // 양꼬치 값 추가
        answer += n * 12000;
        
        // 계산해야하는 음료수 값 빼기
        k -= n / 10;
        
        // 음료수 값 추가
        answer += k * 2000;
            
        return answer;
    }
}