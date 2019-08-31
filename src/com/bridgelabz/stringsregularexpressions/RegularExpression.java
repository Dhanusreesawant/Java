package com.bridgelabz.stringsregularexpressions;





import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import com.bridgelabz.util.utility;

public class RegularExpression {

	public static void main(String[] args) {
		
		

		String FirstName = "" , FullName="", MobNumber="";
		boolean match, match1,match2;
	

		do {
		System.out.println("enter ur first name"+FirstName);
		FirstName=utility.stringscan();

		System.out.println("enter ur Full name"+FullName);
		FullName=utility.stringscan();

		System.out.println("enter ur mobnumber"+MobNumber);
		MobNumber=utility.stringscan();

		if(match=Pattern.matches("[a-zA-Z]+",FirstName)) 

		System.out.println();

		else
		System.out.println("your firstname is invalid");

		if(match1=Pattern.matches("^[a-zA-Z\\s]*$",FullName)) 

		System.out.println();

		else
		System.out.println("your "+FullName+" is invalid please enter valid fullname");

		if(match2=Pattern.matches("(0/91)?[7-9][0-9]{9}",MobNumber)) 
		System.out.println();
		 
		else
		System.out.println("your mobnumber is invalid please enter valid mobnumber");
		}	 
		 
		while(match==false|| match1==false|| match2==false);

		String actualstr=utility.replaceStr(FirstName,FullName,MobNumber);
		System.out.println(actualstr);
		
		}
	
	}



