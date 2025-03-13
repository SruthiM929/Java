package package1;
// multi level inheritance
class a
{
	static void one()
	{
	System.out.println("Method one from class a");	
	}	
}
class b extends a
{
	static void two()
	{
	System.out.println("Method two from class b");	
	}	
}
public class class1 extends b
{
	
	static void three()
	{
		System.out.println("Method three from class class1");
	
	}

	public static void main (String[] args)
	{
		three(); //calls class1
		two(); //calls b
		one();// calls a
	}	
}
