package package1;
//Declaing variable inside static and Non-static method in local variable
public class Localvariable 
{
	static void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
		
	}
	void sub(int k,int x)
	{
		int y;
		y=k-x;
		System.out.println(y);
	}
public static void main(String[] args)
{
	add(40,52);
	Localvariable L1=new Localvariable();
	L1.sub(90, 40);

	
}
}
