class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        //5, 3, 1
        
        while (hp >= 0) {
            if (hp >= 5) {
                hp -= 5;
                answer++;
            } else if (hp >= 3) {
                hp -= 3;
                answer++;
            } else {
                answer += hp;
                break;
            }
        }
        
        return answer;
    }
}