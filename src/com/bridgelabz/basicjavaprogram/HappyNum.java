/******************************************************************************
 *  
 *  Purpose: check the happy number or not.
 *  
 *  @author  Dhanusree
 *  @version 1.0
 *  @since   09-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.basicjavaprogram;



public class HappyNum 
{
	public static int happyNumber(int number)
	{
		int sum=0;
		int rem=0;
		while(number>0)
		{
			rem=number%10;
			sum=sum+(rem*rem);
			number=number/10;
		}
		return sum;
		
		
	}
	

	public static void main(String[] args) 
	{
		int number=82;
		int result=number;
		
		while(number!=1)
		{
			result=happyNumber(result);
		}
		if(result==1)
		{
			System.out.println(number+"it is happy number");
		}
		else 
		{
			System.out.println(number+"it is not happy number");
		}
	
		
	}

}
