class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        // 콜라 빈 병 두 개 -> 새 콜라 하나. /가진 빈 병이 1, 0이면 콜라 받을 수 없음.
        // 상빈이 : 받은거 계속 가져가서 마시고 또 받기.
        
        //n이 받은 총 병, a가 마트에 줘야하는 병, b가 a개를 가져다줬을 때 받는 병
        
        while (n >= a) { //가지고있는 병이 a 이상이어야 함
            n -= a;
            n += b;
            answer += b;
        }
        
        return answer;
    }
}