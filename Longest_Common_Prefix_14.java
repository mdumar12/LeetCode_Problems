class Solution {
    public String longestCommonPrefix(String[] strs) {
        //finding minimum number of value string present in array.
        int minInd=0,strsLen=strs.length,len=Integer.MAX_VALUE;
        if(strsLen==1){
            return strs[minInd];
        }
        for(int i=0;i<strsLen;i++){
            //comparing and storing minInd index.
            if(len>=strs[i].length()){
                len=strs[i].length();
                minInd=i;
            }
        }
        //The minStr&minLen variable for memory management and reuseability 
        String minStrs=strs[minInd];
        //Length of the minimum element and cnt to get track by element last elemnt 
        //of an minStrs.
        int minLen=strs[minInd].length()-1,cnt=0;
        //temparory variable to store minimum length.
        int tempMinLen=minStrs.length();
        while(cnt!=tempMinLen){
            //to get track to get common prefix from an array.
            int resc=0;
            for(int i=0;i<strsLen;i++){
                //minInd is a minimum string elemnet in an array index.
                if(i!=minInd && (strs[i].substring(0,minLen+1)).equals(minStrs)){
                    //post-increment: means it will increment in next line.
                    resc++;
                }
            }
            //checking we got common longest common prefix then we will terminate an
            //while loop give string.
            if(resc==strs.length-1){
                return minStrs;
            }
            //it will store substring 0-(minLen-->Postincrement).
            minStrs=minStrs.substring(0,minLen--);
            //incrementing to get track of minimum string.
            cnt++;
        }
        //if nothing is exits then it will return empty string;
        return "";
    }
}
