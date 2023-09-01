public class Array_Search_Element_In_Sorted_Using_Binary_Search
{
	public static void main(String[] args) {
	    int nums[]={1,2,3,4,5,6,7};
		int l=0,r=nums.length,k=4;
		int res=0;
        int mid=r/2;
        if(k>=nums[mid]){
            l=mid;    
        }else{
            r=mid;
        }
        for(int i=l;i<r;i++){
            if(nums[i]==k){
                res=i;
                break;
            }
        }
        System.out.print(res);
	}
}
