import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> answerList = new ArrayList<>();
        
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0){
                answerList.add(numlist[i]);
            }
        }
        
        int[] answer = new int[answerList.size()];
        answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}