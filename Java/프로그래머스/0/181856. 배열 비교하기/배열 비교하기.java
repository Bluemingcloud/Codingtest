class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        if(arr1.length > arr2.length) {
            return 1;
        }
        if(arr1.length < arr2.length) {
            return -1;
        }
        if(sumArr(arr1) > sumArr(arr2)) {
            return 1;
        }
        if(sumArr(arr1) < sumArr(arr2)) {
            return -1;
        }
        return 0;
    }
    
    private int sumArr(int[] arr) {
        int sum = 0;
        for(int a : arr) {
            sum += a;
        }
        return sum;
    }
}
