class Solution { 
    public int[] intersect(int[] nums1, int[] nums2) {
    /*
        ---------------Worst Case-----------------------------------------
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        List<Integer> ls=new ArrayList<Integer>();
        for(int i:nums1){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }

        for(int i:nums2){
            if(hm.containsKey(i) && hm.get(i)>0){
                hm.put(i,hm.get(i)-1);
                ls.add(i);
            }
        }
        int[] arr=ls.stream().mapToInt(i->i).toArray();
        return arr;
        */
        /*
        -------------------------------------------------------
        It is not optimized but logic is different.
        List<Integer> ls=new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,nums1Len=nums1.length,nums2Len=nums2.length;
        while(i<nums1Len && j<nums2Len){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                ls.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] arr=ls.stream().mapToInt(k->k).toArray();
        return arr;
        *
        --------------------------------------------------------------------------/
        //We can approach the solution by using ArrayList<Integer> for 3rd follow up.
        /*
        We can use for loop to go through it by finding minimum and maximum by comparing
        length of two arrays for 2nd follow up.
        /*
        /*
        Even if it sorted or not sorted it will not consider because, we will iterate 
        from first to last.
        Time Complexity  : O(n*n ).
        Space Complexity : O(n).
        */ 
        /*
        ---------------------------------------------------------
        -------Self Coded----
        */
        List<Integer> ls=new ArrayList<Integer>();
        int nums1Len=nums1.length,nums2Len=nums2.length;
        int[] min=(nums1Len<=nums2Len)?nums1:nums2;
        int[] max=(nums1Len>nums2Len)?nums1:nums2;
        for(int i=0;i<max.length;i++){
            int cnt=0,str=0;
            for(int j=0;j<min.length;j++){
                if(max[i]==min[j]){
                    str=min[j];
                    max[i]=Integer.MAX_VALUE;
                    min[j]=Integer.MIN_VALUE;
                    cnt++;
                }
            }
            if(cnt>0){
                ls.add(str);
            }
        }
        //Best Memory Management :
        int[] arr=ls.stream().mapToInt(i->i).toArray();
        /*int[] arr=new int[ls.size()];
        //arr=ls.toArray();--> We can not directly pass primitive type to object.
        for(int i=0;i<ls.size();i++){
            arr[i]=ls.get(i);
        }*/
        return arr;
    }
}
