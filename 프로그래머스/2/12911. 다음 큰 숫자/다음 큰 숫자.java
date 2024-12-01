class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1001110의 다음 숫자는 1010011(4 + 1)
        // 1001111의 다음 숫자는 1011110()
        // 1111의 다음숫자는 10111(+8)
        // 1110의 다음숫자는 10011(14랑 19니까 4 + 1)
        // 1100의 다음숫자는 10001
        
        // 규칙이 뭘까?
        
        //그냥 단순하게 1씩 더해가면서 비교해봤을 때 1의자리가 같은 숫자면 될까?
        int nOne = this.checkOne(n);
        
        while(true) {
            n++;
            if(nOne == checkOne(n)) {
                answer = n;
                break;
            }
        }
         
        return answer;
    }
    
    // 1 개수가 몇 개인지 확인하는 메소드
    public int checkOne(int n) {
        String nBinary = Integer.toBinaryString(n);
        nBinary = nBinary.replace("0","");
        return nBinary.length();
    }
}