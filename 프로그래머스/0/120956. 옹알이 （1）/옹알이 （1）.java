class Solution {
    public int solution(String[] babblings) {
        int count = 0;
        String str ="";
        String[] cryArr = {"aya", "ye", "woo", "ma"};
        for (String babbling : babblings) {
            for (String cry : cryArr) {
                str = babbling.replace(cry, " ");
                babbling = str;
            }
            if(babbling.isBlank()){
                count++;
            }
        }
        return count;
    }
}