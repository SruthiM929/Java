package package1;
//inheritance concept-
class Amazon1
{
	Amazon1(String un,String pwd)
	{
		System.out.println("this is Parent Constructor");
	}
}	
public class Amazon extends Amazon1
{
	Amazon()
	{
		super("Sruthim@","Flower23");
		System.out.println("This is child constructor");
		
	}
public static void main(String[] args)
	{
		new Amazon();
	}
}






