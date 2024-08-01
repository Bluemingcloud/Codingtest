class Solution {
    public String solution(String s) {
        boolean check = s.length() % 2 == 0;
        if(check) {
            return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        } else {
            return String.valueOf(s.charAt(s.length() / 2));
        }
    }
}