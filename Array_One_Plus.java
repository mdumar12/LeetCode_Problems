import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
		String num="";
		for(int i=0;i<digits.length;i++) {
			num+=digits[i]+"";
		}
		String str="1";
		BigInteger new_res=new BigInteger(str);
		BigInteger res=new BigInteger(num);
		res=res.add(new_res);
		String num1=res+"";
		int new_arr[]=new int[num1.length()];
		for(int i=0;i<num1.length();i++) {
			if(i+1<num1.length()){
				new_arr[i]=Integer.parseInt(num1.substring(i,i+1));
			}
		}
		new_arr[num1.length()-1]=Integer.parseInt(num1.substring(num1.length()-1));
		return new_arr;
    }
}
