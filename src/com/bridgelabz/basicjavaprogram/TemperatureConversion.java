/******************************************************************************
 *  
 *  Purpose: convert the temperature fahrenheit to celcius and viceversa.
 *
 *  @author  Dhanusree
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.util.utility;

public class TemperatureConversion {
	public static void main(String args[])
	{
		System.out.println("Enter the temperature value:");
		double temperature=utility.doublescan();
		utility.tempConversion(temperature);
		
	}
	
	

}
