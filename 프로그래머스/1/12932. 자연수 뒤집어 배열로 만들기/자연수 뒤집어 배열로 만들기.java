class Solution {
    public int[] solution(long n) {
         String nStr = Long.toString(n);
        int[] answer = new int[nStr.length()];

        //answer을 초기화시켜줘야함 -> n의 자릿수만큼 초기화.
        // n의 자릿수는 nLength
        // nLength 구하기 -> String으로 바꿔서?
        
       
        
        // for 로 나머지 받아서
        
        for (int i = 0; i < nStr.length(); i++ ){
            //answer[i] = Integer.parseInt(nStr[i]);
            answer[i] = Character.getNumericValue(nStr.charAt(nStr.length()-1-i));
            
        }
        
        return answer;
    }
}