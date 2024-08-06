class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int leng = p.length();
        long pNum = Long.parseLong(p);
        
        if(leng == t.length()) return Long.parseLong(t) <= pNum ? 1 : 0;
        
        for(int i = 0; i <= t.length() - leng; i++) {
            long tNum = Long.parseLong(t.substring(i,i + leng));
            if(pNum >= tNum) answer++;
        }
        return answer;
    }
}