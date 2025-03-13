package package1;

public class Globalvariable 
{
	static int a=100; //global-declaration
	static int b=200; //global
	static void addition()
	{
		int c=100;
		System.out.println(a+b);//utilization
	}
	static void substraction()
	{
		System.out.println(a-b);
	}
	static void multiplication()
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args)
	{
	addition();
	substraction();
	multiplication();
	
	}

}
