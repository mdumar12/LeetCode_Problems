class Solution {
    public int[] twoSum(int[] nums, int target) {
        int diff=0,ind1=0,ind2=0;
        int res[]={1,2};
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length){
                diff=nums[i]-target;
                if(Math.abs(diff)==nums[i+1]){
                    res[0]=i;
                    res[1]=i+1;
                    break;
                }
            }
        }
        return res;     
    }
}
