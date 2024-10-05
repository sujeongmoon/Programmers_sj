import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        // 해쉬로 숫자랑 영단어를 매칭시키면 될까?
        // 해쉬맵으로 영단어랑 숫자를 대응??
        
        // 일단은 s만큼 for문을 돌면서, charAt를 했을 때 char이 0이상 9이하로 나오면 - '0' 하기
        // answerString으로 추가한담에 마지막에 answer로 변환하는 게 깔끔하겠네
        
        // 아니다. 일단 numWords에다가 하나씩 추가한담에 일치하는 거 있으면 없애고 그걸 넣어야겠다 오키
        
        String answerString = "";
        String numWords = "";
        
        HashMap<String, Character> numberMap = new HashMap<>() {{
            put("zero", '0');
            put("one", '1');
            put("two", '2');
            put("three", '3');
            put("four", '4');
            put("five", '5');
            put("six", '6');
            put("seven", '7');
            put("eight", '8');
            put("nine", '9');
        }};
        
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                answerString += s.charAt(i); // 0부터 9까지는 바로 저장
                continue;
            } 
            numWords += s.charAt(i);
            
            //여기서 해쉬맵 한 번 돌려서 일치하는 경우 보내주기?
            if (numberMap.containsKey(numWords)){
                answerString += numberMap.get(numWords);
                numWords = "";
            }
        }
        
        answer = Integer.valueOf(answerString);
        
        return answer;
    }
}