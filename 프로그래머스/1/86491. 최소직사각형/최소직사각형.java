class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int tmp = 0;
        
        int max0 = 0;
        int max1 = 0;
        
        //최소직사각형.
        //제일 큰 걸 왼쪽으로, 작은 걸 오른 쪽으로 한 다음, 제일 큰 거 제일 큰 거 구하고, 곱하면 될까?
        
        for (int i = 0; i < sizes.length; i++){
            if (sizes[i][0] < sizes[i][1]) {
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            if (max0 < sizes[i][0]) {
                max0 = sizes[i][0];
            }
            if (max1 < sizes[i][1]) {
                max1 = sizes[i][1];
            }
        }
        
        answer = max0 * max1;
        
        
        return answer;
    }
}