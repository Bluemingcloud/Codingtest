class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == ' ') continue;
            char c = Character.isUpperCase(arr[i]) ? 'A' : 'a';
            arr[i] = (char)((arr[i] + n - c) % 26 + c);
        }
        return new String(arr);
        
    }
}