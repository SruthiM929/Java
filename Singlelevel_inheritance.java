package package1;
//single level inheritance
class rat
{
	void eat()
	{
		System.out.println("rat is eating cheese");
	}
}
class cat extends rat
{
	void catchrat()
	{
		System.out.println("cat is trying to catch the rat");
	}
}
public class Singlelevel_inheritance
{
	public static void main(String[] args)
	{
	cat s1=new cat();
	s1.eat(); //inherited from rat
	s1.catchrat(); //inherited from cat
		
	}

}
