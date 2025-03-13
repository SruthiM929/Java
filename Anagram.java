package package1;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args)
	{
		String s1="below";
		String s2="elbow";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("They are not anagram");
		}
		else
		{
			System.out.println("Lets find out if it is anagram ");
			char c1[]=s1.toCharArray(); //[b,e,l,o,w]
			char c2[]=s2.toCharArray(); //[e,l,b,o,w]
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			boolean b1=Array.equal(c1,c2);
			System.out.println(b1);
		}
		
	}

}
