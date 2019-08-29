package com.bridgelabz.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArrayMat {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	

	
				Scanner input = new Scanner (new File("/home/admin1/eclipse-workspace/BasicJavaPrograms/src/com/bridgelabz/io/matrix.txt"));
		        int m = 3;
		        int n = 3;
		        int[][] a = new int [m][n];
		        while (input.hasNextLine())
		        {
		            for (int i = 0; i < m; i++) 
		            {
		                for (int j = 0; j < n; j++)
		                {
		                   try
		                   {
		                	   
		                	   a[i][j] = input.nextInt();
		                     
		                    }
		                   catch(Exception e)
		                   {
		                	   e.printStackTrace();
		                   }
		                   
		                }
		            }
		    
		        File file1 = new File("/home/admin1/eclipse-workspace/BasicJavaPrograms/src/com/bridgelabz/io/mat.txt");
		        PrintWriter output = new PrintWriter(file1);
		        try {
		        	output.write("the matrix is: \n");
		        for(int i=0;i<m;i++)
		        {
		            for(int j=0;j<n;j++)
		            {  
			                output.write(a[i][j]+" ");
			                
			        } 
		            output.println();
		        }
		        output.close(); 
		        }
		        catch (Exception e) 
			    {
			           System.out.println(e.getMessage());
			    }
		      }    
		  }
		        
		}
		  



