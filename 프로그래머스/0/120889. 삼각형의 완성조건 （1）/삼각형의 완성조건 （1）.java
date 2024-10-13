class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int maxSide = sides[0];
        int twoSidesSum = maxSide;
        
        for (int i = 1; i < sides.length; i++) {
            if (maxSide < sides[i]) {
                maxSide = sides[i];
            }
            twoSidesSum += sides[i];
        }
        
        twoSidesSum -= maxSide;
        
        if (maxSide < twoSidesSum) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}