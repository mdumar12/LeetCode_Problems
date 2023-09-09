class Solution {
    public int Single_Num_NotDuplicate_Num(int[] nums) {
    //It will give not a duplicate number.
    //This approach is a brute force.
    
    int res=0;
		Arrays.sort(nums);
		if(nums.length==1) {
			res=nums[0];
		}
		else {
			for(int i=1;i<nums.length;i++) {
				if(nums[i]==nums[i-1]) {
					if(++i==nums.length-1 && nums[i]!=nums[i-1]) {
						res=nums[i];
					}
				}
				else {
					res=nums[i-1];
				}
			}
	   }
	   return res;
	}
}
