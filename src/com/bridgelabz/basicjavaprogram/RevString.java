package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.util.utility;

public class RevString {

	public static void main(String[] args) {
		
			String str="hello java programming";
			String word="";
			char[] ch=str.toCharArray(); 
			for(int i=0;i<(ch.length);i++)
			{
				if(ch[i]!=' ')
				{
				word=word+ch[i];				
				}
				else
				{
				  for(int c=word.length();c>0;c--)
				  {
				   System.out.print(word.charAt(c-1)); 	   
				  }
				  System.out.print(" "); 	
				  word="";
				} 	   
			}
		    
			for(int c=word.length();c>0;c--)
			{
				   System.out.print(word.charAt(c-1)); 	   
			}
			}
		
	}


