class Solution {
    public int solution(String[] babbling) {
        
        int answer = 0;
        
        for(String bab : babbling) {
            String b = bab;
            if(b.contains("aya")) b = b.replace("aya", "1");
            if(b.contains("ye")) b = b.replace("ye", "2");
            if(b.contains("woo")) b = b.replace("woo", "3");
            if(b.contains("ma")) b = b.replace("ma", "4");
            
            if(b.contains("11")) continue;
            if(b.contains("22")) continue;
            if(b.contains("33")) continue;
            if(b.contains("44")) continue;
            try {
                Integer.parseInt(b);
                answer++;
            } catch(NumberFormatException e) {
            }
            
        }
        
        return answer;
    }
}