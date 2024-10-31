import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long ex = x;
        
        for(int i = 0; i < n; i++){
            answer[i] = ex;
            ex += x;
        }
        
        return answer;
    }
}