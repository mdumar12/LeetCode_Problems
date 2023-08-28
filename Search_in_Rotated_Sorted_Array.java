//Problem 33(Medium).
//It is not an optimized code.
class Solution {
    public int search(int[] nums, int target) {
        int pivot_index=0;
		for(int i=0;i<=nums.length/2-1;i++) {
			pivot_index+=nums[i];
		}
		int count=1;
        if(pivot_index<1){
        for(int i=pivot_index;i<nums.length;i++){
            for(int j=i;j>=count;j--){
                if((j-1)>=0 && (j-1)<=0){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
            count++;
        }
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]==target){
                return k;
            }
        }
        return -1;
    }
}
