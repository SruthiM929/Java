package package1;

public class Assignment18
{
public static void main(String[] args) 
{
	int age=18;
	
	if(age>=18 && age<=90)
	{
		System.out.println("eligible to vote");
	}
	else if(age<18)
	{
		System.out.println("Not eligible to vote because under age");
	}
	else
	{
		System.out.println("valid age");
	}
}
}
