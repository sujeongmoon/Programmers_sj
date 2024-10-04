class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int temp = 0;

        // 오름차순으로 정렬한 뒤, 하나씩 더해서 budget 넘지 않을 때까지 answer +1하면 됨
        
        for (int i = 0; i < d.length - 1; i++) {
            for (int j = i + 1; j < d.length; j++){
                if ( d[i] > d[j]) {
                    temp = d[i];
                    d[i] = d[j];
                    d[j] = temp;
                }
                
            }
        }
        
        for (int i = 0; i < d.length; i++) {
            System.out.println(budget);
            budget -= d[i];
            if (!(budget >= 0)) {
                break;
            }
            answer++;
            
        }
        
        return answer;
    }
}