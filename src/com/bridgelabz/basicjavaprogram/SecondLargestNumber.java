package com.bridgelabz.basicjavaprogram;

import com.bridgelabz.util.utility;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int n=utility.intscan();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=utility.intscan();
		}
		int secondLargest=arr[0];
		int largest =arr[0];
		for (int i = 0; i < arr.length; i++) {
			 
			
			if (arr[i] > largest) {
				secondLargest = largest;
				System.out.println(secondLargest);
				largest = arr[i];
				
 
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
 
	}
		

	}


