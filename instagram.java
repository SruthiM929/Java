package package1;
abstract class Amazon2 //abstract class
{
	abstract void login();  //abstract method
	abstract void logout();  //abstract method
}

public class instagram extends Amazon2
{
public static void main(String[] args) 
{
	instagram i=new instagram();
	i.login();
	i.logout();
}
void login()
{
	System.out.println("The real implementation-login");
}
void logout()
{
	System.out.println("The real implementation-logout");
	
}
}
