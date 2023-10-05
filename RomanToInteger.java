//Optimized solution.
//Time Complexity : O(n)
//Space Complexity : o(n)
class RomanToInteger {
    public int romanToInt(String s) {
        int ans=0,num=0;
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I': num=1; break;
                case 'V': num=5; break;
                case 'X': num=10; break;
                case 'L': num=50; break;
                case 'C': num=100; break;
                case 'D': num=500; break;
                case 'M': num=1000; break;            
            }
            if(4*num<ans) ans-=num;
            else ans+=num;   
        }
        return ans;
    }
}
/*
This is also optimized but only for time complexity, not space complexity.
class RomanToInteger {
    public int romanToInt(String s) {
        int ans=0,num=0,prev =0;;
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I'-> num=1; 
                case 'V'-> num=5; 
                case 'X'-> num=10; 
                case 'L'-> num=50; 
                case 'C'-> num=100; 
                case 'D'-> num=500; 
                case 'M'-> num=1000;             
            }
            if (num >= prev) {
                ans += num;
            }else {
                ans -= num;
            }
                prev=num;
        }   
        return ans;
    }
}

*/


/*
==>It is not an optimal solution.
==> The approach is based on brute force.
==> Time Complexity  : O(log n)
==> Space Complexity : O(n)
class RomanToInteger {
    public int romanToInt(String s) {
        int num=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch(ch){
                case 'I':
                    if(i+1<s.length() && s.charAt(i+1)=='X'){
                        num+=9;
                        i++;
                    }
                    else if(i+1<s.length() && s.charAt(i+1)=='V'){
                        num+=4;
                        i++;
                    }
                    else if(i+1<s.length() && s.charAt(i+1)=='L'){
                        num+=49;
                        i++;
                    }
                    else if(i+1<s.length() && s.charAt(i+1)=='C'){
                        num+=99;
                        i++;
                    }
                    else if(i+1<s.length() && s.charAt(i+1)=='D'){
                        num+=499;
                        i++;
                    }
                    else if(i+1<s.length() && s.charAt(i+1)=='M'){
                        num+=999;
                        i++;
                    }
                    else{
                        num+=1;
                    }
                    break;
                case 'V':
                    num+=5;
                    break;
                case 'X':
                    if(i+1<s.length() && s.charAt(i+1)=='M'){
                        num+=900;
                        i++;
                    }
                    else if(i+1<s.length() && s.charAt(i+1)=='C'){
                        num+=90;
                        i++;
                    }
                    else if(i+1<s.length() && s.charAt(i+1)=='D'){
                        num+=490;
                        i++;
                    }
                    else if(i+1<s.length() && s.charAt(i+1)=='L'){
                        num+=40;
                        i++;
                    }
                    else{
                        num+=10;
                    }
                    break;
                case 'L':
                    if(i+1<s.length() && s.charAt(i+1)=='C'){
                        num+=50;
                        i++;
                    }
                    else if(i+1<s.length() && s.charAt(i+1)=='D'){
                        num+=450;
                        i++;
                    }
                    else if(i+1<s.length() && s.charAt(i+1)=='M'){
                        num+=950;
                        i++;
                    }
                    else{
                        num+=50;
                    }
                    break;
                case 'C':
                    if(i+1<s.length() && s.charAt(i+1)=='M'){
                        num+=900;
                        i++;
                    }
                    else if(i+1<s.length() && s.charAt(i+1)=='D'){
                        num+=400;
                        i++;
                    }
                    else{
                        num+=100;
                    }
                    break;
                case 'D':
                    num+=500;
                    break;
                case 'M':
                    num+=1000;
                    break;
            }
        }
        return num;
    }
}*/
