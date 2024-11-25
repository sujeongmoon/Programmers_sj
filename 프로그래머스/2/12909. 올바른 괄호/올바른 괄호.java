import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        // stack
        // (면 push, )면 pop
        // 올바르지 않은 경우 false
        
        Stack<Character> sStack = new Stack<>();
        
        for (Character sCharacter : s.toCharArray()) {
            if (sCharacter.equals('(')) {
                sStack.push('(');
            } else if (sCharacter.equals(')')) {
                // pop해야하는데 비어있는 경우 false처리
                if (sStack.isEmpty()) {
                    answer = false;
                    return answer;
                }
                sStack.pop();
            }
        }
        // for문 후에 stack이 채워져있으면 false처리
        if (!sStack.isEmpty()){
            answer = false;
            return answer;
        }

        return answer;
    }
}