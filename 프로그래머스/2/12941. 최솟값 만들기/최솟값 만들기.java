import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        // A, B에서 각각 한 개의 수를 뽑아 두 수를 곱함
        // 길이가 같은 배열만큼 반복 -> 곱한 값을 더함
        // 최종적으로 누적된 값이 최소가 되도록
        
        // 한 배열에서 가장 작은 수, 반대 배열에서 가장 큰 수를 꼽아서 곱하기=
        // 정렬 -> 하나는 오름차순, 하나는 내림차순
        
        Arrays.sort(A); // A = Arrays.sort(A)가 아니라 자동으로 A에 적용됨
        /*
        Integer[] integerB = Arrays.stream(B).boxed().toArray(Integer[]::new);
        Arrays.sort(integerB, Collections.reverseOrder());
        */
        Arrays.sort(B);
        int[] reverseB = new int[B.length];
        int j = 0;
        for (int i = B.length - 1; i >= 0; i--) {
            reverseB[j] = B[i];
            j++;
        }
        
        
        for (int i = 0; i < A.length; i++) {
            answer += A[i] * reverseB[i];
        }
        
        return answer;
    }
}