class Solution {
    public long solution(int price, int money, int count) {
        // 1 부터 count 까지 합 * price
        long answer = (long)price * (count * (count + 1) / 2) - money;
        return answer >= 0 ? answer : 0;
    }
}