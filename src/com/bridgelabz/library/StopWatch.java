package com.bridgelabz.library;

import com.bridgelabz.util.utility;

public class StopWatch {

	public static void main(String[] args) {
		long start=utility.intscan();
		long startTime=0;
		long stopTime=0;
		if(start==0)
		{
			startTime=System.currentTimeMillis();
			System.out.println("starting time:"+startTime);
		}
		System.out.println("Enter 1 to stop the watch");
		long stop=utility.intscan();
		if(stop==1)
		{
			stopTime=System.currentTimeMillis();
			System.out.println("stop time:"+stopTime);
		
		}
		double elapsed=(stopTime-startTime);
		System.out.println("elapsed time:"+elapsed);
		

	}

}
