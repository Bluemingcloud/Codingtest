import java.util.*;
public class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int a : arr) {
            if(a == list.get(list.size() - 1)) continue;
            list.add(a);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}