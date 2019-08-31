package com.bridgelabz.stringsregularexpressions;


import com.bridgelabz.util.utility;

public class Array2D {

	public static void main(String[] args)
	{
		System.out.println("enter the no of rows: ");
		int m =utility.intscan();
		System.out.println("enter the no of columns: ");
		int n=utility.intscan();
		System.out.println("enter the "+m*n+" elements:");
		int[][] arr=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=utility.intscan();
				
				
			}
		}
	
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	
		

	}

}
