class Solution {
    public int[] solution(int num, int total) {
        int start = (2 * total / num + 1 - num) / 2;
        int[] answer = new int[num];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = start + i;
        }
        return answer;
    }
}