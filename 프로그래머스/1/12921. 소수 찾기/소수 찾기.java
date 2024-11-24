class Solution {
    public int solution(int n) {
        // n은 2 이상이므로 무조건 1부터 시작
        int answer = 1;
        
        for (int i = 3; i <= n; i++) {
            if (primeNumber(i)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public boolean primeNumber(int number) {
        boolean answer = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0){
                answer = false;
                return answer;
            }
        }
        return answer;
    }
}