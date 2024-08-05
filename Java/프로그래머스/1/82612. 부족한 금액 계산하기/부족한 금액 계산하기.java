class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long check = 0;
        for(int i = 1; i <= count; i++) {
            check += i * price; 
        }
        if(check <= money) return 0;
        return check - money;
    }
}