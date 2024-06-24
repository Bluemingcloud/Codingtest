class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        int widthLimit = board[0] / 2;  
        int lengthLimit = board[1] / 2;  
        
        for(String key : keyinput) {
        	if(key.equals("left")) {
        		if(answer[0] == -widthLimit) continue;
        		answer[0]--;
        	} else if(key.equals("right")) {
        		if(answer[0] == widthLimit) continue;
        		answer[0]++;
        	} else if(key.equals("up")) {
        		if(answer[1] == lengthLimit) continue;
        		answer[1]++;
        	} else {
        		if(answer[1] == -lengthLimit) continue;
        		answer[1]--;
        	}
        }
        
        return answer;
    }
}