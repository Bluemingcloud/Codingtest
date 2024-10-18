class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        if(s.equals("1")) {
            return new int[] {0, 0};
        }
        
        while(s.length() != 1) {
            StringBuilder sb = new StringBuilder();
            for(char ch : s.toCharArray()) {
                if(ch != '0') {
                    sb.append(ch);
                } else {
                    answer[1]++;
                }
            }
            int c = sb.length();
            StringBuilder result = new StringBuilder();
            while(c != 0) {
                result.append(c % 2);
                c /= 2;
            }
            s = result.reverse().toString();
            answer[0]++;
        }
        
        return answer;
    }
}