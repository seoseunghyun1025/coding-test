class Solution {
    public int[][] solution(int[] num_list, int n) {
        int list = 0;
        list = num_list.length / n;
        int[][] answer = new int[list][n];
        for(int i=0; i<num_list.length; i++){
            answer[i/n][i%n] = num_list[i]; 
        }
        return answer;
    }
}