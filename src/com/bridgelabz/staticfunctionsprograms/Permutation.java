/******************************************************************************
 *  
 *  Purpose: permutation of string(recursion method)
 *
 *  @author  Dhanusree
 *  @version 1.0
 *  @since   13-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.staticfunctionsprograms;

import com.bridgelabz.util.utility;

class Permutation
{
	public static void main(String[] args)
	{
		String s = "AB";
		utility.permutation(s.toCharArray(), 0);
	}
}