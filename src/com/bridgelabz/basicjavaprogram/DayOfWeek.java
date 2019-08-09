/******************************************************************************
 *  
 *  Purpose: find the day of the week
 *
 *  @author  Dhanusree
 *  @version 1.0
 *  @since   07-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.util.utility;

public class DayOfWeek {
	public static void main(String args[]) {
		int day, month, year;
		day = Integer.parseInt(args[0]);
		month = Integer.parseInt(args[1]);
		year = Integer.parseInt(args[2]);
		utility.dayofweek(day, month, year);

	}

}
