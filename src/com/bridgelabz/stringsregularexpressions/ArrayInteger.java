package com.bridgelabz.stringsregularexpressions;

import java.util.Arrays;

public class ArrayInteger {

	public static void main(String[] args) {
			int[] arr =new int[10];
			int cnt=0;
			int p=0,j;
			int number;
			for(int i=0;i<arr.length;i++)
			{
				 number=(int) (Math.random()*10);
				 System.out.print(number);
			     arr[i]=number;
			}
			for( j=0;j<arr.length;j++)
			{
				cnt=0;
				if(arr[j]==arr[j+1])
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				arr[p]=arr[j];
				p++;
			}
			for(int l=0;l<arr.length;l++)
			{
			
				System.out.println(arr[p]);
			}
		
	}

}
