package package1;

public class NonStatic_Parameter
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void subtract(int a,int b)
	{
		System.out.println(a-b);
	}
	void multiplication(int a,int b)
	{
		System.out.println(a*b);
	}
public static void main(String[] args)
{
		NonStatic_Parameter n=new NonStatic_Parameter();
		n.add(100,50);
		n.subtract(90,45);
		n.multiplication(50,80);
}
}
