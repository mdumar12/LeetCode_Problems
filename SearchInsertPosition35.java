class Solution {
    public static int searchInsert(int[] nums, int target) {
        int mid=nums.length/2;
        while(mid!=nums.length && mid>=0){
            if(nums[mid]==target){
                return mid;
            }
            if(target>nums[mid]){
                if(mid==nums.length-1 ||mid+1<nums.length && target<=nums[mid+1]){
                  return mid+1;
                }
                mid++;
            }
            else{
                mid--;
            }
        }
        return 0;
    }
}
