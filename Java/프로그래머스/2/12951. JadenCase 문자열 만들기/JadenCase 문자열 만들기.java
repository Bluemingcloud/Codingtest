class Solution {
    public String solution(String s) {
        
        s = " " + s;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            if(s.charAt(i - 1) == ' ') {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        
        return sb.toString();
        
    }
    
}