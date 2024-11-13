import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        // name이랑 yearning은 서로 매치된 점수, photo는 사진의 배열.
        // name이랑 yearning으로 key-value map 만들고, photo에서 찾아서 숫자 더해서 answer에 삽입하기
        
        
        
        // 1. name이랑 yearning으로 map 만들기
        HashMap<String, Integer> nameYearning = new HashMap<>();
        int yearningScore = 0;
        
        // 2. map에다가 값 삽입 
        for (int i = 0; i < name.length; i++) {
            nameYearning.put(name[i], yearning[i]);
        }
        
        // 3. photo배열 안의 배열 돌면서 값 더하고, answer에다가 삽입
        for (int i = 0; i < photo.length; i++) {
            yearningScore = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (nameYearning.containsKey(photo[i][j])) {
                    yearningScore += nameYearning.get(photo[i][j]);
                }
            }
            answer[i] = yearningScore;
        }
        
        return answer;
    }
}