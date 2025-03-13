package package1;
//using Scanner class
import java.util.Scanner;

public class Circumferenceofacircle 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the radius of the cicle:");
		
		double radius= s1.nextDouble();
		double circumference =2 * Math.PI *radius;
		
		System.out.println("The circumference of the circle is:");
		System.out.println(circumference);
		s1.close();
	}

}
