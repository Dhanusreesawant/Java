/******************************************************************************
 *  
 *  Purpose: calculate the monthly payments on car loan. 
 *
 *  @author  Dhanusree
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.util.utility;

public class CarLoan 
{
	public static void main(String args[]) 
	{
		double principle=Double.parseDouble(args[0]);
		double year=Double.parseDouble(args[1]);
		double rate=Double.parseDouble(args[2]);
		utility.carloan( principle, year, rate);	
	}


}
