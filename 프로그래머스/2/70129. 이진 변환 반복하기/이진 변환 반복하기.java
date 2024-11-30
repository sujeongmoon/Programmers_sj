class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int sLength = 0;
        
        //s가 1이 될 때까지, answer 값을 변경
        // while문. 그 안에서 for문을 돌아서 charAt, 0인경우 answer[1] ++하고, 아닌 경우 sLength를 더하기
        while (!s.equals("1")) {
            sLength = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0'){
                    answer[1]++;
                } else {
                    sLength++;
                }
            }
            
            s = this.toBinary(sLength);
            // 0 제거 후 길이를 이진 변환해서 s로 변경
            answer[0]++;
        }
        
        return answer;
    }
    
    // int 10진수를 String 2진수로 바꾸는 함수
    public String toBinary(int decimal){
        StringBuilder bin = new StringBuilder();
        
        while (decimal >= 1){
            bin.append(Integer.valueOf(decimal%2));
            decimal /= 2;
        }
        
        return bin.reverse().toString();
    }
}