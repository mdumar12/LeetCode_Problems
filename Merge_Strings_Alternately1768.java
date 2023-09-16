class Merge_Strings_Alternately1768{
    public static String mergeAlternately(String word1, String word2) {
        /*String res="";
        String max=(word1.length()>=word2.length())?word1:word2;
        String min=(word1.length()<word2.length())?word1:word2;
        for(int i=0;i<min.length();i++){
            res+=word1.charAt(i)+""+word2.charAt(i)+"";
        }
        res+=max.substring(min.length());
        return res;*/
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder merged = new StringBuilder();
        
        int i = 0, j = 0;
        
        while (i < len1 || j < len2) {
            if (i < len1) {
                merged.append(word1.charAt(i));
                i++;
            }
            
            if (j < len2) {
                merged.append(word2.charAt(j));
                j++;
            }
        }
        
        return merged.toString();
    }
}
