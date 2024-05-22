import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int minIndex = 0;
        
        // arrayList로 옮기고
        // min 최소값을 찾고 (인덱스저장)
        // 그거 delete하고
        // answer 배열로 옮기기
        
        //리턴하려는 배열이 빈 배열인 경우
        if (arr.length == 1) {
            answer = new int[] {-1};
            return answer;
        }
        
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for (int e : arr) {
            arrList.add(e);
        }
        
        for (int i = 1; i < arrList.size(); i++) {
            if (arrList.get(minIndex) > arrList.get(i)){
                minIndex = i;
            }
        }
        
        arrList.remove(minIndex);
        
        answer = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        
        
        
        
        return answer;
    }
}