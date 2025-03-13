package package1;

import java.util.Scanner;

public class AreaofTriangle
{
	public static void main(String[] args)
	{
		Scanner	s1=new Scanner(System.in);
		System.out.println("Enter the base of the Triangle:");
		double base=s1.nextDouble();
		
		System.out.println("Enter the height of the Triangle:");
		double height=s1.nextDouble();
		
		double area=(base*height)/2;
		System.out.println("Area of the Triangle: ");
		System.out.println(area);
	}
	

}
