package com.bridgelabz.stringsregularexpressions;

import com.bridgelabz.util.utility;

public class PrimeAnagram {

	public static void main(String[] args) 
	{
		int[] arr=new int[25];
		int index=0;
		System.out.println(" Number is prime and Anagram");
		for(int i=2;i<100;i++)
		{
			boolean result=utility.isprime(i);
			if(result==true) 
			{
				arr[index]=i;
		    	
				index++;	
			}
		  
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				String s1=Integer.toString(arr[i]);
				String s2=Integer.toString(arr[j]);
				boolean res=utility.anagram(s1, s2);
				if(res==true)
				{
					System.out.println("anagram"+arr[i]+" "+arr[j]);
				}
			}
		}
		
	

	}

}
