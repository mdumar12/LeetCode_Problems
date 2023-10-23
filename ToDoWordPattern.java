class Solution {
    public boolean wordPattern(String pattern, String s) {
        String word[]=s.split(" ");
        int lenSp=pattern.length(),lenSs=word.length;
        if(lenSp!=lenSs){
            return false;
        }
        HashMap<Character,String> hm=new HashMap();
        for(int ind=0;ind<lenSp;ind++){
            char current_char=pattern.charAt(ind);
            if(hm.containsKey(current_char)){
                if( !( (hm.get(current_char).equals(word[ind]) )) ){
                    return false;
                }
            }else{
                if(hm.containsValue(word[ind])){
                    return false;
                }
                hm.put(current_char,word[ind]);
            }
        }
        return true;
        // String sp[]=pattern.split(""),ss[]=s.split(" ");
        // int lenSp=sp.length,lenSs=ss.length;
        // if(lenSp!=lenSs){
        //     return false;
        // }
        // HashMap<String,String> hm=new HashMap<>();
	    // for(int i=0;i<lenSp;i++){
        //     if(hm.isEmpty() || ( !(hm.containsKey(sp[i])) && !(hm.containsValue(ss[i])) ) ){
        //         hm.put(sp[i],ss[i]);
        //     }else if( (hm.containsKey(sp[i]) && !(hm.containsValue(ss[i]))) || (!(hm.containsKey(sp[i])) && (hm.containsValue(ss[i]))) ){
        //         return false;
        //     }
        // }
        // return true;
        // HashMap<Integer,Character> hm=new HashMap<>();
        // for(int i=0;i<patterns.length();i++){
        //     if(  hm==null 
        //       || !(hm.contains(patterns.charAt(i))) && !() 
        //       || (ind+1)<lenSp && !( !(sp[ind].equals(sp[ind+1])) && !(ss[ind].equals(ss[ind+1])) 
        //       || (sp[ind].equals(sp[ind+1])) && (ss[ind].equals(ss[ind+1])))){
        //         hm.put(patterns.charAt(i));
        //     }else{
        //         return false;
        //     }
        // }
        //  String sp[]=pattern.split(""),ss[]=s.split(" ");
        // int lenSp=sp.length,lenSs=ss.length;
        // if(lenSp!=lenSs){
        //     return false;
        // }
        // Arrays.sort(sp);
        // Arrays.sort(ss);
        // System.out.println(Arrays.toString(sp)+"\n"+Arrays.toString(ss));
        // for(int ind=0;ind<lenSp;ind++){
        //     System.out.println( (ind+1) +" "+ ((ind+1)<lenSp) );
        //     if( (ind+1)<lenSp && !( !(sp[ind].equals(sp[ind+1])) && !(ss[ind].equals(ss[ind+1])) || (sp[ind].equals(sp[ind+1])) && (ss[ind].equals(ss[ind+1]))) ){
        //         return false;
        //     }
        // }
        // return true;
    }
}
