class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[] point = new int[k + 1];
        for(int s : score) {
        	point[s]++;
        }
        int temp = 0;
        for(int i = k; i > 0; i--) {
        	answer += ((point[i] + temp) / m) * i;
            temp = (point[i] + temp) % m;
        }
        return answer * m;
    }

}