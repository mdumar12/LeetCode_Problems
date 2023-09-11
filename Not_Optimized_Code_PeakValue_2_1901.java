package com.Arrays.Problems;

import java. util.Arrays;
//This code is solved by using brute force.
public class PeakValue_2_1901 {

	public static void main(String[] args) {
				
				int mat[][]= {{48,36,35,17,48},{38,28,38,26,24},{15,9,33,32,6},{49,4,8,10,41}};
		        int[] res=new int[2];
            //Constant of an Array which will return the least number that is -214368748 and it is in Integer Class of java. lang.Integer package.
		        int max=Integer.MIN_VALUE;
		        int row_ind=-1,clm_ind=-1;
    //If mat[] null then print null, it will not go to the next value, it will directly terminate the code.
				if(mat==null){
                    System.out.println("null");
                }else {
          //Logic to find a maximum element from a 2D array.
		        for(int i=0;i<mat.length;i++){
		            for(int j=0;j<mat[i].length;j++){
		                if(max<mat[i][j]){
		                    max=mat[i][j]; 
		                    row_ind=i;
		                    clm_ind=j;
		                }
		            }
		        }
            //It will give the upper value of the max.
		        int up_clm=((row_ind+1)-1>0) ? mat[(row_ind-1)][clm_ind] :-1;
          //It will give below the value of the max.
		        int dwn_clm=((row_ind+1)<mat.length) ? mat[row_ind+1][clm_ind] :-1;
          //It will give the value of the max.
		        int lft_row=((clm_ind+1)-1>0) ? mat[row_ind][(clm_ind-1)] :-1;
          //It will give the right side value of the max.
		        int rgt_row=((clm_ind+1)<mat[row_ind].length) ? mat[row_ind][clm_ind+1] :-1;
		        if(up_clm<max && dwn_clm<max && lft_row<max && rgt_row<max){
                //It will store index values of the max number in the 2d array.
		            res[0]=row_ind;
		            res[1]=clm_ind;
		        }
			    System.out.println(up_clm+" "+dwn_clm+" "+lft_row+" "+rgt_row);
		        }
		       System.out.println(Arrays.toString(res));
	}

}
