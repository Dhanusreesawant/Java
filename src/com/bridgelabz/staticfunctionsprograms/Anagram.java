/******************************************************************************
 *  
 *  Purpose: check the string anagram or not.
 *
 *  @author  Dhanusree
 *  @version 1.0
 *  @since   13-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.staticfunctionsprograms;

import com.bridgelabz.util.utility;

public class Anagram {

	public static void main(String[] args) {
		
		String str1,str2;
		str1=utility.stringscan();
		str2=utility.stringscan();
		utility.anagram(str1, str2);
	}

}
