package com.bridgelabz.stringsregularexpressions;





import com.bridgelabz.util.utility;

public class RegularExpression {

	public static void main(String[] args) {
		String s="Hello <<name>>, We have your full name\n" + 
				"as <<full name>> in our system. your contact number is 91­xxxxxxxxxx. Please,let us\n" + 
				"know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		System.out.println(s);
	
		System.out.println("please print your name:");
		String name=utility.stringscan();
		String s1=s.replace("<<name>>"," name");
		
		System.out.println("please print your full name:");
		String fullname=utility.stringscan();
		String s2=s1.replace("<<full name>>"," fullname");
		
		System.out.println("please print your phone number:");
		int number=utility.intscan();
		String s3=s2.replace("91­xxxxxxxxxx"," number");
		System.out.println(s3);
		
		
		
			
	}

}
