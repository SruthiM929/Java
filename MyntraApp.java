package package1;
// ConstructorOverloading 
public class MyntraApp 
{
	MyntraApp()
	{
		System.out.println("Login to the page");
	}
	MyntraApp(int a)
	{
		System.out.println("Logout from the page");
	}
	public static void main(String[] args) 
	{
		new MyntraApp();
		new MyntraApp(40);
		
	}
}
