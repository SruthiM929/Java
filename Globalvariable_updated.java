package package1;
//Updated static and non-static variable
public class Globalvariable_updated
{
	int s=10;
	static int q=23;
	public static void main(String[] args)
	{
		Globalvariable_updated g1=new Globalvariable_updated();
		g1.s=100;
		System.out.println(g1.s);
		 q=50;
		System.out.println(q);
		
	}

}