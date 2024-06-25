class Solution {
    public int solution(String A, String B) {
        boolean flag = false;
        for(int i = 0; i < A.length(); i++) {
            flag = false;
            for(int j = 0; j < B.length(); j++) {
                if(A.charAt(j) != B.charAt((j + i) % B.length())) {
                    flag = true;
                    break;
                }             
            }
            if(!flag) return i;            
            
        }
        return -1;
    }
}