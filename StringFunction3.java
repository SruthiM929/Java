package package1;
//Palindrome concept ex:mom,dad
public class StringFunction3 
{
	public static void main(String[] args) 
	{
		

	String input="level";
	String reverse="";
	for (int i=input.length()-1;i>=0;i--)
	{
		char c1= input.charAt(i);
		reverse=reverse+c1;
	}
	System.out.println(reverse);
	if(input.equals(reverse))
	{
		System.out.println("The given word is palindrome");
	}
	else
	{
		System.out.println("Not a palindrome");
	}
	
	}
}
