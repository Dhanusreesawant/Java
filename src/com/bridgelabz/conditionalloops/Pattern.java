/******************************************************************************
 *  
 *  Purpose: print pattern as pyramid
 *
 *  @author  Dhanusree
 *  @version 1.0
 *  @since   09-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.conditionalloops;

public class Pattern {

	public static void main(String[] args) {
		int n=5,c=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n+i;j++)
			{
				if(j<(n-1)-i)
				{
					System.out.print(" ");
				}
				else
				{
					
		            System.out.print("*");
				}
				
			}
			System.out.println(" ");
		}
		
	}

	
}
