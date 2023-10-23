class RemoveElements27 {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
        // int cnt = 0, len = nums.length, endInd = len - 1;
		// if (len == 1 && nums[0] == val) {
		// 	cnt++;
		// 	nums= new int[0];
		// } else {
		// 	for (int ind = 0; ind < len; ind++) {
		// 		if (endInd < len && nums[ind] == val) {
		// 			cnt++;
		// 			while ((endInd>=0 && endInd<len) && nums[endInd] == val) {
		// 				endInd--;
		// 			} 
		// 			nums[ind] = nums[endInd];
        //             nums=new int[endInd+1];
        //             len=nums.length;
		// 		}
		// 	}
		// }
        // return len-cnt;
        //val=2
        //1,2,
        //int nums[]=[0,1,2,2,3,0,4,2];->len=8;
        /*int j=nums.length-1;//7,6,5,4
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                int temp=nums[i];
                if(nums[j]==val){
                    j--;//j-1
                }
                nums[i]=nums[j];
                nums[j]=temp;
                size++;
            }
            //0,1,4,0,3,
        }*/
        // int j=nums.length-2;
        // for(int i=0;i<nums.length;i++){
        //     if(i==j){
        //         if(nums[j]!=nums[j+1]){
        //             j++;
        //         }
        //         else if(nums[j-2]!=nums[j]){
        //             j--;
        //         }
        //         break;
        //     }
        //     if(nums[i]==val && nums[j]!=val){
        //         int temp=nums[i];
        //         nums[i]=nums[j];
        //         nums[j]=temp;
        //         j--;
        //     }
        // }
        // return j;
    }
}
