class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 시작점을 1부터 n까지 순회
        for (int i = 1; i * (i + 1) / 2 < n; i++) {
            int sum = i * (i + 1) / 2; // 1부터 i까지의 합
            if ((n - sum) % (i + 1) == 0) {
                answer++;
            }
        }
        
        // 자기 자신을 포함하는 경우 추가
        answer++;
        
        return answer;
    }
}
