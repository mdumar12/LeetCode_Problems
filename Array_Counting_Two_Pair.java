public class Counting_Two_Pair
{
	public static void main(String[] args) {
	    int nums[]={1,1,1,2,2,3};
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
                }
                else{
                    i=j-1;
                    count=0;
                    break;
                }
            }
        }
		System.out.println(k);
	}
}
