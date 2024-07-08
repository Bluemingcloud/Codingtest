class Solution {
        public int solution(String s) {
            int answer = 1;
            if(s.charAt(0) == '+' || s.charAt(0) == '-') {
                answer = s.charAt(0) == '+' ? 1 : -1;
                s = s.substring(1);                
            }
            
            return answer * Integer.parseInt(s);
        }
}