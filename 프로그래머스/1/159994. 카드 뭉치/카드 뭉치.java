class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        // cards는 배열, goal을 만들 수 있어야함.
        int i = 0;
        int j = 0;
        
        for (int k = 0; k < goal.length; k++) {
            if (i < cards1.length && cards1[i].equals(goal[k])) {
                i++;
            } else if (j < cards2.length && cards2[j].equals(goal[k])) {
                j++;
            } else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}