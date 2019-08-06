package com.bridgelabz.util;

import java.util.Random;
import java.util.Scanner;


public class utility
{
	public static int intscan()
	{
		Scanner scanner=new Scanner(System.in);
		int value=scanner.nextInt();
		return value;
		
	}
	public static String stringscan()
	{
		Scanner scanner=new Scanner(System.in);
		String value=scanner.nextLine();
		return value;
		
	}
	public static Double doublescan()
	{
		Scanner scanner=new Scanner(System.in);
		Double value=scanner.nextDouble();
		return value;
		
	}
	public static String printThreeNames(String words[])
	{
		
		String reverse="";
		for(int i=words.length-1;i>=0;i--)
		{
			if(i==0)
			{	
				reverse=reverse + words[i]+".";
			}
			else
			{
				reverse=reverse + words[i]+", ";
			}
		
		}	
	return reverse;
	}

	public static int leapyear(int year)
	{
			if(year>=1580)
			{
				if((year%4)==0)
				{
					System.out.println("leap year");
				}
				else if((year%100)==0)
				{
					System.out.println("not leap year");
				}
			    else if((year%400)==0)
			    {
			    	System.out.println("leap year");
			    }
			    else
			    {
			    	System.out.println("not leap year");
			    }
			}
			else
			{
				System.out.println("please put the year above 1580......");
					
			}
			return year;
		
	}
	
	public static void intopt(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println("a+b*c="+(a+b*c));
		System.out.println("a*b+c="+(a*b+c));
		System.out.println("c+a/b="+(c+a/b));
		System.out.println("a%b+c="+(a%b+c));
		
	}
	public static void doubleopt(Double a, Double b, Double c) {
		// TODO Auto-generated method stub
		System.out.println("a+b*c="+(a+b*c));
		System.out.println("a*b+c="+(a*b+c));
		System.out.println("c+a/b="+(c+a/b));
		System.out.println("a%b+c="+(a%b+c));
		
	}
	public static void springseason(int m,int d)
	{
		boolean bool=true;
		if((m==3 && d>=20 && d<=31)||(m==6 && d>=20 && d<=30))
		{
			bool=true;
			System.out.println(bool);
		}
		else
		{
			bool=false;
			System.out.println(bool);
		}
		
	}
	public static void quadratic(double a,double b,double c)
	{
		double root1,root2;
		double delta = b*b-4*a*c;
		
		if(delta > 0)
		{
			root1=((-b+Math.sqrt(delta))/(2*a));
			root2=((-b-Math.sqrt(delta))/(2*a));
			
			System.out.printf("root1=%2f & root2=%2f",root1, root2);
		}
		else if(delta == 0)
		{
			root1=root2=-b/(2*a);
			System.out.printf("root1=root2=%2f",root1);
		
		}
		else
		{
			double realpart=-b/(2*a);
			double imaginarypart=Math.sqrt(delta)/(2*a);
			System.out.printf("root1 = %.2f+%.2f and root2 = %.2f-%.2f", realpart, imaginarypart, realpart, imaginarypart);
			
		}
	}
		public static void sumoftwodice()
		{
			int a=1+(int)(Math.random()*6);
			int b=1+(int)(Math.random()*6);
			int sum=a+b;
			System.out.println(sum);
			
		}
		
	}
	

	


