package com.bridgelabz.conditionalloops;

public class Pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n+i;j++)
			{
				if(j<(n-1)-i)
					System.out.print(" ");
				else
					System.out.print("*");
				
			}
			System.out.println(" ");
		}
		System.out.print(" ");

	}

}
