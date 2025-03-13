package package1;
interface Snapdeal_1
{
	// a Abstract method please add
	void add(int a,int b);
	void sub(int x,int y);
}
public class Snapdeal_Class implements Snapdeal_1
{
	public static void main(String[] args) 
	{
		Snapdeal_Class s=new Snapdeal_Class();
		s.add(6,8);
		s.sub(9,4);
	}
	public void add(int a,int b) 
	{
	int sum=a+b;
	System.out.println("Add Total");
	System.out.println(sum);
		
	}
	public void sub(int x,int y) 
	{
		int substract=x-y;
		System.out.println("Total");
		System.out.println(substract);	
		
	}

}
