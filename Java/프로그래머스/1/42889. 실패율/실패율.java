import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        double[] arr = new double[N + 2];
        int total = stages.length;
        
        for(int s : stages) {
            arr[s]++;
        }
        
        Map<Integer, Double> map = new HashMap<>(); 
        for(int i = 1; i <= N; i++) {
            map.put(i, total > 0 ? arr[i] / total : 0);
            total -= arr[i];
        }
        
        return map.entrySet().stream()
            .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
            .mapToInt(Map.Entry::getKey)
            .toArray();
    }
}