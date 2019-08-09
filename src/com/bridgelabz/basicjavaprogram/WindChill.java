/******************************************************************************
 *  
 *  Purpose: calculating windchill from temperature and speed using formula
 *
 *  @author  Dhanusree
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.util.utility;

public class WindChill 
{
		public static void main(String args[])
		{
			System.out.println("Enter the temperature and speed values:");
			double temperature=Double.parseDouble(args[0]);
			double speed=Double.parseDouble(args[1]);
			utility.windchill(temperature, speed);
			
			
		}
}
