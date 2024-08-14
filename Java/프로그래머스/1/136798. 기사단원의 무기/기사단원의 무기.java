import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        int[] arr = new int[number + 1];
        
        for(int i = 1; i <= number; i++) {
        	for(int j = 1; j <= number / i; j++) {
        		arr[i * j]++;
        	}
        }
        
        int answer = 0;
        for(int a : arr) {
        	answer += a > limit ? power : a;
        }
        
        return answer;
    }
}