class Solution {
    boolean solution(String s) {
        int p = 0;
		int y = 0;
		char a;
		for(int i = 0; i<s.length(); i++){
			a = s.charAt(i);
			if(a == 'p' || a == 'P'){
				p++;
			}
			else if(a=='y' || a == 'Y'){
				y++;
			}
		}
		if(p == 0 && y==0){
			return true;
		}else if(p == y){
			return true;
		}else {
			return false;
		}
    }
}