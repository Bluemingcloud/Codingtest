class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        
        int[] count = new int[10];
        int[] check = new int[10];
        
        for(int i = 0; i < X.length(); i++) {
            char c = X.charAt(i);
            count[c - '0']++;
        }
        
        for(int i = 0; i < Y.length(); i++) {
            char c = Y.charAt(i);
            if(count[c - '0'] != 0) {
                check[c - '0']++;
                count[c - '0']--;
            }
        }
        
        for(int i = 9; i >= 0; i--) {
            while(check[i]-- > 0) {
                answer.append(i);
            }
        }
        
        if(answer.length() == 0) return "-1";
        
        boolean flag = false;
        for(int i = 9; i > 0; i--) {
            if(answer.toString().contains(i + "")) {
                flag = true;
                break;
            }
        }
        
        return flag ? answer.toString() : "0";
    }
}