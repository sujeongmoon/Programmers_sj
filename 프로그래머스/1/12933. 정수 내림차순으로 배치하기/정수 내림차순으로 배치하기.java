import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        LinkedList<Integer> numberList = new LinkedList<>(); // 링크드리스트 선언 -> 계속 교체할 거라서
        //자릿수를 각각 떼어서 리스트에 넣고
        int nLength = 0;
        while ( n > 0 ) {
            int nEachNumber = (int)(n % 10);
            numberList.add(nEachNumber);
            n /= 10;
            nLength++;
        }
        
        //내림차순 성렬
         Collections.sort(numberList, Collections.reverseOrder());
      
        for (int nL : numberList) {
            System.out.println(nL);
}
        
        //배열을 for로 곱하기 10을 하든지 해서 long으로 출력해준다
        for(int i=0; i< nLength; i++) {
            answer += numberList.get(i);
            answer *= 10;
        }
        answer /= 10;
        return answer;
    }
}