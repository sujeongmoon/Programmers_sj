class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        
        //우선 배열을 만들어야함. 그냥 arr1이랑 arr2 length로 구하기.
        // 이차원 배열 요소의 length 구하고 싶으면 [0].length
        answer = new int[arr1.length][arr1[0].length];
        
        // 이중 for문으로
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        
        return answer;
    }
}