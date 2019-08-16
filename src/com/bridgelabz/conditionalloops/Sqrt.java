/******************************************************************************
 *  
 *  Purpose: compute the square root of a nonnegative number
 *
 *  @author  Dhanusree
 *  @version 1.0
 *  @since   09-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.conditionalloops;

import com.bridgelabz.util.utility;

public class Sqrt {

	public static void main(String[] args) 
	{
		double c=Double.parseDouble(args[0]);
		double epilson=1.0e-15;
		System.out.println(utility.sqrt(c,epilson));
	}

}
