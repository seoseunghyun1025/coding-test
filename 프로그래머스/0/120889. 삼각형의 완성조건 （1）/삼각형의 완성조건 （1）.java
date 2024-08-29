class Solution {
    public int solution(int[] sides) {
        int answer = 0, max = 0, maxIndex = 0;
        for(int i=0; i<sides.length; i++){
            if(max < sides[i]){
                max = sides[i];
                maxIndex = i;
            }
        }
        if(maxIndex == 0){
            System.out.println("maxIndex는 0");
            if(max < sides[1] + sides[2]){
                return 1;
            }else{
                return 2;
        }
        }else if(maxIndex == 1){
            System.out.println("maxIndex는 1");
            if(max < sides[0] + sides[2]){
                return 1;
            }else{
                return 2;
            }
        }else{
            System.out.println("maxIndex는 2");
            if(max < sides[1] + sides[0]){
                return 1;
            }else{
                return 2;
        }
        }
    }
}