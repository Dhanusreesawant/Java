/******************************************************************************
 *  
 *  Purpose: calculate the harmonic number
 *
 *  @author  Dhanusree
 *  @version 1.0
 *  @since   09-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.conditionalloops;

import com.bridgelabz.util.utility;

public class Harmonic {

	public static void main(String[] args) 
	{
		
			double sum=0.0;
			double number=Double.parseDouble(args[0]);
			utility.harmonic(sum,number);
	}

}
