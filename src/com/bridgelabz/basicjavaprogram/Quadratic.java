package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.util.utility;

public class Quadratic 
{
	public static void main(String args[])
	{
		double a,b,c;
		System.out.println("Enter the values of a,b,c:");
		a=utility.doublescan();
		b=utility.doublescan();
		c=utility.doublescan();
		utility.quadratic(a, b, c);
		
		
	}

}
