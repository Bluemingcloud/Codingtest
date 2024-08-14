import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
    	
    	// 기사단은 1번부터 number 까지 번호가 지정
    	// 약수의 개수 만큼 공격력에 맞춰서 무기 구매
    	// 공격력(약수의 개수)이 limit 을 넘으면 power 로 무기 제한
    	// 공격력 당 1kg 철 소비시 철의 총 무게 계산
        int[] arr = new int[number + 1];
        Arrays.fill(arr, 2);
        arr[0] = 0;
        arr[1] = 1;
        int answer = arr[1];
        
        for(int i = 2; i < arr.length; i++) {
        	for(int j = 2; j <= Math.sqrt(i); j++) {
        		if(i % j == 0) {
        			arr[i] += 2;
        		}
        	}
            if((int)Math.sqrt(i) == Math.sqrt(i)) arr[i]--;
        	if(arr[i] > limit) arr[i] = power;
        	answer += arr[i];
        }
        
        return answer;
    }
}