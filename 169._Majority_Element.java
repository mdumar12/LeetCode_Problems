class Solution {
  //Brute force logic, I will try to do in a better way.
    public int majorityElement(int[] nums) {
        int m=0,i=0;
        for(int j=0;j<nums.length;j++){
            while(i<nums.length){
                if(nums[j]==nums[i]){
                    m++;
                }
                i++;
                if(m>=(nums.length-m)){
                i=nums[j];
                break;
                }
            }
            m=0;
            i=0;
        }
        return i;
      /*
      It is better than above logic.
      int m=0,res=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    m++;
                }
            }
            if(m>=(nums.length-m)){
                res=nums[i];
                break;
            }
            m=0;
        }
        return res;
      */
    }
}
