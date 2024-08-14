import java.util.*;
class Solution {
    
	int answer = 0;
	int[] visited;
	boolean[] prime;
	
	public int solution(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt() * 3;
        prime = new boolean[max + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        makePrime(max);
        
        visited = new int[nums.length];
        
        back(0, 0, 0, nums);

        return answer;
        
    }
	
	public void back(int d, int start, int sum, int[] nums) {
		
		if(d == 3) {
			answer += prime[sum] ? 1 : 0;
			return;
		}
		
		for(int i = start; i < nums.length; i++) {
			if(visited[i] == 0) {
				visited[i] = 1;
				back(d + 1, i + 1, sum + nums[i], nums);
				visited[i] = 0;
			}
		}
		
	}
	
	
	public void makePrime(int max) {
		for(int i = 2; i <= Math.sqrt(max); i++) {
			if(prime[i]) {
                for(int j = i * i; j <= max; j += i) {
				    prime[j] = false;
			    }	
            }
		}
	}
}