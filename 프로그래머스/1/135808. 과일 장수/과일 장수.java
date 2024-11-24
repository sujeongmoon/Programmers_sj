import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        /*
        // score을 정렬한 다음 가장 앞의 m개만큼 자르고, 가장 마지막 인덱스 * m이 answer
        //// 아님
        ArrayList<Integer> scoreSort = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            scoreSort.add(score[i]);
        }
        
        ArrayList.sort(scoreSort);
        
        answer = scoreSort.get(m - 1) * m;
        */
        
        // arrays 정렬 -> sort함수는 Arrays의 static함수라는 걸 기억하기
        Integer[] scoreInteger = new Integer[score.length];
        for (int i = 0; i < score.length; i++) {
            scoreInteger[i] = (Integer)score[i];
        }
        Arrays.sort(scoreInteger, Collections.reverseOrder());

        
        for (int i = m - 1; i < scoreInteger.length; i+=m) {
            answer += scoreInteger[i] * m;
        }
        
        return answer;
    }
}