class Solution {
    public boolean isPalindrome(int x) {
        String str=String.valueOf(x);
       /* StringBuilder sb= new StringBuilder(str);
        StringBuilder rev=sb.reverse();
        String str1=rev.toString();
        boolean res=(str.equals(str1))?true:false;
        return res;*/
        //Solution -2 :-
        /*int len=str.length();
        int i=0;
        while(i<len/2){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                return false;
            }
            else{
                i++;
            }
        }
        return true;*/
        //Solution-3 :-
        if(x<0 || x!=0 && x%10 ==0 ) return false;
        int check=0;
        while(x>check){
            check = check*10 + x%10;
            x/=10;
        }
        return (x==check || x==check/10);
    }
}
