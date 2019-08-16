package com.bridgelabz.staticfunctionsprograms;

import com.bridgelabz.util.utility;

public class Slope {

	public static void main(String[] args) 
	{
		System.out.println("Enter the 2 points of  A:");
		int x1=utility.intscan();
		int y1=utility.intscan();
		System.out.println("Enter the 2 points of  B:");
		int x2=utility.intscan();
		int y2=utility.intscan();
		System.out.println("Enter the 2 points of  c:");
		int x3=utility.intscan();
		int y3=utility.intscan();
		System.out.println(utility.slope(x1, y1, x2, y2, x3, y3));
		
		
		


	}

}
