package com.bridgelabz.basicjavaprogram;

public class Link 
{
	public int iData;
	public double dData;
	public Link next;
	
	
	public Link(int id, double dd) {
		// TODO Auto-generated constructor stub
		iData=id;
		dData=dd;
	}

	public void displayLink()
	{
		
		System.out.println("{"+iData+"}");
	}
}

