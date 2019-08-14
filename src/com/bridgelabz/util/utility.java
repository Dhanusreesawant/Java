package com.bridgelabz.util;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 * @author admin1
 *
 */
/**
 * @author admin1
 *
 */
/**
 * @author admin1
 *
 */
/**
 * @author admin1
 *
 */
/**
 * @author admin1
 *
 */
/**
 * @author admin1
 *
 */
public class utility
{
	private static String[] args;
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
	/**
	 * @param words for reverse string
	 * @return result
	 */
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

	/**
	 * @param year whether checking leap year or not.
	 * @return year
	 */
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
	/**
	 * @param m month 
	 * @param d day
	 */
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
	/**
	 * formula variables b^2-4*a*c
	 * @param a get a value
	 * @param b get b value
	 * @param c get c value
	 */
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
			double imaginarypart=Math.sqrt(-delta)/(2*a);
			System.out.printf("root1 = %.2f+%.2f and root2 = %.2f-%.2f", realpart, imaginarypart, realpart, imaginarypart);
			
		}
	}
		/**
		 * sum of two dice
		 */
		public static void sumoftwodice()
		{
			int a=1+(int)(Math.random()*6);
			int b=1+(int)(Math.random()*6);
			int sum=a+b;
			System.out.println(sum);
			
		}
		/**
		 * @param first first random value
		 * @param second second random value
		 * @param third third random value
		 * @param fourth fourth random value
		 * @param fifth fifth random value
		 */
		public static void stats5(double first,double second,double third,double fourth,double fifth)
		{
			
			 int nofnumbers=5;
			 first=Math.random();
			 second=Math.random();
			 third=Math.random();
			 fourth=Math.random();
			 fifth=Math.random();
			 
			 System.out.println("the first values:"+first);
			 System.out.println("the second values:"+second);
			 System.out.println("the third values:"+third);
			 System.out.println("the fourth values:"+fourth);
			 System.out.println("the fifth values:"+fifth);
			 
			 double min=Math.min(first, Math.min(second, Math.min(third, Math.min(fourth, fifth))));
			 double max=Math.max(first, Math.max(second, Math.max(third, Math.max(fourth, fifth))));
			 double average=(first+second+third+fourth+fifth)/nofnumbers;
			 
			 System.out.println("Minimum:"+min);
			 System.out.println("Maximum:"+max);
			 System.out.println("Average:"+average);
		}
		/**
		 * @param x distance origin point of x
		 * @param y distance origin point of y
		 */
		public static void distance(int firstvalue,int secondvalue)
		{
			
			int distance=(int) Math.sqrt(Math.pow(firstvalue, 2)+Math.pow(secondvalue, 2));
			System.out.println("Distance:"+distance);
		}
		/**
		 * @param t temperature
		 * @param v speed
		 */
		public static void windchill(double t,double v)
		{
			if((t>50) && (v<3)||(v>120))
			{
				System.out.println("data must be temp below 50 and speed above 3 and below 120 ");
			    
			}
			else
			{
				double windchill=35.74+0.6125*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
				System.out.println("the temperature:"+t);
				System.out.println("the speed:"+v);
			    System.out.println("the windchill:"+windchill);
			}
			
		}
		/**
		 * @param day  
		 * @param month 
		 * @param year 
		 * @return 
		 */
		public static int dayofweek(int day,int month,int year)
		{
			int year1 = year -(14 - month) / 12;
			int findleapornot = year1 + (year1/4) - (year1/100) + (year1/400);
			int month1 = month + 12 * ((14 - month) / 12) - 2;
			int finddayofweek = (day + findleapornot + ((31*month1)/ 12)) % 7;
			
			return finddayofweek;
			
		}
		/**
		 * @param principle getting loan amount
		 * @param year      for how many years
		 * @param rate      percent of interest
		 */
		public static void carloan(double principle,double year,double rate)
		{
			
			double ratevalue=(rate/100)/12;
			double nofyear=12*year;
			
			double payment=(principle*ratevalue)/1-(Math.pow(1+ratevalue,(-nofyear)));
			System.out.println("monthly payments="+payment);
		
			
		}
		
		/**
		 * @param radians calculate the trignomentry functions
		 */
		public static void trignomentry(double radians) 
		{
			double sin=Math.sin(radians);
			double cos=Math.cos(radians);
			double tan=Math.tan(radians);
			System.out.println("sin value:"+sin);
			System.out.println("cos value:"+cos);
			System.out.println("tan value:"+tan);
			
		}
		
		/**
		 * @param temperature for conversion
		 */
		public static void tempConversion(double temperature)
		{
			
			System.out.println("Enter the unit of temperature F or C ,f or c:");
			Scanner scanner=new Scanner(System.in);
			char ch =scanner.nextLine().charAt(0);
			
			if(ch =='f' || ch =='F')
			{        
				double celsius=(temperature-32) * 5/9;
				System.out.println("Fahrenheit to celcius:"+celsius);
				
			}
			else if(ch == 'c'|| ch == 'C')
			{
				double fehrein=(temperature-9/5)+32;
				System.out.println("Fahrenheit to celcius:"+fehrein);
			}
			else
			{
				System.out.println("please give unit for conversion.......");
			}
		}
		/**
		 * flip the coin and calculate percentage
		 */
		public static void flipcoin()
		{
			int headCount=0;
			int TailCount=0;
			for(int i=1;i<=5;i++)
			{
				if(Math.random()>0.5)
				{
					headCount=headCount+1;
					System.out.println("Head");
					
				}
				else
				{
					TailCount=TailCount+1;
					System.out.println("Tail");
					
				}
			
			}
			System.out.println("percentage of heads:"+(headCount*100)/5);
			System.out.println("percentage of tail:"+(TailCount*100)/5);
			
		}
		/**
		 * @param number print the pow of 2 up to n numbers
		 */
		public static void powoftwo(int number)
		{
			
			int i=1;
			int powoftwo=1;
			while(i<=number)
			{
				powoftwo=2*powoftwo;
				i=i+1;
				System.out.println(powoftwo);
			}
			
		}
		/**
		 * @param sum added the n
		 * @param number
		 */
		public static void harmonic(double sum,double number)
		{
			for(int i=1;i<=number;i++)
			{
				sum+=1.0/i;
			}
			System.out.println(sum);
			
		}
		/**
		 * compute the square root of a nonnegative number c given in the input using Newton's method
		 */
		public static void sqrt()
		{
			System.out.println("enter the value:");
			double c=doublescan();
			double t=c;
			double epilson=1.0e-15;
			while(Math.abs(t-(c*t))>epilson)
			{
				t=(t*(t/c))/2;
			}
			System.out.println(t);
		}
		
		/**
		 * @param stack
		 * @param goal
		 * @param nooftimes
		 */
		public static void gamblersimulator(int stack,int goal,int nooftimes)
		{
			int win=0;
			int bet=0;
			
			for(int i=0;i<=nooftimes;i++)
			{
				int cash=stack;	
				bet++;
				while(cash>0 && cash<goal)
				{
					if(Math.random()<0.5)
					{
						cash++;
						System.out.println(cash);
					}
					else
					{
						cash--;
						
					}
				}
				if(cash==goal)
				{
					win++;
				}
				else if(cash==0)
				{
					
					break;
				}
			}
			
			System.out.println(win+"out of "+nooftimes);
			
		}
		public static void prime(int start,int stop)
		{
			int count=0;
			for(int i=start;i<stop;i++)
			{
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						count=0;
						break;
					}
					else
					{
						count=1;
					}
				}
				if(count==1)
				{
				  System.out.println(i);
				}
			}
			
			
		}
		public static boolean palindrome(String str1)
		{
			String rev="";
			
		    int len=str1.length();
			for(int i=len-1;i>=0;i--)
				rev=rev+str1.charAt(i);
			
				if(str1.equals(rev))
					return true;
				else
				   return false;
		}
		public static void anagram(String str1,String str2)
		{
			int flg=0,flg1=0;
			int len;
			int l1=str1.length();
			int l2=str2.length();
			if(l1==l2)
			{
				len=l1;
				for(int i=0;i<len;i++)
				{
					flg=0;
					for(int j=0;j<len;j++)
					{
						if(str1.charAt(i)==str2.charAt(j))
						{
							flg=1;
							break;
						}
					}
					if(flg==0)
					{
						flg1=1;
						break;
						
					}
					
				}
				if(flg1==1)
				{
					System.out.println("not anagram");
				}
				else
				{
					System.out.println("anagram");
				}
			}
			else
			{
				System.out.println("not anagram");
			
			}

		}
		public static boolean isleapyear(int year)
		{
			if((year%4==0)&&(year%100!=0))
			{
				return true;
			}
			if((year%400)==0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		public static void swap(char[] arr,int i,int j)
		{
			char c=arr[i];
			arr[i]=arr[j];
			arr[j]=c;
		}
		public static void rev(char[] arr,int i,int j)
		{
			while(i<j)
			{
				swap(arr,i++,j--);
			}
		}
		public static void permutations(String str,int n)
		{
			char[]s=str.toCharArray();
			Arrays.sort(s);

			while(true)
			{
				System.out.print(String.valueOf(s) + " ");

				int i = n - 1;
				while (s[i-1] >= s[i])
				{
					
					if (--i == 0)
						return;
				}

				int j = n - 1;
				while (j > i && s[j] <= s[i-1])
					j--;
				swap(s, i-1, j);
				rev(s, i, n-1);
			
			}
			
		}
			
}
		
		 
	
	

	


