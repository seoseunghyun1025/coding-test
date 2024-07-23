import java.util.Arrays;
class Solution {
    public int solution(int[] arrays) {
        Arrays.sort(arrays);
        return arrays[arrays.length/2];
    }
}