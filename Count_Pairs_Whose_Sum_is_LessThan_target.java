class Solution {
  /*Problem Number : 2824*/
    public int countPairs(List<Integer> nums, int target) {
        int cnt=0,l=nums.size();
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if((nums.get(i)+nums.get(j))<target){
                    cnt++;
                }
            }
        }
        return cnt;
        /*Collections.sort(nums);
           int start =0;
           int end = nums.size()-1,count =0;
           while(start<end){
                  if((nums.get(start)+nums.get(end)) < target){
                      count = count+(end-start);
                       start++;
                  }else{
                      end--;
                  }
           }
            return count;*/
        
    }
}
