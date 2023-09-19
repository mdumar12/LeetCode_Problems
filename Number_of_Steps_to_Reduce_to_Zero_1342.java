
class Number_of_Steps_to_Reduce_to_Zero_1342 {
    //By using recursion.
    public int numberOfSteps(int num) {
        return stepsCount(num,0);
    }
    public static int stepsCount(int num,int ans){
        if(num==0){
            return ans;
        }else if(num%2==0){
            return stepsCount(num/2,ans+1);
        }else{
            return stepsCount(num-1,ans+1);
        }
    }
  /*
  -->Without using Recursion with basic while loop iterating upto num becomess zero.
  class Solution {
    public int numberOfSteps(int num) {
        int cnt=0;
         if(num==0){
            return 0;
        }
        while(num!=0){
            num=(num%2==0)?num/2:(num-1);
            cnt++;
        }
        return cnt;
    }
}
  */
}
