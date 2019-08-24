package com.bridgelabz.staticfunctionsprograms;

public class Armstrong {

	public static void main(String[] args) {
		int num=12,rem,res=1,dig=0,sum=0;
		int n=String.valueOf(num).length();
		int temp=num;
		
		while(num!=0)
		{ res=1;
			rem=num%10;
			for(int i=1;i<=n;i++)
			{
			res=res*(rem);
			}
			num=num/10;
			sum=sum+res;
		}
		if(sum==temp)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("not Armstrong number");
		}
		

	}

}
