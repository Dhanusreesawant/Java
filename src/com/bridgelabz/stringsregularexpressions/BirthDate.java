package com.bridgelabz.stringsregularexpressions;

import java.util.Random;

public class BirthDate {

	public static void main(String[] args) {
		int days=365;
		int day;
		int month;
		int year=1992;
		int count=0;
		
		Random random=new Random();
		
		int jan=0,feb= 0,mar=0,apr=0,may=0,jun=0,jul=0,aug=0,sep=0,oct=0,nov=0,dec=0;
		for(int i=0;i<10;i++)
		{
			day=1+random.nextInt(30);
			month=1+random.nextInt(12);
			 
			String birthday=String.valueOf(day)+"-"+String.valueOf(month)+"-"+String.valueOf(year);
			System.out.println(birthday);
			String a=String.valueOf(month);
			
			if(a.equalsIgnoreCase("1"))
			{
				jan++;
				
			}

			if(a.equalsIgnoreCase("1"))
			{
				jan++;
				
			}

			if(a.equalsIgnoreCase("2"))
			{
				feb++;
				
			}

			if(a.equalsIgnoreCase("3"))
			{
				mar++;
				
			}
			if(a.equalsIgnoreCase("4"))
			{
				apr++;
				
			}
			if(a.equalsIgnoreCase("5"))
			{
				may++;
				
			}
			if(a.equalsIgnoreCase("6"))
			{
				jun++;
				
			}
			if(a.equalsIgnoreCase("7"))
			{
				jul++;
				
			}
			if(a.equalsIgnoreCase("8"))
			{
				aug++;
				
			}
			if(a.equalsIgnoreCase("9"))
			{
				sep++;
				
			}
			if(a.equalsIgnoreCase("10"))
			{
				oct++;
				
			}
			if(a.equalsIgnoreCase("11"))
			{
				nov++;
				
			}
			if(a.equalsIgnoreCase("12"))
			{
				dec++;
				
			}
		}
		System.out.println("jan -"+jan);
		System.out.println("feb -"+feb);
		System.out.println("mar -"+mar);
		System.out.println("apr"+apr);
		System.out.println("may"+may);
		System.out.println("jun"+jun);
		System.out.println("jul"+jul);
		System.out.println("aug"+aug);
		System.out.println("sep"+sep);
		System.out.println("oct"+oct);
		System.out.println("nov"+nov);
		System.out.println("dec"+dec);
			
			
		}
	
		   

}

		

