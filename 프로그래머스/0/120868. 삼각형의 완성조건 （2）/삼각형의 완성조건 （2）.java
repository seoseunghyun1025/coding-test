class Solution {
    public int solution(int[] sides) {
        // 두 변의 길이의 합보다 작고, 두 변의 차이보다 커야 한다.
        int sum = sides[0] + sides[1];
        int dif = Math.abs(sides[0] - sides[1]), answer = 0;
        System.out.print(sum + " " + dif);
        for(int i = dif + 1; i<sum; i++){
            answer++;
        }
        return answer;
    }
}