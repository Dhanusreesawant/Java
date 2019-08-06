package com.bridgelabz.basicjavaprogram;



import com.bridgelabz.util.utility;

public class Doubleopt {
	public static void main(String args[])
	{
		double a,b,c;
		System.out.println("Enter the value of A:");
		a=utility.doublescan();
		System.out.println("Enter the value of B:");
		b=utility.doublescan();
		System.out.println("Enter the value of c:");
		c=utility.doublescan();
		utility.doubleopt(a, b, c);
	}

}
