package com.Arrays.Problems;

import java.util.Arrays;

public class KthSmallestNum {

	@SuppressWarnings("unused")
	public static void main(String[] args)  {
		int arr[]= {10,2,5,1,3,11},k=arr.length-4,count=0,len=arr.length,min=Integer.MAX_VALUE;
		try {
			int a=arr[k];
		if(arr==null) {
			System.out.println("null");
		}else {
		while(k>=count) {
			min=Integer.MAX_VALUE;
			int ind=0;
			for(int i=0;i<len;i++) {
				if(min>arr[i]) {
					min=arr[i];
					ind=i;
				}
			}
			arr[ind]=Integer.MAX_VALUE;
			System.out.println(Arrays.toString(arr));
			count++;
		}
		System.out.println(min);
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Entered element to find smallest value :"+ k +"\nIndex element should be less than or equal to : "+(arr.length-1));
		}

	}

}
