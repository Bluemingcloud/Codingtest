class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] line = new int[200];
        for(int[] arr : lines) {
            for(int i = arr[0] + 1; i <= arr[1]; i++) {
                line[i + 99]++;
            }
        }
        
        for(int l : line) {
            if(l >= 2) answer++;
        }
        return answer;
    }
}