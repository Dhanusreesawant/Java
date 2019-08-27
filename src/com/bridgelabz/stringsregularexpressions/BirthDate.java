package com.bridgelabz.stringsregularexpressions;

import java.util.Random;

public class BirthDate {

	public static void main(String[] args) {
		int days=365;
		int day;
		int month;
		int year=1992;
		int count=0;
		//String birthday= "2-04-1992";
		//String[] s=birthday.split("-");
		//char a=s[1].charAt(1);
		Random random=new Random();
		
		for(int i=0;i<10;i++)
		{
			day=1+random.nextInt(30);
			month=1+random.nextInt(12);
			 //day=4;
			//month=04;
			String birthday=String.valueOf(day)+"-"+String.valueOf(month)+"-"+String.valueOf(year);
			System.out.println(birthday);
			String[] s=birthday.split("-");
			char a=s[1].charAt(0);
			
			if(a=='4')
			{
				count++;
				
			}
		}
		System.out.println(count);
			
			
		}
	
		   

}

		

