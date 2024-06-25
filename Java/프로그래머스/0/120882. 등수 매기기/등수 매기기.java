class Solution {
    public int[] solution(int[][] score) {        
        
        int[] answer = new int[score.length];
        int rank = 1;
        
        for(double i = 100; i >= 0; i -= 0.5) {
        	int cnt = 0;
        	for(int j = 0; j < score.length; j++) {
        		if(((double)score[j][0] + score[j][1]) / 2 == i) {
        			answer[j] = rank;
        			cnt++;
        		}
        	}
        	rank += cnt;
        	
        }
        
        return answer;
    }
}