import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        boolean[] num = new boolean[201];
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(!num[(numbers[i] + numbers[j])]) num[(numbers[i] + numbers[j])] = true;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < num.length; i++) {
            if(num[i]) list.add(i);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}