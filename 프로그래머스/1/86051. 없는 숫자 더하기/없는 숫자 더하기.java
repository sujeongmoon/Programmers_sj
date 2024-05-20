class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int untilNumber = 10;
        
        for (int i = 0; i < untilNumber; i++) {
            answer += i;
        }
        
        
        for (int number : numbers){
            answer -= number;
           // System.out.println(number);
        }
        
        
        return answer;
    }
}