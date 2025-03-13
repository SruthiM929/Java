package package1;
import java.util.Enumeration;
import java.util.Vector;

public class Enumerationexample 
{
	public static void main(String[] args)
	{
	Vector v=new Vector();
	v.add(5);
	v.add("Shiv");
	v.add(12.3);
	Enumeration e=v.elements();
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
	}

}
