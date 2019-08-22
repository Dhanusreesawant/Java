package com.bridgelabz.SortingAndSearching;

import java.util.Arrays;

public class FrequencyCount {

	public static void main(String[] args) 
	{
		String s="To Be Or Not To Be";
		String[] word=s.split("\\s+");
		int count=1;
		int flag=1;
		Arrays.sort(word);
		
		for(int i=0;i<word.length-1;i++)
		{
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i].equals(word[j]))
				{
					count++;
				}
				
				for(int k=1;k<i;k++)
				{
					if(word[i]==word[k])
					{
						break;
					}
				}
				
				
			}
			System.out.println(word[i+1]+"-"+(count));
			count=1;
		}

	}

}
