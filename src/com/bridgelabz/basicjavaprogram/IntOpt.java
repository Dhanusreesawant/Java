package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.util.utility;

public class IntOpt 
{
	public static void main(String args[])
	{
		int a,b,c;
		System.out.println("Enter the value of A:");
		a=utility.intscan();
		System.out.println("Enter the value of B:");
		b=utility.intscan();
		System.out.println("Enter the value of c:");
		c=utility.intscan();
		utility.intopt(a, b, c);
	}
	
	

}
