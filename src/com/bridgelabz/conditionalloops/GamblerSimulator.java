/******************************************************************************
 *  
 *  Purpose: play a gambler and find how times win.
 *
 *  @author  Dhanusree
 *  @version 1.0
 *  @since   09-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.conditionalloops;

import com.bridgelabz.util.utility;

public class GamblerSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stack=utility.intscan();
		int goal=utility.intscan();
		int nooftimes=utility.intscan();
		utility.gamblersimulator(stack, goal, nooftimes);
	

	}

}
