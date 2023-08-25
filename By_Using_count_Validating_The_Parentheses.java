class Solution {
    public boolean isValid(String s) {
        int cir_r=0,cir_l=0,sqr_r=0,sqr_l=0,cur_r=0,cur_l=0;
        for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('){
                    cir_r++;
                }
                else if(s.charAt(i)==')'){
                    cir_l++;
                }
                else if(s.charAt(i)=='['){
                    sqr_r++;
                }
                else if(s.charAt(i)==']'){
                    sqr_l++;
                }
                else if(s.charAt(i)=='{'){
                    cur_r++;
                }
                else if(s.charAt(i)=='}'){
                    cur_l++;
                }
        }
        if(cir_l==cir_r){
            if(sqr_r==sqr_l){
                if(cur_l==cur_r){
                    return true;
                }
            }
        }
        return false;
    }
}
