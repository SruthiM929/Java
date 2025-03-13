package package1;
class ParentClass
{
	static void add()
	{
	System.out.println("add");	
	}
}

public class Student_Class extends ParentClass
{
	static void sub()
	{
	System.out.println("sub");		
	}

public static void main(String[] args) 
{
	sub();
	add();
}
}
