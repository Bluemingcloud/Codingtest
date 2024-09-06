import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        Map<String, Integer> attr = new HashMap<>();
        attr.put("code", 0);
        attr.put("date", 1);
        attr.put("maximum", 2);
        attr.put("remain", 3);
        
        for(int[] item : data) {
            if(item[attr.get(ext)] < val_ext) {
                list.add(item);
            }
        }
        
        
        return list.stream().sorted((a, b) -> a[attr.get(sort_by)] - b[attr.get(sort_by)]).toArray(int[][]::new);
        
                    
        
        
    }
}