/******************************************************************************
 *  
 *  Purpose: print calendar monthly
 *
 *  @author  Dhanusree
 *  @version 1.0
 *  @since   13-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.staticfunctionsprograms;

import com.bridgelabz.util.utility;

public class Calendar 
{

	public static void main(String[] args) 
	{
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		utility.calender(month, year);
		

	}

}
