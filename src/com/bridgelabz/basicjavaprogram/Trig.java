/******************************************************************************
 *  
 *  Purpose: solving trignomentry 
 *
 *  @author  Dhanusree
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.util.utility;

public class Trig {

	public static void main(String[] args) 
	{
		double degrees=Double.parseDouble(args[0]);
		double radians=Math.toRadians(degrees);
		utility.trignomentry(radians);

	}

}
