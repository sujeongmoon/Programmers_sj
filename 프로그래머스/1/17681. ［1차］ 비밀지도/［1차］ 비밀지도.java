import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int a = 0;
        String aToBinary = "";
    
        
        for (int i = 0; i < n; i++) {
            //or연산 |
            a = arr1[i] | arr2[i]; // 비트연산
            
            aToBinary = Integer.toBinaryString(a);
            
            while(aToBinary.length() < n) {
                aToBinary = "0" + aToBinary;
            }
            
            StringBuilder aStringBuilder = new StringBuilder();
            for (char c : aToBinary.toCharArray()){
                if(c == '1') {
                    aStringBuilder.append('#');
                } else {
                    aStringBuilder.append(' ');
                }
            }
            
            answer[i] = aStringBuilder.toString();
            
        }
        
        return answer;
    }
}