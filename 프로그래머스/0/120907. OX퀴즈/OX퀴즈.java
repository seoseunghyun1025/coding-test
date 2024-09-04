class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int dap = 0;
        for(int i = 0; i<quiz.length; i++){
            String[] arr = quiz[i].split(" ");
            if(arr[1].equals("+")){
                dap = Integer.valueOf(arr[0]) + Integer.valueOf(arr[2]);
                if(String.valueOf(dap).equals(arr[4])){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }else if(arr[1].equals("-")){
                dap = Integer.valueOf(arr[0]) - Integer.valueOf(arr[2]);
                if(String.valueOf(dap).equals(arr[4])){
                    answer[i] = "O";
                }else{
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}