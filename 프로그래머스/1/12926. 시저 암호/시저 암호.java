import java.util.ArrayList;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        ArrayList<Character> charArray = new ArrayList<>();
        int tmpInt = 0;
        char tmpChar = '0';
        
        // int로 바꿔서 n만큼 더한 후 다시 문자열로, parseInt하고 toString으로 바꿔야하나?
        // 일단 문자열을 다 문자 배열로 만들어줘야함
        
        for (int i = 0 ; i < s.length(); i++){
            charArray.add(s.charAt(i));
        }
        
        for (char ch : charArray) {
            if (ch != ' '){
                tmpInt = (int)ch + n;
 
                if (tmpInt > (int)'z') { // z보다 큰 경우 
                    tmpInt -= (int)'z' - (int)'a' + 1;
                } else if (tmpInt > (int)'Z' && (int)ch <= 'Z') { // Z보다 큰 경우 
                    tmpInt -= (int)'Z' - (int)'A' + 1;
                }
                
                tmpChar = (char)tmpInt;
            }
            else {
                tmpChar = ' ';
            }
            answer += tmpChar;
        }
        
        return answer;
    }
}