class Solution {
    public int solution(int[] common) {
        return 2 * common[1] - common[0] == common[2] ? arith(common) : geo(common);
    }
    
    private int arith(int[] arr) {
        return 2 * arr[arr.length - 1] - arr[arr.length - 2];
    }
    
    private int geo(int[] arr) {
        return arr[arr.length - 1] * arr[arr.length - 1] / arr[arr.length - 2];
    } 
}