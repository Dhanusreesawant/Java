package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.util.utility;

public class SpringSeason 
{
	public static void main(String args[])
	{
		int m,d;
		System.out.println("Enter the month and date:");
		m=utility.intscan();
		d=utility.intscan();
		utility.springseason(m, d);
		
	}

}
