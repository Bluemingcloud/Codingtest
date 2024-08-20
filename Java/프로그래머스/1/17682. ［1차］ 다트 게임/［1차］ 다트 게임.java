import java.util.*;
class Solution {
    public int solution(String dartResult) {
        dartResult = dartResult.replace("10", "A");
        int[] dart = new int[3];
        int idx = -1;
        for(int i = 0; i < dartResult.length(); i++) {
            char d = dartResult.charAt(i);
            char temp = '0';
            switch(d) {
                case '*':
                    dart[idx] *= 2;
                    if(idx != 0) dart[idx - 1] *= 2;
                    break;
                case '#':
                    dart[idx] *= (-1);
                    break;
                case 'S':
                    break;
                case 'D':
                    dart[idx] *= dart[idx];
                    break;
                case 'T':
                    dart[idx] *= dart[idx] * dart[idx];
                    break;
                case 'A':
                    idx++;
                    dart[idx] = 10;
                    break;
                default:
                    idx++;
                    dart[idx] = Character.getNumericValue(d);
                    break;
                    
            }
           
        }
  
        return Arrays.stream(dart).sum();
    }
}