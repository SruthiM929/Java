package package1;

public class Methodoverloading 
{
	static void add(double a,int b)
	{
		System.out.println("a+b");
			
	}
	static void sub(char c,boolean d)
	{
		System.out.println("a-b");
	}
	void add(String w)
	{
		System.out.println("W");
	}
	void add(String h,char p)
	{
		System.out.println("h+p");
	}
	public static void main(String[] args)
	{
		add(2.9,8);
		sub('m',true);
		Methodoverloading M1=new Methodoverloading();
		M1.add("Sai");
		M1.add("hari",'k');
		
	}
}
