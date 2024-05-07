class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 가장 작은 수로 나누고, 그 다음 수는 안 나눠지는 게 확인되면 그 다음 수를 리턴하면 됨
        for (int i = 1; i < n; i++){
            if (n%i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}