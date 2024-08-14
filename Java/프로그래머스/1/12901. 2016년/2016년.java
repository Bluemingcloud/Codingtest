class Solution {
    public String solution(int a, int b) {
    	// 달력
    	int[] datesOfMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    	String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
    	int dates = b;
    	for(int i = 0; i < a; i++) {
    		dates += datesOfMonth[i];
    	}
    	
        return days[dates % 7];
    }
}