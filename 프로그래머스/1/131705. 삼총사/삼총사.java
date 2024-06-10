class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        // 삼총사가 되는 법 : 리스트가 주어지는데, 이 중 세명 더했을 때 0이 되는 경우를 세기
        // 일단 리스트를 훑어서 0이 있는 경우를 찾고, 0이 있다면 -를 붙였을 때 일치하는 값을 찾아서 ??
        
        // 아니면 수를 하나 정하고, 나머지 더했을 때 0이 되도록 하는 수 ...
        // 일단 sort를 해야 편하지 않을까? 

        // for 세 번 돌리기...? ㅋ
        
        
        for (int i = 0; i < number.length-2; i++){
            for (int j = i+1; j < number.length-1; j++) {
                for (int k = j+1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        System.out.println( "dd: " + i + " " + j + " " + k + " , " + number[i] + " " + number[j] + " " + number[k] );
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}