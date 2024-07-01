class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length]; 
        int i = 0;
        for(String q : quiz) {
            String[] arr = q.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);
            char c = arr[1].charAt(0);
            answer[i++] = calculate(a, b, c) == Integer.parseInt(arr[4]) ? "O" : "X";
            
        }
        
        
        return answer;
    }
    
    private int calculate(int a, int b, char c) {
        
        if(c == '+') {
            return a + b;
        } else {
            return a - b;
        }
        
    }
}