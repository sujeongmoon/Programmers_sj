import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> rangeList = new ArrayList<>();
        
        // 리스트에 담아서. 정렬
        
        for (int i = 0; i < commands.length; i++) {
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                rangeList.add(array[j]);
                
            }
            Collections.sort(rangeList); // 컬렉션 오름차순 정렬           
            answer[i] = rangeList.get(commands[i][2]-1); // -1 잊지않기
            rangeList.clear();
        }
        
        return answer;
    }
}