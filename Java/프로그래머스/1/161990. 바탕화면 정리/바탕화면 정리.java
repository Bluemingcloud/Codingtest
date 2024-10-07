class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        boolean flag = true;
        for(int i = 0; i < wallpaper.length; i++) {
            if(wallpaper[i].contains("#") && flag) {
                answer[0] = i;
                answer[1] = wallpaper[i].indexOf("#");
                
                flag = false;
            }
            
            if(wallpaper[i].contains("#") && !flag) {
                answer[1] = Math.min(wallpaper[i].indexOf("#"), answer[1]);
                answer[2] = i + 1;
                answer[3] = Math.max(wallpaper[i].lastIndexOf("#") + 1, answer[3]);
            }
            
        }
        
        return answer;
    }
}