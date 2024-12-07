class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        // [h+1][w], [h-1][w], [h][w+1], [h][w-1], 0이나 length를 넘으면 안됨
        // 문자열 같은지 비교
        
        String color = board[h][w];
        
        if (h < board.length - 1) {
            if (color.equals(board[h+1][w])) {
                answer++;
            }
        }
        
        if (h > 0) {
            if (color.equals(board[h-1][w])) {
                answer++;
            }
        }
        
        if (w < board[0].length-1) {
            if (color.equals(board[h][w+1])) {
                answer++;
            }
        }
        
        if (w > 0) {
            if (color.equals(board[h][w-1])) {
                answer++;
            }
        }
        
        return answer;
    }
}