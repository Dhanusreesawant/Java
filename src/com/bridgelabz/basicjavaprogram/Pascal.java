package com.bridgelabz.basicjavaprogram;

import java.util.Scanner;
public class Pascal {

  public static void main(String[] args)
{
    int no,c=1,i,j;
    System.out.print("Input number of rows: ");
    Scanner in = new Scanner(System.in);
		    no= in.nextInt();
		    for(i=0;i<no;i++)
		    {
		    	for(j=1;j<=no-i;j++) 
		    	{
		    		System.out.print(" ");
		    	}
		    	for(int k=0;k<=i;k++)
		    	{
		    		if(i==0 || k==0)
		    			c=1;
		    		else
		    			c=c*(i-k+1)/k;
		    		
		    		System.out.print(" "+c);
		    	}
		    	System.out.print("\n");
		    }
		    
    
}
}

