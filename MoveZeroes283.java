class Solution {
    public void moveZeroes(int[] nums) {
        /*
        Runtime Complexity is optimized but not space Complexity.
        int len=nums.length;
        if(nums==null && len==1){
            return;
        }
        int insertPos=0;
        for(int val : nums){
            if(val!=0){
                nums[insertPos++]=val;
            }
        }
        while(insertPos<len){
            nums[insertPos++]=0;
        }
        ----------------------------------------
        */
        /*
        Output not in order, wrong approach:

        int len=nums.length;
        Arrays.sort(nums);
        int startInd=0,endInd=len-1,mid=(len+1)/2;
        while(startInd!=mid){
            int temp=nums[startInd];
            nums[startInd]=nums[endInd];
            nums[endInd]=temp;
            endInd--;
            startInd++;
        }
        System.out.println(Arrays.toString(nums));
        ----------------------------------------------
        */
        //Below code is Space optimized but not runtime optimized.
        int len=nums.length;
        if(nums==null && len==1){
            return;
        }else{
            int startInd=0;
            while(startInd<len){
                int nextInd=startInd+1;
                if(nums[startInd] == 0){
                    while(nextInd<len && nums[nextInd]==0){
                        nextInd++;
                    }
                    if(nextInd<len){
                        int temp=nums[startInd];
                        nums[startInd]=nums[nextInd];
                        nums[nextInd]=temp;
                    }
                }
                startInd++;
            }
        }
    }
}
