class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        //기준 정하고 그 이상이면 저장, 아니면 별
        int lastFourDivision = phone_number.length() - 4;
        
        for (int i = 0; i < phone_number.length(); i++) {
            if (i < lastFourDivision) {
                answer += '*';
            } else {
                answer += phone_number.charAt(i);
            }
        }
        
        return answer;
    }
}