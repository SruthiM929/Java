package package1;
//this calling statement

public class Google
{
	Google()
	{
		this("page open");//this calling statement
		System.out.println("Login to page");
	}
	Google(String a)
	{
		this('A');
		System.out.println("Logout of the page");	
	}
	Google(char a)
	{
		super();
		System.out.println("lines");
	}
	public static void main(String[] args)
	{
		new Google();
		
	}
}
