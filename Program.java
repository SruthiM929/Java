package package1;
// abstract class and abstract method with concrete class
abstract class Program1 
{
	abstract void add();
	abstract void sub();
	void login()
	{
	System.out.println("Logic to expose");
	}
	static void logout()
	{
	System.out.println("Logic to expose");	
	}
}
public class Program extends Program1
{
	void add()
	{
		System.out.println("Logic to keep");
	}
	void sub()
	{
		System.out.println("Logic to keep");	
	}
public static void main(String[] args)
{
	Program p=new Program();
	p.add();
	p.sub();
	p.login();
	p.logout();
}
}
