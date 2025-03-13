package package1;

public class Nonstaticmethod_4 
{
	void Fathername(String a)
	{
		System.out.println(a);
	}
	void Mothername(String b)
	{
		System.out.println(b);
	}
	void Daughtername(String c)
	{
		System.out.println(c);	
	}
	void Familymembers(int d)
	{
		System.out.println(d);
	}
	public static void main(String[] args)
	{
		Nonstaticmethod_4 W=new Nonstaticmethod_4();
		W.Fathername("Sadasivudu");
		W.Mothername("Shailaja");
		W.Daughtername("Sruthi");
		W.Familymembers(5);
	}

}
