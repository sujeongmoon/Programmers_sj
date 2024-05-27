import java.util.Arrays;
 

class Solution {
    public String solution(String s) {
        String answer = "";

        //int로 형변환해서 정렬시킨다음에 다시 문자열에 넣기?
        //string도 sort가 되나? -> 문자열은 불변이라서 안 된다고 함
        //문자열을 char배열로 바꿔서 정렬하고 합치기
        
        char[] charArr = s.toCharArray(); 
        Arrays.sort(charArr);
        StringBuilder tmp = new StringBuilder(new String(charArr));
        answer = tmp.reverse().toString();
        
        return answer;
    }
}