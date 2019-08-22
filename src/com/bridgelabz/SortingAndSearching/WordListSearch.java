package com.bridgelabz.SortingAndSearching;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.util.utility;

public class WordListSearch 
{
	public static void main(String args[]) throws IOException
	{
	
	
	BufferedReader br=new BufferedReader(new FileReader("/home/admin1/eclipse-workspace/BasicJavaPrograms/src/com/bridgelabz/SortingAndSearching/word.txt"));
	StringBuilder sb=new StringBuilder();
	String line=br.readLine();
	while(br!=null)
	{
		line=br.readLine();
		sb.append(line);
	}
	String string=sb.readLine();
	String[] arr=string.split(",");
	String search="abc";
	
	if(utility.binarySearch(arr,search)>0)
	{
		System.out.println("word is found");
	}
	else
	{
		System.out.println("word is not found");
	}
	}
	
}
