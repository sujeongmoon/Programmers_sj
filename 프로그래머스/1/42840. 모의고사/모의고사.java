import java.util.*;

// 코플릿 
class Solution {
    
    public int[] solution(int[] answers) {
        int[] patterns = {0, 0, 0}; // 수포자의 점수
        int[][] dartPatterns = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        // 각 수포자의 정답 점수를 계산
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < dartPatterns.length; j++) {
                if (answers[i] == dartPatterns[j][i % dartPatterns[j].length]) {
                    patterns[j]++;
                }
            }
        }

        // 최고 점수를 받은 수포자 찾기
        int maxScore = Arrays.stream(patterns).max().getAsInt();
        List<Integer> maxList = new ArrayList<>();
        for (int i = 0; i < patterns.length; i++) {
            if (patterns[i] == maxScore) {
                maxList.add(i + 1);
            }
        }

        return maxList.stream().mapToInt(i -> i).toArray();
    }
}
