class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        for(String b : babbling) {
            for(String w : words) {
                b = b.replaceFirst(w, " ");
            }
            b = b.replaceAll(" ", "");
            if(b.length() == 0) answer++;
        }
        return answer;
    }
}