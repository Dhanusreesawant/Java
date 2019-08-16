package com.bridgelabz.staticfunctionsprograms;

public class MathFunction extends MinMax {
	public static int max(int[] arr,int n) 
	{
		
		
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
			
		}
		return max;
		
	}
	public static int min(int[] arr,int n) 
	{
		
		int min=arr[0];
		for(int i=0;i<n;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			
		}
		return min;
		
	}
	

}
