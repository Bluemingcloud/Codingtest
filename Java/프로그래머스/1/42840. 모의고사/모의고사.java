import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
    	int[] score = new int[3];
    	int[] case1 = {1, 2, 3, 4, 5};
    	int[] case2 = {2, 1, 2, 3, 2, 4, 2, 5};
    	int[] case3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    	
    	for(int i = 0; i < answers.length; i++) {
    		if(answers[i] == case1[i % 5]) score[0]++;
    		if(answers[i] == case2[i % 8]) score[1]++;
    		if(answers[i] == case3[i % 10]) score[2]++;
    	}
    	
    	int max = Arrays.stream(score).max().getAsInt();
    	
    	int[] answer = new int[3];
    	for(int i = 0; i < 3; i++) {
    		if(score[i] == max) answer[i] = i + 1;
    	}
    	
    	return Arrays.stream(answer).filter(i -> i != 0).toArray();
    }
}