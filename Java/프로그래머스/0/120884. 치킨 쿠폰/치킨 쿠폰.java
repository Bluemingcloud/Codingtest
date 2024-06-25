class Solution {
    public int solution(int chicken) {
        int answer = 0;
        for(int i = chicken; i >= 10; i -= 10) {
            answer++;
            i++;
        }
        return answer;
    }
}