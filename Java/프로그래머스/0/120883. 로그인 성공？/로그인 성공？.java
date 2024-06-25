class Solution {
    public String solution(String[] id_pw, String[][] db) {

        for(String[] arr : db) {
            
            if(id_pw[0].equals(arr[0])) {

                if(id_pw[1].equals(arr[1])) {
                    return "login";
                }
                return "wrong pw";
            }
            
        }

        return "fail";    

        
        
    }
}