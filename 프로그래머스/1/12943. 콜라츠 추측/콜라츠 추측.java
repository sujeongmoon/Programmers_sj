class Solution {
    public int solution(int num) {
        int answer = 0;
        
        if (num == 1) {
            return 0;
        }
        
        while (num != 1) {
            
            if (answer == 500) {
                return -1;
            }
            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 2 == 1) {
                //else로는 안되는 이유가 뭘까 -> 음수 overflow때문인 듯
                num *= 3;
                num += 1;
            }
            answer += 1;
        }
        
        System.out.println(num);
        return answer;
    }
}