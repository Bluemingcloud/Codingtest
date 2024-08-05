class Solution {
    public boolean solution(String s) {
        return (s.length() == 4 || s.length() == 6) && s.replaceAll("[a-zA-Z]", "").length() == s.length();
    }
}