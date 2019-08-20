package com.bridgelabz.library;

public class BLStdIn {

	 public static void main(String[] args) {

	        StdOut.print("Type a string: ");
	        String s = StdIn.readString();
	        System.out.println("Your string was: " + s);
	        StdOut.println();

	        StdOut.print("Type an int: ");
	        int a = StdIn.readInt();
	        System.out.println("Your int was: " + a);
	        System.out.println();

	        StdOut.print("Type a boolean: ");
	        boolean b = StdIn.readBoolean();
	        System.out.println("Your boolean was: " + b);
	        System.out.println();

	        StdOut.print("Type a double: ");
	        double c = StdIn.readDouble();
	        System.out.println("Your double was: " + c);
	        System.out.println();
	    }

	}


