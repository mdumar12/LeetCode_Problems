package com.Arrays.Umar;

import java. util.Arrays;
//Reverse array method's logic  is optimized away.
public class Sort_Rev_ArrayLogic {

	public static void main(String[] args) {
		int[] arr= {7,1,9,4,3,2};
		System.out.println("Orginal Array : "+Arrays.toString(arr));
		int j=arr.length-1;
		for(int i=0;i<=arr.length;i++) {
			while(i<j) {
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				j--;
			}
			j=arr.length-1;
		}
		System.out.println("Sorted Array:"+Arrays.toString(arr));
		System.out.println("Array in Reversed order : "+Arrays.toString(rev_array(arr)));
	}
  //we can reverse the array by using the rev_array method.
	public static int[] rev_array(int[] arr) {
		int len=arr.length-1;
		for(int i=0;i<=len;i++) {
			if(arr[i]!=arr[len]) {
				int temp=arr[len];
				arr[len--]=arr[i];
				arr[i]=temp;
			}
		}
		return arr;
	}

}
