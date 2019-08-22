package com.bridgelabz.SortingAndSearching;

import com.bridgelabz.util.utility;

public class BinarySearch {
	

	public static void main(String[] args)
	{
		int sum=1;
		int number=utility.intscan();
		
		for(int i=0;i<number;i++)
		{
			sum=sum*2;
		}
		int number1=sum-1;
		System.out.println("Enter the key value:");
		int key=utility.intscan();
		
		utility.binary(key,0,number1,number);
	}
	
		
	}


