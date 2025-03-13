package package1;
//Super () calling statement with no parameter
class Animal
{
	Animal()
	{
		System.out.println("Animal constructor is called");
	}
}

public class Dog extends Animal
{
	Dog()
	{
	 super();
	System.out.println("Dog constructor is called");
	}
public static void main(String[] args)
	{
	Dog D=new Dog();	
	}
}