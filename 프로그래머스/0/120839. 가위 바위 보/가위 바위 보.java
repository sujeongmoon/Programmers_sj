class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        //split해서 풀기
        
        String[] rspSplit = new String[rsp.length()];
        rspSplit = rsp.split("");
        
        for (int i = 0; i < rspSplit.length; i++) {
            switch(rspSplit[i]) {
                    case "0" -> answer+="5";
                    case "2" -> answer+="0";
                    case "5" -> answer+="2";
            }
        }
        
        return answer;
    }
}