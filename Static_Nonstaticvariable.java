package package1;
//Global variable
public class Static_Nonstaticvariable 
{
	static int x=9;
	int y=15;
	public static void StaticMethod()
	{
		System.out.println("Static Method");
		System.out.println(x);
	}
	public void NonStaticMethod()
	{
		System.out.println("NonStatic Method");
		System.out.println(y);
	}
	public static void main(String[] args) 
	{
		StaticMethod();
		Static_Nonstaticvariable S1=new Static_Nonstaticvariable();
		S1.NonStaticMethod();
		
	}

}
