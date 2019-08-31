package com.bridgelabz.stringsregularexpressions;

import java.util.Arrays;
import java.util.Random;

import com.bridgelabz.util.utility;

public class ArrayInteger {

	public static void main(String[] args) {
		  System.out.println("Enter the lenth of array : ");
	        int number=utility.intscan();
	        int arrayRepeated[]=new int[number];
	        Random random=new Random();
	        int value;
	        int count=0;
	        for(int i=0;i<arrayRepeated.length;i++)
	        {
	        value=1+random.nextInt(arrayRepeated.length);
	        arrayRepeated[i]=value;
	        }
	        for(int i=0;i<arrayRepeated.length;i++)
	        {
	        //value=1+random.nextInt(arrayRepeated.length);
	        System.out.print(arrayRepeated[i]+" ");
	        }
	        int p=0;
	        int arr[]=new int[number];
	        for(int i=0;i<arrayRepeated.length;i++) {
	        
	        for(int j=0;j<arrayRepeated.length;j++)
	        {
	        if(arrayRepeated[i]==arrayRepeated[j] && i!=j ) {
	        count++;
	        }
	        }
	        if(count==1) {
	        arr[p]=arrayRepeated[i];
	           p++;
	           count=0;
	        }
	        
	        }
	        
	        System.out.println();
	        
	        for(int i=0;i<arr.length;i++)
	        {
	        
	        		System.out.println(arr[i]);
	        }
	         
		
	}

}
