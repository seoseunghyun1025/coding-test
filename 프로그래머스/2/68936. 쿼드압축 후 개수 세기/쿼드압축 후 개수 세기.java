class Solution {
    static int wCnt;
    static int bCnt;
    static int[][] arr; 
    
    public int[] solution(int[][] inputArr) {
        arr = inputArr;
        wCnt = 0;
        bCnt = 0;
        int n = arr.length;
        재귀함수(0, 0 , n);
        int[] answer = {wCnt, bCnt};
        return answer;
    }
    
    static void 재귀함수(int x, int y, int size){
        int color = arr[x][y];
        boolean a = check(x, y, size);
        if(a == true){
            if(color == 0) wCnt++;
            else bCnt++;
        }else{
            size /= 2;
            재귀함수(x, y, size);
            재귀함수(x + size, y, size);
            재귀함수(x, y + size, size);
            재귀함수(x + size, y + size, size);
        }
    }
    
    static boolean check(int x, int y, int size){
        int color = arr[x][y];
        for(int i = x; i < x + size; i++){
            for(int j = y; j < y + size; j++){
                if(color != arr[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    
}