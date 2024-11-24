class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        
        // 세 개의 숫자를 더했을 때 소수가 되는 경우를 구하기
        // -> O(n^4)??
        
        for (int i = 0 ; i < nums.length - 2; i++) {
            for (int j = i+1; j < nums.length - 1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
    
    public boolean isPrime(int number) {
        boolean primeAnswer = false;
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return primeAnswer;
            }
        }
        primeAnswer = true;
        return primeAnswer;
    }
}