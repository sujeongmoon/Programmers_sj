import java.util.ArrayList;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String split = "";
      //  ArrayList<Integer> splitByPLength = new ArrayList<>();
        
        // p의 길이를 세고, t를 p의 길이만큼 자른 걸 순서대로 리스트에 저장한다음, 그걸 for로 돌면서 값 비교하기
        
        int pLength = p.length();
        
        for (int i = 0; i <= t.length() - pLength; i++) {
            //t가 8, p가 3이라면. 지금 0에서 5까지 도는거니까 for문을 하나 더 써서
            split = "";
            
            for (int j = i; j < i + pLength; j++){
                split += t.charAt(j);
            }
            
            if (Long.parseLong(split) <= Long.parseLong(p)){
                answer++;
            }
        }
    

        return answer;
    }
}