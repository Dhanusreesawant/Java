/******************************************************************************
 *  
 *  Purpose: solving quadratic equation using given formula.
 *
 *  @author  Dhanusree
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
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
