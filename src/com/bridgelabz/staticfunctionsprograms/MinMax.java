package com.bridgelabz.staticfunctionsprograms;

import com.bridgelabz.util.utility;

public class MinMax {

	public static void main(String[] args) {
		int n=utility.intscan();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=utility.intscan();
		}
		
			System.out.println("Max value:"+utility.max(arr,n));
			
			System.out.println("Min value:"+utility.min(arr,n));

	}

}
