class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        
        // n번까지 칠해야 할 구역들이 있다
        // 한 번에 m미터씩 칠한다, 이는 곧 한 번
        // 한 번 칠하기로 한 구역은 적어도 한 번 페인트칠을 해야 함
        
        
        for (int i = 1; i <= n; i ++) {
            // 만약에 section for문을 돌았을 때 나랑 똑같은 수가 있다면
            for (int j = 0; j < section.length; j++) {
                if (i == section[j]) {
                    i += (m - 1);
                    answer++;
                    // break없으면 중복계산됨
                    break;
                }
            }
        }
        
        return answer;
    }
}