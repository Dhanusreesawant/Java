package com.bridgelabz.stringsregularexpressions;


import com.bridgelabz.util.utility;

public class Array2D {

	public static void main(String[] args)
	{
		int m =utility.intscan();
		int n=utility.intscan();
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
