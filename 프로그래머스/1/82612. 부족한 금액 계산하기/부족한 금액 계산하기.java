class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long mulPrice = 0;
        
        // 놀이기구를 이용한 횟수를 곱한 만큼의 이용료를 받음.
        // 즉, 금액은 price * count, for로 총 금액 구해야 하고, 해당 금액이 price를 넘으면 빼서 리턴
        
        for (int i = 1; i <= count; i++) {
            mulPrice += (price * i); 
            System.out.println(i + " 번째 " + mulPrice);
        }
        
        if (mulPrice > money) {
            answer = mulPrice - money;
        } 
        
        return answer;
    }
}