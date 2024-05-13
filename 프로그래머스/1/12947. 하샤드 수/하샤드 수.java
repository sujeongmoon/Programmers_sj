class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        //자릿수의 합을 구하고, 그게 원래 수에서 나누어지는 걸 확인하면 true

        //자릿수를 떼어두고 더하기
        int originalX = x;
        int eachNumberAdd = 0;
        while (x > 0){
            eachNumberAdd += (x % 10);
            x /= 10;
        }
        
        if (originalX % eachNumberAdd == 0){
            answer = true;
        }
        
        return answer;
    }
}