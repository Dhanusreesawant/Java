package com.bridgelabz.conditionalloops;

import com.bridgelabz.util.utility;

public class Rolldie {

	public static void main(String[] args) 
	{
		int noftimes=8;
		int dices;
		int one=0;
		int two=0;
		int three=0;
		int four=0;
		int five=0;
		int six=0;
		for(int i=0;i<noftimes;i++)
		{
		 dices=1+(int)(Math.random()*6);
		 System.out.println(dices);
		 if(dices==1)
		 {
			 one++;
			
		 }
		 else if(dices==2)
		 {
			 two++;
		 }
		 else if(dices==3)
		 {
			 three++;
		 }
		 else if(dices==4)
		 {
			 four++;
		 }
		 else if(dices==5)
		 {
			 five++;
		 }
		 else if(dices==6)
		 {
			 six++;
		 }
		 
		}
	
		 int max=Math.max(one, Math.max(two, Math.max(three, Math.max(four, Math.max(five, six)))));
		 System.out.println("max of"+ max+"dices");
		 

	}

}
