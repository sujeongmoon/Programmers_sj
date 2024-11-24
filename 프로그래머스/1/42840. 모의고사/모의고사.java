import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        //int[] answer = {};
        
        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;
        
        int dart1 = 0;
        int dart2 = 0;
        int dart3 = 0;
        
        int max = 0;
        
        // 1번 수포자가 찍는 방식 = answers의 인덱스 % 5 + 1
        // 2번 수포자가 찍는 방식 = 인덱스가 2로 나눠지면 2, 1, 3, 5, 7일 때 1 3 4 5 반복
        // 3번 수포자가 찍는 방식 = 33 11 22 44 55 반복
        
        for (int i = 0; i < answers.length; i++) {
            
            // dart1의 답
            dart1 = (i%5) + 1;
            if (answers[i] == dart1) {
                answer1++;
            }
            
            // dart2의 답
            switch (i % 8) {
                    case 0, 2, 4, 6 -> dart2 = 2;
                    case 1 -> dart2 = 1;
                    case 3 -> dart2 = 3;
                    case 5 -> dart2 = 4;
                    case 7 -> dart2 = 5;
            }
                
            if (answers[i] == dart2) {
                answer2++;
            }
            
            //dart3의 답
            switch (i % 10) {
                    case 0, 1 -> dart3 = 3;
                    case 2, 3 -> dart3 = 1;
                    case 4, 5 -> dart3 = 2;
                    case 6, 7 -> dart3 = 4;
                    case 8, 9 -> dart3 = 5;
            }
            
            if (answers[i] == dart3) {
                answer3++;
            }
        }
        
        // 최고값 구하기
        int[] maxAnswer = {answer1, answer2, answer3};
        max = answer1;
        
        for (int i = 1; i < 3; i++) {
            if (max < maxAnswer[i]) {
                max = maxAnswer[i];
            }
        }
        
        ArrayList<Integer> maxList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (max == maxAnswer[i]) {
                maxList.add(i+1);
            }
        }
        
        int[] answer = new int[maxList.size()];
        for (int i =0; i < answer.length; i++) {
            answer[i] = maxList.get(i);
        }
        
        return answer;
    }
}