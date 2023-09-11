class FindPeakElement_162 {
    public int findPeakElement(int[] nums) {
        /*int max_ind=0;
        //If the length of an array is 0 then return max_ind.
        if(nums.length-1==max_ind){
            return max_ind;
        }
        //Finding max_ind from an Array.
        for(int i=0;i<nums.length;i++){
            //By using ternary operator we can reduce len of code or else we can write if in one
            //line.
            max_ind=(nums[max_ind]>nums[i])?max_ind:i;
        }
        //Finding the max_ind-1 && max_ind+1 should be >than< after that it will check values are
        //satisfying with the condition or not, if this condition is true then returns ma_ind.
        if(max_ind-1>=0 && max_ind+1<nums.length && nums[max_ind+1]<nums[max_ind] && nums[max_ind-1]<nums[max_ind]){
            return max_ind;
        }
        return max_ind;*/
        //Approach - 2: 
        if(nums.length== 1)
            return 0;
        int max= Integer.MIN_VALUE;
        int index= Integer.MIN_VALUE;
        System.out.println(max+" "+index);
        // Finding MAX element and INDEX
        for(int i= 0; i< nums.length; i++){
            if(max< nums[i]){
                max= nums[i];
                index = i;
            }
        }

        return index;
        /*Approach - 3: Not optimized according to space but time beats 100%.
        int n = nums.length;
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
        int start=1,end=n-2,mid=0;
        while(start<=end){
            mid = (start+end)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            if(nums[mid]>nums[mid+1]) end=mid-1;
            else start=mid+1;
        }
        return -1;
        */
    }
}
