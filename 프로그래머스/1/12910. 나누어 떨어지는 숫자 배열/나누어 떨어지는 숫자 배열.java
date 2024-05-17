import java.util.ArrayList; 
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> answerArrayList = new ArrayList<>();
        
        //일단 배열에 넣고, sort?
        
        for (int arrElement : arr) {
            if (arrElement % divisor == 0) {
                answerArrayList.add(arrElement);
            }
        }
        
        
        int answerListLength = answerArrayList.size();
        if (answerListLength == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        answer = new int[answerListLength];
        
        for (int i = 0; i < answerListLength; i++) {
            answer[i] = answerArrayList.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}