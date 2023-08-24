class Solution {
    public int removeDuplicates(int[] nums) {
        int max=nums[nums.length-1];
        int len=nums.length-1;
        int k=0;
	    int count=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 || nums[nums.length-1]!=nums[nums.length-2]){
                k++;
            }
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                    if(count==1){
                        k++;
                    }
                    else{
                        nums[j]=nums[j]+nums[len];
                        nums[len]=nums[j]-nums[len];
                        nums[j]=nums[j]-nums[len];
                        len--;
                    }
                }
                else{
                    i=j-1;
                    count=0;
                    break;
                }
            }
        }
        for(int i=0;i<k;i++){
            for(int j=i+1;j<k;j++){
                if(nums[i]>nums[j]){
                    nums[j]=nums[j]+nums[i];
                    nums[i]=nums[j]-nums[i];
                    nums[j]=nums[j]-nums[i];
                }
            }
        }
        return k;
    }
}
