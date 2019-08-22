package com.bridgelabz.SortingAndSearching;

import com.bridgelabz.util.utility;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int[] array;
		System.out.println("how many integer you want:");
		int number=utility.intscan();
        int[] array=new int[number];
		
		 System.out.println("Enter " + number + " integers");
		 for (int c = 0; c < number; c++)
		  {
		      array[c] = utility.intscan();
		  }
		utility.bubbleSort(number,array);
		for (int c = 0; c < array.length; c++)
		  {
		      System.out.println(array[c]);
		  }
	}

}
