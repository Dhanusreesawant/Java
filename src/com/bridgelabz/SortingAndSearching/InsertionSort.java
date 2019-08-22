package com.bridgelabz.SortingAndSearching;

import com.bridgelabz.util.utility;

public class InsertionSort {

	public static void main(String[] args) {
		String[] arr= {"zyx","abc","uvw","qua"};
		
		insert(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
/*	public static void insert(String arr[])
	{
		String key=" ";
		int i=0;
		for(int j=1;j<arr.length;j++)
		{
			key=arr[j];
			i=j-1;
			while(i>=0)
			{
				if(key.compareTo(arr[i])>0)
					arr[i+1]=arr[i];
					i--;
			}
		//	System.out.println(arr);
		}
		arr[i+1]=key;
		System.out.println(arr);
		
		
	}*/
	public static void insert(String arr[])
	{
		String temp=" ";
		int p;
		for(int i=0;i<arr.length;i++)
		{
			p=i;
			for(int j=i+1;j>=0;j--)
			{
				if(j<arr.length && p>=0)
				if(arr[p].compareTo(arr[j])>0)
				{
					temp=arr[p];
					arr[p]=arr[j];
					arr[j]=temp;
				}
				p=p-1;
				
			}
		}
	}
	

}
