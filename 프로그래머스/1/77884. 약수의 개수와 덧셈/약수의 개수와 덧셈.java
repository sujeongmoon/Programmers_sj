import java.util.Arrays;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        boolean flag = true;
        
        /*배열을 만들어서 left부터right까지.
        약수개수가 홀수 -> 제곱근*/
    
        int leftToRightLength = right - left + 1;
        int[] leftToRight = new int[leftToRightLength];
        for (int i = 0; i < leftToRightLength; i++) {
            leftToRight[i] = left;
            left += 1;
        }
        
        for (int leftToRightElement : leftToRight) {
             for (int i = 1; i*i <= leftToRightElement; i++){
                 if (i*i == leftToRightElement){
                     flag = false;
                     break;
                 }
             }
            if (flag) {
                answer += leftToRightElement;
            } else {
                answer -= leftToRightElement;
                flag = true;
            }
        }     
        
        return answer;
    }
}