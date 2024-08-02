class Solution {
    long[] arr = new long[501];
    int idx = 0;
    public int solution(int num) {
        
        arr[0] = num;
        return collatz();
    }
    
    public int collatz() {
        if(arr[idx] == 1) return idx;
        if(idx == 500) return -1;
        idx++;
        arr[idx] = arr[idx - 1] % 2 == 0 ? arr[idx - 1] / 2 : arr[idx - 1] * 3 + 1;
        return collatz();
    }
}