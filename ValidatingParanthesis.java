//Paranthesis Validation
public class ValidatingParanthesis
{
	public static void main(String[] args) {
	    String s="({[](){}})";
	    if(validatingCircle(s) && validatingSquare(s) && validatingCurly(s)){
	        System.out.println("true");
	    }else{
	        System.out.println("false");
	    }
	}
	public static boolean validatingCircle(String s){
	    int len=s.length()-1,incr=0,cnt=0;
        while(len>=0){
            System.out.println(s.charAt(len));
            switch(s.charAt(len)){
                case ')' :
                    incr++;
                    break;
                case '(':
                    System.out.println(s.charAt(len)+" "+cnt+" "+incr);
                    cnt++;
                    if(len<=0 && cnt!=incr){
                        return false;
                    }
            }
            len--;
        }
        return true;
	}
	public static boolean validatingSquare(String s){
	    int len=s.length()-1,incr=0,cnt=0;
        while(len>=0){
            switch(s.charAt(len)){
                case ']' :
                    incr++;
                    break;
                case '[':
                    while((len>=0) && (s.charAt(len--)=='[') && (cnt<=incr)){
                        cnt++;
                    }
                    if(cnt!=incr){
                        return false;
                    }
            }
            len--;
        }
        return true;
	}
	public static boolean validatingCurly(String s){
	    int len=s.length()-1,incr=0,cnt=0;
        while(len>=0){
            switch(s.charAt(len)){
                case '}' :
                    incr++;
                    break;
                case '{':
                    while((len>=0) && (s.charAt(len--)=='{') && (cnt<=incr)){
                        cnt++;
                    }
                    if(cnt!=incr){
                        return false;
                    }
            }
            len--;
        }
        return true;
	}
}

/*
//simple method using loop1 break, logic .
public static boolean validatingCircle(String s){
	    int len=s.length()-1,incr=0,cnt=0;
        loop1: while(len>=0){
            switch(s.charAt(len)){
                case ')' :
                    incr++;
                    break;
                case '(':
                    while((len>=0) && (s.charAt(len--)=='(') && (cnt<=incr)){
                        cnt++;
                    }
                    if(cnt!=incr){
                        break loop1;
                    }
                    else{
                        return true;
                    }
            }
            len--;
        }
        return false;
	}
*/
