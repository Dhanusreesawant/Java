
/******************************************************************************
 *  
 *  Purpose: print the prime number in given range
 *
 *  @author  Dhanusree
 *  @version 1.0
 *  @since   09-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.conditionalloops;

import com.bridgelabz.util.utility;

public class Prime {

	public static void main(String[] args) {
		System.out.println("prime start to:");
		int start=utility.intscan();
		System.out.println("prime end from:");
		int stop=utility.intscan();
		int[] array=utility.prime(start, stop);
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		
		
		

	}

}
