class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftPosition = 10;
        int rightPosition = 12;
        for(int num : numbers) {
            
            if(num == 1 || num == 4 || num == 7) answer += "L";
            else if(num == 3 || num == 6 || num == 9) answer += "R";
            else {
                if(num == 0) num = 11;
                int leftLength = Math.abs(leftPosition - num) / 3 + Math.abs(leftPosition - num) % 3;
                int rightLength = Math.abs(rightPosition - num) / 3 + Math.abs(rightPosition - num) % 3;
                
                if (leftLength > rightLength) answer += "R";
                else if (leftLength < rightLength) answer += "L";
                else answer += hand.equals("right") ? "R" : "L";
            }
            
            if(answer.charAt(answer.length() - 1) == 'R') rightPosition = num;
            else leftPosition = num;

        }
        return answer;
    }
}