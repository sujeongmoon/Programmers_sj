class Solution {
    public String solution(String s) {
        String answer = "";
        
        // split을 통해서? 배열에 담겠지,
        // for문 돌면서 Integer.valueOf()로 max, min값 구해서 Integer.toString() 통해 answer 리턴
        
        String[] sArray = s.split(" ");
        int max = Integer.valueOf(sArray[0]);
        int min = Integer.valueOf(sArray[0]);
        
        for (int i = 0; i < sArray.length; i++) {
            if (max < Integer.valueOf(sArray[i])) {
                max = Integer.valueOf(sArray[i]);
            } else if (min > Integer.valueOf(sArray[i])) {
                min = Integer.valueOf(sArray[i]);
            }
        }
        
        answer = Integer.toString(min) + " " + Integer.toString(max);
        
        return answer;
    }
    
}