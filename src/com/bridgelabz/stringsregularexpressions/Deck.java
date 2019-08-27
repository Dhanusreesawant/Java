package com.bridgelabz.stringsregularexpressions;

public class Deck {

	public static void main(String[] args) {
		String[] suits= {"clubs","diamond","hearts","spades"};
		String[] ranks= {"2","3","4","5","6","7","8","9","king","queen","jack","ace"};
		//int count=0;
		int n=suits.length*ranks.length;
		String[] deck=new String[n];
		for(int i=0;i<ranks.length;i++)
		{
			for(int j=0;j<suits.length;j++)
			{
				deck[suits.length*i+j]=ranks[i]+" of "+suits[j];
			}
		}
		for(int i=0;i<n;i++)
		{
			int r=i+(int)Math.random()*(n-i);
			String temp=deck[r];
			deck[r]=deck[i];
			deck[i]=temp;
			
		
		for(int j=0;j<n;j++)
		{
			
			System.out.println(deck[j]);
			//count++;
		}
		
		
		
	}

}
}
