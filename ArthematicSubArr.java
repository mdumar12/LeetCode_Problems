class ArthematicSubArr {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> al=new ArrayList<>();
        int travM=0,len=l.length;
        while(travM<len){
            int subArr[]=Arrays.copyOfRange(nums, l[travM], r[travM]+1);
            Arrays.sort(subArr);
            if(subArr.length<3){
                al.add(true);
            }else{
                for(int i = 0 ;i+2 < subArr.length ; i++){
                    if( (subArr[i]-subArr[i+1]) != (subArr[i+1]-subArr[i+2]) ){
                        al.add(false);
                        break;
                    }else if(i+2 == subArr.length-1){
                        al.add(true);
                    }
                }
            }
            travM++;
        }  
        return al;
  }

  //It can be improved.
    // public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
    //     List<Boolean> al=new ArrayList<>();
    //     int travM=0,len=l.length;
    //     while(travM<len){
    //         int subArr[]=Arrays.copyOfRange(nums, l[travM], r[travM]+1);
    //         Arrays.sort(subArr);
    //         for(int i = 0 ;(subArr.length<3) ? (i+1 < subArr.length) : (i+2 < subArr.length) ; i++){
    //             if(subArr.length>=3){
    //                 if( (subArr[i]-subArr[i+1]) != (subArr[i+1]-subArr[i+2]) ){
    //                     al.add(false);
    //                     break;
    //                 }else if(i+2 == subArr.length-1){
    //                     al.add(true);
    //                 }
    //             }else{
    //                 al.add(true);
    //                 break;
    //             }
    //         }
    //         travM++;
    //     }
    //     return al;
    // }
}
