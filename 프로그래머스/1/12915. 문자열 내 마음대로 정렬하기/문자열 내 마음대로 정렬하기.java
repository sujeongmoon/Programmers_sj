class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = strings;
        
        String temp = "";
        
        //버블정렬로 비교해보기?
        for(int i = 0; i < answer.length - 1; i++) {
            for(int j = i+1; j < answer.length; j++) {
                if (answer[i].charAt(n) > answer[j].charAt(n)) { // 뒤에게 내것보다 작으면
                    temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
                else if (answer[i].charAt(n) == answer[j].charAt(n)) {
                    if (answer[i].compareTo(answer[j]) > 0) { 
                        temp = answer[i]; answer[i] = answer[j]; 
                        answer[j] = temp;
                    }
                }
            }
        }
        
        return answer;
    }
}