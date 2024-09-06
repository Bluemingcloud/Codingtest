class Solution {
    public String solution(String[] survey, int[] choices) {
        char[] answer = new char[4];
        int[] result = new int[4]; // RT, CF, JM, AN 기준
        
        int p = 1;
        for(int i = 0; i < survey.length; i++) {
            char type = survey[i].charAt(0);
            if(type == 'T' || type == 'F' || type == 'M' || type == 'N') {
                p = -1;
            } else {
                p = 1;
            }
            
            if(type == 'R' || type == 'T') {
                result[0] += (choices[i] - 4) * p;
            }
            if(type == 'C' || type == 'F') {
                result[1] += (choices[i] - 4) * p;
            }
            if(type == 'J' || type == 'M') {
                result[2] += (choices[i] - 4) * p;
            }
            if(type == 'A' || type == 'N') {
                result[3] += (choices[i] - 4) * p;
            }
        }
        
        answer[0] = result[0] <= 0 ? 'R' : 'T';
        answer[1] = result[1] <= 0 ? 'C' : 'F';
        answer[2] = result[2] <= 0 ? 'J' : 'M';
        answer[3] = result[3] <= 0 ? 'A' : 'N';
        
        return new String(answer);
    }
}