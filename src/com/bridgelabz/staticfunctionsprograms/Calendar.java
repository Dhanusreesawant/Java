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

public class Calendar {

	public static void main(String[] args) {
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		
		String[] months= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		int[] days= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(month==2 && utility.isleapyear(year)==true)
		{
				days[month]=29;
		}
		
		System.out.println(" s  m  tu  w  th f s");
		int d=utility.dayofweek(1,month,year);
		for(int i=0;i<d;i++)
			System.out.print("   ");
		for(int day1=1;day1<=days[month];day1++)
		{
			System.out.printf("%2d ", day1);
			if(((day1+d)%7==0) || (day1==days[month]))
			{
				System.out.println();

			}
	
			
		}

	}

}
