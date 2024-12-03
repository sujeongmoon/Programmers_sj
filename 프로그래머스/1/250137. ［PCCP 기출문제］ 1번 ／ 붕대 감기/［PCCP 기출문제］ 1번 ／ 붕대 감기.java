class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        
        // t초동안 붕대를 감으면서 x만큼의 체력 회복 -> t * x 만큼의 체력 회복
        // t초 연속으로 붕대를 감는 데 성공하면 y만큼의 체력 추가 회복
        // 최대 체력보다 커질 수 없음
        
        // 몬스터에게 공격당하면 회복 취소, 즉시 다시 붕대감기 시작
        // 공격받으면 체력이 줄어듦, 체력 0이면 죽음
        
        // [시전 시간, 초당 회복량, 시전시간 회복 시 추가 회복량], 최대체력, 몬스터의 공격하는시간과 피해량
        
        //남은 체력 리턴, 죽으면 -1리턴
        int bonus = 0;
        int fullHealth = health;
        int j = 0; // atacks 순회
        for (int i = 1; i <= attacks[attacks.length - 1][0]; i++) {
            // 만약 attacks[j][0]이랑 같다면, j++시키고 attacks[j][1]만큼 health에서 뺴기
            // bonus 0으로
            // helath가 0 이하가 되면 -1 리턴
            if (i == attacks[j][0]) {
                health = healthMinus(health, attacks[j][1]);
                if (health == 0) {
                    return -1;
                }
                bonus = 0;
                j++;
            } else {
            // 아니라면, 초당 bandage[1]만큼 health에 추가, health 넘지 않도록
            // bonus ++, bonus가 bandage[2]와 같아지면 0으로 만들고 체력 추가, health넘지않도
                health = healthPlus(health, bandage[1], fullHealth);
                bonus++;
                if (bonus == bandage[0]) {
                    bonus = 0;
                    health = healthPlus(health, bandage[2], fullHealth);
                }
            }
        }
        
        answer = health;      
        return answer;
    }
    
    public int healthPlus(int health, int plus, int fullHealth) {
        if (health + plus < fullHealth) {
            health += plus;
        } else {
            health = fullHealth;
        }
        return health;
    }
    
    public int healthMinus(int health, int minus) {
        if (health - minus > 0) {
            health -= minus;
        } else {
            health = 0;
        }
        return health;
    }
}