import java.util.*;
class Solution {
    public String solution(String polynomial) {
        
        int a = 0;
        int b = 0;
        StringTokenizer st = new StringTokenizer(polynomial.replace("+ ",""));
        while(st.hasMoreTokens()) {
            String temp = st.nextToken();
            System.out.println(temp);
            if(temp != null) {
                if(temp.contains("x")) {
                    if(temp.equals("x")) {
                        a++;
                    } else {
                        a += Integer.valueOf(temp.replace("x",""));    
                    }
                    
                } else {
                    b += Integer.parseInt(temp);
                }    
            }            
        }
        
        if(b == 0) {
            return a != 1 ? a + "x" : "x";
        } else if(a == 0) {
            return String.valueOf(b);
        } else if(a == 1) {
            return "x + " + b;  
        } else {
            return a + "x + " + b;
        }
        
    }
}