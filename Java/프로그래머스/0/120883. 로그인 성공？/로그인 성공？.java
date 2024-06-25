class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        boolean flag = false;
        for(String[] arr : db) {
            
            if(id_pw[0].equals(arr[0])) {
                flag = false;
                if(id_pw[1].equals(arr[1])) {
                    return "login";
                } else {
                    flag = true;
                }
                
            }
            
        }
        if(flag) {
            return "wrong pw";
        } else {
            return "fail";    
        }
        
        
    }
}