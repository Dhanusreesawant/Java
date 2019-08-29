package com.bridgelabz.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Stats {

	public static void main(String[] args) throws FileNotFoundException {
				Scanner file = new Scanner(new File("/home/admin1/eclipse-workspace/BasicJavaPrograms/src/com/bridgelabz/io/statsinput.txt"));

		    
		        float sum = 0;
		        double sd =0;
		        int count = 0;
		     
		        	 float numTimes = file.nextFloat();
		             file.nextLine();

		                 for(int i = 0; i < numTimes; i++);
		                 {   
		                   Scanner sc = new Scanner(file.nextLine());
		                   while(sc.hasNextFloat())
		                     {
		                	   sum += sc.nextFloat();
		                	   count++;
		                     }    
		                   float mean=(sum/count);
		             System.out.println("the average is = " + mean);
		                 
		            double count1=0;
					for(int i=0;i<numTimes;i++)
		             {
		            	 Scanner sc1 = new Scanner(file.nextLine());
		            	 while(sc1.hasNextFloat())
		            	 {
		            		   sd=sd+Math.pow(sc1.nextFloat()-mean, 2);
		            		   count1++;
		            		   
		            	 }
		             }
		             double res=Math.sqrt(sd/count1);
		             System.out.println("the standard deviation is = " + res);
		            
		                 
		                 try {
				            	File file1 = new File("/home/admin1/eclipse-workspace/BasicJavaPrograms/src/com/bridgelabz/io/statsoutput.txt");
				                PrintWriter output = new PrintWriter(file1);
				                output.printf("mean value: %.6f\n",mean);
				                output.printf("standard dev value: %.6f\n",res);
				                output.close(); 
				            } catch (FileNotFoundException e) 
				            {
				                System.out.println(e.getMessage());
				            }
				        } 

	}

}
