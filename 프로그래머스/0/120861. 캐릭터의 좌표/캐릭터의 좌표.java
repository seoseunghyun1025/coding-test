class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int upDown = 0, leftRig = 0, diviUpDo = board[1] / 2 , diviLeRi = board[0] / 2;
        for(int i = 0; i<keyinput.length; i++){
            if(keyinput[i].equals("left")){
                if(leftRig <= diviLeRi * -1){
                    continue;
                }else{
                    leftRig--;
                }
            }else if(keyinput[i].equals("right")){
                if(leftRig >= diviLeRi){
                    continue;
                }else{
                    leftRig++;
                }
            }else if(keyinput[i].equals("up")){
                if(upDown >= diviUpDo){
                    continue;
                }else{
                    upDown++;
                }
            }else{
                if(upDown <= diviUpDo * -1){
                    System.out.println("네 번째 if문");
                    continue;
                }else{
                    System.out.println("네 번째 else문" + upDown);
                    upDown--;
                }
            }
            
        }
        answer[0] = leftRig;
        answer[1] = upDown;
        return answer;
    }
}