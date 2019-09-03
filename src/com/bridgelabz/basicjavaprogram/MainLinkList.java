package com.bridgelabz.basicjavaprogram;

import java.util.Scanner;

import com.bridgelabz.util.utility;



	public class MainLinkList {


	

		public static void main(String[] args) 
		{
			
			LinkList1 list1=new LinkList1();
			
			while(true){
				System.out.println(" enter 1 for insert \n enter 2 for delete \n enter 3 for display \n enter 4 for exit\n");
	                                             
				System.out.println("Enter choice:");
				switch(utility.intscan()){
				case 1:int i;double j;
				i=utility.intscan();
				j=utility.doublescan();
				list1.insertFirst(i, j);
				break;
				case 2:list1.deleteFirst();
				break;
				case 3:list1.displayList();
				break;
				
				default:
				System.exit(0);
				}
			}	
			
			
			
		}

	}


