package package1;

public class Static_Nonstaticmethod 
{
	static void firstname()
	{
		System.out.println("Anusha");
	}
	static void lastname()
	{
		System.out.println("Gudupally");
	}
	static void place()
	{
		System.out.println("Zaheerabad");
	}
	void age()
	{
		System.out.println("18");
	}
	void pincode()
	{
		System.out.println("502220");
	}
	public static void main(String[] args) 
	{
		firstname();
		lastname();
		place();
		Static_Nonstaticmethod b=new Static_Nonstaticmethod();
		b.age();
		b.pincode();
	}
	
}
