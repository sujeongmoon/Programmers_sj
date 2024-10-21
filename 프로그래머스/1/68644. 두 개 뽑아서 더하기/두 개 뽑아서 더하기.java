import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> resultSet = new HashSet<>();
        
        // 서로 다른 인덱스 두 개를 뽑아서 더하기
        for (int i = 0; i < numbers.length - 1; i++){
            for (int j = i + 1; j < numbers.length; j++) {
                resultSet.add(numbers[i] + numbers[j]);
            }
        }
        
        List<Integer> resultList = new ArrayList<>(resultSet);
        
        Collections.sort(resultList);
        
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer;
    }
}