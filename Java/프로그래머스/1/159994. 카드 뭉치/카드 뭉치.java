class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        int idx1 = 0;
        int idx2 = 0;
        String answer = "Yes";
        for(String g : goal) {
            if(idx1 < cards1.length && cards1[idx1].equals(g)) {
                idx1++;
            } else if(idx2 < cards2.length && cards2[idx2].equals(g)) {
                idx2++;
            } else {
                answer = "No";
                break;
            }
        }
        
        
        return answer;
    }
}