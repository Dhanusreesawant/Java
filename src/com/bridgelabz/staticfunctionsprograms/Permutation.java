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

class Permutation
{
	
	private static void swap(char[] ch, int i, int j)
	{
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		
	}


	private static void permutations(char[] ch, int currentIndex)
	{
		if (currentIndex == ch.length - 1) 
		{
			System.out.println(String.valueOf(ch));
			
		}

		for (int i = currentIndex; i < ch.length; i++)
		{
			swap(ch, currentIndex, i);
			permutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		
		}
	}

	
	public static void main(String[] args)
	{
		String s = "AB";
		permutations(s.toCharArray(), 0);
	}
}