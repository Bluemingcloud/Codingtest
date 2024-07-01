class Solution {
    public int solution(int[] array) {
        int maxCnt = 0;
        int[] counts = new int[1001];
        for(int a : array) {
            counts[a]++;
            if(counts[a] > maxCnt) maxCnt = counts[a];
        }
        
        int answer = -1;
        for(int i = 0; i < counts.length; i++) {
            if(answer != -1 && counts[i] == maxCnt) return -1;
            if(counts[i] == maxCnt) answer = i;
        }
        
        return answer;

    }
}