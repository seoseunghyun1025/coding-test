class Solution {
    public int solution(int[] box, int n) {
        int answer = 0, garo = 0, sero = 0, no = 0;
        garo = box[0] / n;
        sero = box[1] / n;
        no = box[2] / n;
        answer = garo * sero * no;
        return answer; 
    }
}