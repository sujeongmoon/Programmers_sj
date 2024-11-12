class Solution {
    public int[] solution(int k, int[] score) {
               
        /* 문제
        가수의 점수가 지금까지 출연 가수 점수 중 k번째 이내면, 명예의 전당에 올림.
        -> k일 다음부터 명전 명단 교체
        명전은 순서에 따라 정렬됨
        */
        
        // k는 명전의 크기값, score은 가수들의 점수
        
        int[] answer = new int[score.length];
        int temp = 0; 
        int nextTemp = 0;
        
        // 1. 명전 배열을 만든다. bestScores, k만큼, 값은 0으로 초기화
        int[] bestScores = new int[k];
        
        // 2. for문으로 명전 점수들을 넣는다, i < score.length만큼(진행한 날짜 수만큼) 
        for (int i = 0; i < score.length; i++){
            // 2-1. 명전에 점수 넣으려면 계속 밀어내면서 교체해야함. bestScore for 또 돌면서, 만약에 나보다 작은 수가 나온다면
            for (int j = 0; j < k; j++) {
                if (score[i] > bestScores[j]) { // 오늘의 점수가 특정 순서보다 큰 경우, 나를 bestScores[j]에다가 넣고 나머지는 뒤로 미뤄야함
                    temp = bestScores[j];
                    bestScores[j] = score[i];
                    for (int l = j+1; l < k; l++) {
                        // 값 교체
                        nextTemp = bestScores[l]; 
                        bestScores[l] = temp;
                        temp = nextTemp;
                    }
                    break;
                } 
            }
            
            // 만약 i가 k보다 작다면 bestScore[i]를 리턴, 그 이상이라면 bestScore[k]를 리턴
            if (i < k) {
                answer[i] = bestScores[i];
            } else {
                answer[i] = bestScores[k-1];
            }
        }

       
        
        //answer은 매일매일의 명전 최하위 점수를 담음.
        return answer;
    }
}