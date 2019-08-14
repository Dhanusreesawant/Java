package com.bridgelabz.staticfunctionsprograms;


	class permut
	{
		
		private static void permutations(String ch, String str)
		{
			if (str.length() == 0) {
				System.out.println(ch);
			}

			for (int i = 0; i < str.length(); i++)
			{
				System.out.println(i);
				String newChar = ch + str.charAt(i);
				System.out.println("nc="+newChar);
				String newRemaining = str.substring(0, i) +str.substring(i + 1);
				System.out.println("nr="+newRemaining);
				permutations(newChar, newRemaining);
			}
		}

		
		public static void main(String[] args)
		{
			String s = "ABC";
			permutations("", s);
		}
	}


