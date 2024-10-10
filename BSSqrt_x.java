/*
Optimized code.

*/
class BSSqrt_x {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int f=1,l=x;
        while(f<=l){
            int mid=f+(l-f)/2;
            if(mid==x/mid){
                return mid;
            }else if(mid>x/mid){
                l=mid-1;
            }else
            {
                f=mid+1;
            }
        }
        return l;
    }
  /*
  Flow:-
      * int cnt=0,sub=1;
      * x-=sub;
      * sub<=x
      * cnt is the square root of the number.
  Partially optimized code.
  int cnt=0,sub=1;
        while(sub<=x){
            x-=sub;
            sub+=2;
            cnt++;
        }
        return cnt;
  */
  /*
  return (int)Math.pow(x,0.5)
  */
}
