class Solution {
    public boolean solution(int x) {
        boolean answer = x % harshad(x) == 0;
        return answer;
    }
    public int harshad(int x) {
        int result = 0;
        while(x > 0) {
            result += x % 10;
            x /= 10;
        }
        return result;
    } 
}