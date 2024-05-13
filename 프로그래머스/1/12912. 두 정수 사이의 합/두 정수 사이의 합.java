class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int maxNum = a;
        int minNum = b;
        //둘 중 뭐가 큰 지 정해주기
        if (a < b){
            maxNum = b;
            minNum = a;
        }
        
        // space 정하기
        int aBSpace = maxNum - minNum + 1;
        
        while ( minNum <= maxNum ){
            answer += (long)minNum;
            minNum++;
        }
    
        
        
        
        return answer;
    }
}