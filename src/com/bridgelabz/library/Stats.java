package com.bridgelabz.library;

public class Stats {

	public static void main(String[] args) {
		  double[] a = {15.34,12.5,32.23,16.45,34.89};
	        System.out.printf("       min %10.3f\n", StdStats.min(a));
	        System.out.printf("      mean %10.3f\n", StdStats.mean(a));
	        System.out.printf("       max %10.3f\n", StdStats.max(a));
	        System.out.printf("    stddev %10.3f\n", StdStats.stddev(a));
	        System.out.printf("       var %10.3f\n", StdStats.var(a));
	        System.out.printf("   stddevp %10.3f\n", StdStats.stddevp(a));
	        System.out.printf("      varp %10.3f\n", StdStats.varp(a));
	    }
	}

