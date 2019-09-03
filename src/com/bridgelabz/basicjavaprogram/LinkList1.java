package com.bridgelabz.basicjavaprogram;

public class LinkList1 
{
	private Link first;
	public LinkList1()
	{
		first=null;
	}
	
	public boolean isEmpty()
	{
		return (first==null);
	}
	
	public void insertFirst(int id,double dd)
	{
		Link newLink=new Link(id,dd);
		newLink.next=first;
		first=newLink;
	}
	
	public Link deleteFirst(){
		Link temp=first;
		first=first.next;
		return temp;
	}
	
	public void displayList(){
	//	System.out.println("List(First->Lastnk)");
		Link current = first;
		while(current!=null){
			current.displayLink();
			current=current.next;
		}
		System.out.println();
	}
	
	
}



