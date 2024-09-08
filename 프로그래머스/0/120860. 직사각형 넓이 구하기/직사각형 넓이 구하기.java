class Solution {
    public int solution(int[][] dots) {
        int answer = 0, maxX = dots[0][0], maxY = dots[0][1], minX = dots[0][0], minY = dots[0][1];
        for(int i = 0; i<dots.length; i++){
            if(maxX < dots[i][0]){
                maxX = dots[i][0];
            }
            if(minX > dots[i][0]){
                minX = dots[i][0];
            }
            if(maxY < dots[i][1]){
                maxY = dots[i][1];
            }
            if(minY > dots[i][1]){
                minY = dots[i][1];
            }
            System.out.println("값: " + maxX + " " + maxY + " " + minX + " " + minY);
        }
        answer = (maxX - minX) * (maxY - minY);
        return answer;
    }
}