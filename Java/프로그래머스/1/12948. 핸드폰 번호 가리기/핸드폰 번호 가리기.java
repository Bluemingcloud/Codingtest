class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < phone_number.length(); i++) {
            sb.append("*");
        }
        String subNum = phone_number.substring(phone_number.length() - 4);
        
        
        return sb.replace(phone_number.length() - 4, phone_number.length(), subNum).toString();
    }
}