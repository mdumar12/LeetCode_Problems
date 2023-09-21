class Median_Of_Two_Arrays_4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //This is not an optimal solution
        /*
          Brute Force :
            Time Complexity:-  
            Space Complexity:- 
        */
        int nLen1=nums1.length,nLen2=nums2.length;
        int merge[]=new int[nLen1+nLen2];
        int len=merge.length;
        for(int i=0;i<nLen1;i++){
            merge[i]=nums1[i];
        }
        int count=0;
        for(int j=nLen1;j<len;j++){
            merge[j]=nums2[count++];
        }
        Arrays.sort(merge);
        if(len%2==0){
            return ((double) merge[(len/2-1)]+merge[len/2])/2;
        }
        return merge[len/2];
    }
  /* Method for sorting an array but it is not an optimal solution.
  public static void sortArray(int[] merge,int len){
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(merge[i]>merge[j]){
                    int temp=merge[i];
                    merge[i]=merge[j];
                    merge[j]=temp;
                }
            }
        }
    }
  */
}
