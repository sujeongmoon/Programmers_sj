class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int divnumAnswer = 0;
        
        // 1번 ~ number이 고유 기사번호
        // 고유 기사번호 각각의 약수 개수가 구매하고자하는 무기의 공격력
        // limit보다 약수개수가 큰 경우는 지정된 무기(지정된 공격력) 사용 = power
        // answer은 전체 무기의 공격력의 합
        
        for (int i = 1; i <= number; i++) {
            divnumAnswer = divnum(i);
            if (divnumAnswer > limit) {
                answer += power;
            } else {
                answer += divnumAnswer;
            }
        }
        
        return answer;
    }
    
    // 약수개수 구하기 = 공격력 구하기
    public int divnum(int number) {
        int divnumAnswer = 0;
        boolean pwr = false;

        // i를 제곱해서 number보다 크지 않을 때까지 돌 수 있음
        for (int i = 1; i*i <= number; i++) {
            if (i*i == number) {
                return divnumAnswer * 2 + 1;
            } else if ( number % i == 0) {
                divnumAnswer ++;
            }
        }
        return divnumAnswer * 2;
    }
        


}