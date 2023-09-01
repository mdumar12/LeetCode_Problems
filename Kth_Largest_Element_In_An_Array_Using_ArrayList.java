/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		int nums[]= {3,2,3,1,2,4,5,5,6};
		int k=3;
		//intialising length,decreenting k to keep track of kth element or not and 
        //max is a varaible which stores kth element from an Array.
        ArrayList<Integer> aL=Arrays.stream(nums).boxed().
        		collect(Collectors.toCollection(ArrayList::new));
        int len=nums.length,max=0,ind=0;
        
        //It will check whether two is 
        if(k<=len){
            while(k>=1){
                max=aL.get(aL.size()-1);
                ind=aL.size()-1;
                for(int i=aL.size()-2;i>=0;i--){
                    if(aL.get(i)>max){
                        max=aL.get(i);
                        ind=i;
                    }
                }
                aL.remove(ind);
                k--;
            }
        }
        System.out.print(max);
	}
}
