package com.bridgelabz.staticfunctionsprograms;

import com.bridgelabz.util.utility;

public class MainMathFunction {

	public static void main(String[] args) 
	{
		MathFunction MinMax=new MathFunction();
		int n=utility.intscan();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=utility.intscan();
		}
		
			System.out.println("Max value:"+MinMax.max(arr,n));
			
			System.out.println("Min value:"+MinMax.min(arr,n));

	}

}
