import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
       // int[] answer = {};
        int remember = -1;
        
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for (int i : arr) {
            if (i == remember){
                continue;
            }
            answerList.add(i);
            remember = i;
        }
        
        int[] answer = new int[answerList.size()];
        
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}