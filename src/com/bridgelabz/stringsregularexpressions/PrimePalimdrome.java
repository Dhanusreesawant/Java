package com.bridgelabz.stringsregularexpressions;

import com.bridgelabz.util.utility;

public class PrimePalimdrome {

	public static void main(String[] args) 
	{
		System.out.println(" Number is prime and palindrome");
		for(int i=2;i<100;i++)
		{
			boolean result=utility.isprime(i);
			if(result==true) 
			{
				boolean answer=utility.palindrome(i);
				if(answer==true)
					System.out.println(i);
					
			}
			  
		}

	}

}
