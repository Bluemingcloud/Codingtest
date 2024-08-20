class Solution {
    public int solution(String s) {
        int answer = 0;

        while(!s.equals("")) {
            int idx = 0;
            int t = 0;
            int f = 0;
            char c = s.charAt(idx);
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == c) {
                    t++;
                } else {
                    f++;
                }
                
                if(t == f) {
                    t = 0;
                    f = 0;
                    idx = i;
                    break;
                }
            }
            
            s = s.substring(idx + 1);
            answer++;
            if(t != f) break;
        }
        
        return answer;
    }
}