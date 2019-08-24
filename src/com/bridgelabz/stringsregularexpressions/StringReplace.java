package com.bridgelabz.stringsregularexpressions;

public class StringReplace {

	public static void main(String[] args) {
		String s="Old MacDonald had a farm,\n" + 
				"E­I­E­I­O.\n" + 
				"a\n" + 
				"And on his farm he had some %ANIMAL%,\n" + 
				"E­I­E­I­O.\n" + 
				"a\n" + 
				"With a %SOUND%, %SOUND% here,\n" + 
				"And a %SOUND%, %SOUND% there,\n" + 
				"Here a %SOUND%, there a %SOUND%,\n" + 
				"Everywhere a";
		String[] arr1= {"chicks","duck","turkey","cat","dog"};
		String[] arr2= {"chick","quack","gobble","meow-meow","bow-wow"};
		for(int i=0;i<arr1.length;i++)
		{
			String s1=s.replace("%ANIMAL%", arr1[i]);
			String s2=s1.replace("%SOUND%", arr2[i]);
			System.out.println("\n"+s2);
		}
		
	

	}

}
