package com.bridgelabz.basicjavaprogram;



import com.bridgelabz.util.utility;

public class PrintThreeNames 
{
	public static void main(String args[])
	{
		
		System.out.println("Enter the string:");
	
	
		String input=utility.stringscan();
		String words[]=input.split("\\s");
		System.out.println("Reverse string: ");
	
		
		
System.out.println("hi "+ utility.printThreeNames(words));
}

}
